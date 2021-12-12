diff --git a/spring-webflux/src/main/java/org/springframework/web/reactive/result/view/ViewResolutionResultHandler.java b/spring-webflux/src/main/java/org/springframework/web/reactive/result/view/ViewResolutionResultHandler.java
index 50545a1..b1502b0 100644
--- a/spring-webflux/src/main/java/org/springframework/web/reactive/result/view/ViewResolutionResultHandler.java
+++ b/spring-webflux/src/main/java/org/springframework/web/reactive/result/view/ViewResolutionResultHandler.java
@@ -193,7 +193,7 @@
 		}
 
 		return valueMono
-				.otherwiseIfEmpty(exchange.isNotModified() ? Mono.empty() : NO_VALUE_MONO)
+				.switchIfEmpty(exchange.isNotModified() ? Mono.empty() : NO_VALUE_MONO)
 				.flatMap(returnValue -> {
 
 					Mono<List<View>> viewsMono;
