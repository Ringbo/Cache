diff --git a/spring-web/src/main/java/org/springframework/http/server/reactive/ReactorHttpHandlerAdapter.java b/spring-web/src/main/java/org/springframework/http/server/reactive/ReactorHttpHandlerAdapter.java
index 027a435..cf010ae 100644
--- a/spring-web/src/main/java/org/springframework/http/server/reactive/ReactorHttpHandlerAdapter.java
+++ b/spring-web/src/main/java/org/springframework/http/server/reactive/ReactorHttpHandlerAdapter.java
@@ -57,7 +57,7 @@
 		ReactorServerHttpResponse resp = new ReactorServerHttpResponse(response, bufferFactory);
 
 		return this.httpHandler.handle(req, resp)
-				.otherwise(ex -> {
+				.switchOnError(ex -> {
 					logger.error("Could not complete request", ex);
 					response.status(HttpResponseStatus.INTERNAL_SERVER_ERROR);
 					return Mono.empty();
