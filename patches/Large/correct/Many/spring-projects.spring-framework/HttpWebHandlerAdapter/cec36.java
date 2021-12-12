diff --git a/spring-web/src/main/java/org/springframework/web/server/adapter/HttpWebHandlerAdapter.java b/spring-web/src/main/java/org/springframework/web/server/adapter/HttpWebHandlerAdapter.java
index b218a78..ffae11f 100644
--- a/spring-web/src/main/java/org/springframework/web/server/adapter/HttpWebHandlerAdapter.java
+++ b/spring-web/src/main/java/org/springframework/web/server/adapter/HttpWebHandlerAdapter.java
@@ -76,7 +76,7 @@
 	public Mono<Void> handle(ServerHttpRequest request, ServerHttpResponse response) {
 		ServerWebExchange exchange = createExchange(request, response);
 		return getDelegate().handle(exchange)
-				.otherwise(ex -> {
+				.switchOnError(ex -> {
 					if (logger.isDebugEnabled()) {
 						logger.debug("Could not complete request", ex);
 					}
