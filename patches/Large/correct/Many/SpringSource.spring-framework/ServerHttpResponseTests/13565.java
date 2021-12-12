diff --git a/spring-web/src/test/java/org/springframework/http/server/reactive/ServerHttpResponseTests.java b/spring-web/src/test/java/org/springframework/http/server/reactive/ServerHttpResponseTests.java
index 6d22304..b5c81ba 100644
--- a/spring-web/src/test/java/org/springframework/http/server/reactive/ServerHttpResponseTests.java
+++ b/spring-web/src/test/java/org/springframework/http/server/reactive/ServerHttpResponseTests.java
@@ -96,7 +96,7 @@
 	public void writeWithError() throws Exception {
 		TestServerHttpResponse response = new TestServerHttpResponse();
 		IllegalStateException error = new IllegalStateException("boo");
-		response.writeWith(Flux.error(error)).switchOnError(ex -> Mono.empty()).block();
+		response.writeWith(Flux.error(error)).onErrorResume(ex -> Mono.empty()).block();
 
 		assertFalse(response.statusCodeWritten);
 		assertFalse(response.headersWritten);
