diff --git a/spring-webflux/src/main/java/org/springframework/web/reactive/DispatcherHandler.java b/spring-webflux/src/main/java/org/springframework/web/reactive/DispatcherHandler.java
index 08c42e5..ea16fef 100644
--- a/spring-webflux/src/main/java/org/springframework/web/reactive/DispatcherHandler.java
+++ b/spring-webflux/src/main/java/org/springframework/web/reactive/DispatcherHandler.java
@@ -141,7 +141,7 @@
 
 	private Mono<Void> handleResult(ServerWebExchange exchange, HandlerResult result) {
 		return getResultHandler(result).handleResult(exchange, result)
-				.switchOnError(ex -> result.applyExceptionHandler(ex).flatMap(exceptionResult ->
+				.onErrorResume(ex -> result.applyExceptionHandler(ex).flatMap(exceptionResult ->
 						getResultHandler(exceptionResult).handleResult(exchange, exceptionResult)));
 	}
 
