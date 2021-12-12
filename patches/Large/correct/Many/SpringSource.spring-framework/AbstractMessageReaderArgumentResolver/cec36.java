diff --git a/spring-webflux/src/main/java/org/springframework/web/reactive/result/method/annotation/AbstractMessageReaderArgumentResolver.java b/spring-webflux/src/main/java/org/springframework/web/reactive/result/method/annotation/AbstractMessageReaderArgumentResolver.java
index 451d497..c90b074 100644
--- a/spring-webflux/src/main/java/org/springframework/web/reactive/result/method/annotation/AbstractMessageReaderArgumentResolver.java
+++ b/spring-webflux/src/main/java/org/springframework/web/reactive/result/method/annotation/AbstractMessageReaderArgumentResolver.java
@@ -130,9 +130,9 @@
 				}
 				else {
 					Mono<?> mono = reader.readMono(bodyType, elementType, request, response, readHints);
-					mono = mono.otherwise(ex -> Mono.error(getReadError(bodyParameter, ex)));
+					mono = mono.switchOnError(ex -> Mono.error(getReadError(bodyParameter, ex)));
 					if (isBodyRequired || (adapter != null && !adapter.supportsEmpty())) {
-						mono = mono.otherwiseIfEmpty(Mono.error(getRequiredBodyError(bodyParameter)));
+						mono = mono.switchIfEmpty(Mono.error(getRequiredBodyError(bodyParameter)));
 					}
 					Object[] hints = extractValidationHints(bodyParameter);
 					if (hints != null) {
