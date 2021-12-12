diff --git a/spring-web/src/main/java/org/springframework/http/server/reactive/RxNettyHttpHandlerAdapter.java b/spring-web/src/main/java/org/springframework/http/server/reactive/RxNettyHttpHandlerAdapter.java
index 72ccd41..57978cb 100644
--- a/spring-web/src/main/java/org/springframework/http/server/reactive/RxNettyHttpHandlerAdapter.java
+++ b/spring-web/src/main/java/org/springframework/http/server/reactive/RxNettyHttpHandlerAdapter.java
@@ -66,7 +66,7 @@
 		RxNettyServerHttpResponse response = new RxNettyServerHttpResponse(nativeResponse, bufferFactory);
 
 		Publisher<Void> result = this.httpHandler.handle(request, response)
-				.otherwise(ex -> {
+				.switchOnError(ex -> {
 					logger.error("Could not complete request", ex);
 					nativeResponse.setStatus(HttpResponseStatus.INTERNAL_SERVER_ERROR);
 					return Mono.empty();
