diff --git a/spring-web/src/main/java/org/springframework/http/server/reactive/ReactorHttpHandlerAdapter.java b/spring-web/src/main/java/org/springframework/http/server/reactive/ReactorHttpHandlerAdapter.java
index cf010ae..043c7ef 100644
--- a/spring-web/src/main/java/org/springframework/http/server/reactive/ReactorHttpHandlerAdapter.java
+++ b/spring-web/src/main/java/org/springframework/http/server/reactive/ReactorHttpHandlerAdapter.java
@@ -57,7 +57,7 @@
 		ReactorServerHttpResponse resp = new ReactorServerHttpResponse(response, bufferFactory);
 
 		return this.httpHandler.handle(req, resp)
-				.switchOnError(ex -> {
+				.onErrorResume(ex -> {
 					logger.error("Could not complete request", ex);
 					response.status(HttpResponseStatus.INTERNAL_SERVER_ERROR);
 					return Mono.empty();
