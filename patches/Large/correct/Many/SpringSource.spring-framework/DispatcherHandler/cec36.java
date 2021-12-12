diff --git a/spring-webflux/src/main/java/org/springframework/web/reactive/DispatcherHandler.java b/spring-webflux/src/main/java/org/springframework/web/reactive/DispatcherHandler.java
index fe45719..08c42e5 100644
--- a/spring-webflux/src/main/java/org/springframework/web/reactive/DispatcherHandler.java
+++ b/spring-webflux/src/main/java/org/springframework/web/reactive/DispatcherHandler.java
@@ -125,7 +125,7 @@
 		return Flux.fromIterable(this.handlerMappings)
 				.concatMap(mapping -> mapping.getHandler(exchange))
 				.next()
-				.otherwiseIfEmpty(Mono.error(HANDLER_NOT_FOUND_EXCEPTION))
+				.switchIfEmpty(Mono.error(HANDLER_NOT_FOUND_EXCEPTION))
 				.flatMap(handler -> invokeHandler(exchange, handler))
 				.flatMap(result -> handleResult(exchange, result));
 	}
@@ -141,7 +141,7 @@
 
 	private Mono<Void> handleResult(ServerWebExchange exchange, HandlerResult result) {
 		return getResultHandler(result).handleResult(exchange, result)
-				.otherwise(ex -> result.applyExceptionHandler(ex).flatMap(exceptionResult ->
+				.switchOnError(ex -> result.applyExceptionHandler(ex).flatMap(exceptionResult ->
 						getResultHandler(exceptionResult).handleResult(exchange, exceptionResult)));
 	}
 
