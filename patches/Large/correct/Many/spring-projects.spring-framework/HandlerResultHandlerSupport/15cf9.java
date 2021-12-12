diff --git a/spring-webflux/src/main/java/org/springframework/web/reactive/result/HandlerResultHandlerSupport.java b/spring-webflux/src/main/java/org/springframework/web/reactive/result/HandlerResultHandlerSupport.java
index 7dea144..530ac2b 100644
--- a/spring-webflux/src/main/java/org/springframework/web/reactive/result/HandlerResultHandlerSupport.java
+++ b/spring-webflux/src/main/java/org/springframework/web/reactive/result/HandlerResultHandlerSupport.java
@@ -131,7 +131,7 @@
 		List<MediaType> result = new ArrayList<>(compatibleMediaTypes);
 		MediaType.sortBySpecificityAndQuality(result);
 
-		for (MediaType mediaType : compatibleMediaTypes) {
+		for (MediaType mediaType : result) {
 			if (mediaType.isConcrete()) {
 				return mediaType;
 			}
