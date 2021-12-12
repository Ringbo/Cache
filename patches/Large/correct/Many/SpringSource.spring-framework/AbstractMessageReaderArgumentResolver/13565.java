diff --git a/spring-webflux/src/main/java/org/springframework/web/reactive/result/method/annotation/AbstractMessageReaderArgumentResolver.java b/spring-webflux/src/main/java/org/springframework/web/reactive/result/method/annotation/AbstractMessageReaderArgumentResolver.java
index c90b074..735f3a0 100644
--- a/spring-webflux/src/main/java/org/springframework/web/reactive/result/method/annotation/AbstractMessageReaderArgumentResolver.java
+++ b/spring-webflux/src/main/java/org/springframework/web/reactive/result/method/annotation/AbstractMessageReaderArgumentResolver.java
@@ -117,7 +117,7 @@
 				Map<String, Object> readHints = Collections.emptyMap();
 				if (adapter != null && adapter.isMultiValue()) {
 					Flux<?> flux = reader.read(bodyType, elementType, request, response, readHints);
-					flux = flux.onErrorResumeWith(ex -> Flux.error(getReadError(bodyParameter, ex)));
+					flux = flux.onErrorResume(ex -> Flux.error(getReadError(bodyParameter, ex)));
 					if (isBodyRequired || !adapter.supportsEmpty()) {
 						flux = flux.switchIfEmpty(Flux.error(getRequiredBodyError(bodyParameter)));
 					}
@@ -130,7 +130,7 @@
 				}
 				else {
 					Mono<?> mono = reader.readMono(bodyType, elementType, request, response, readHints);
-					mono = mono.switchOnError(ex -> Mono.error(getReadError(bodyParameter, ex)));
+					mono = mono.onErrorResume(ex -> Mono.error(getReadError(bodyParameter, ex)));
 					if (isBodyRequired || (adapter != null && !adapter.supportsEmpty())) {
 						mono = mono.switchIfEmpty(Mono.error(getRequiredBodyError(bodyParameter)));
 					}
