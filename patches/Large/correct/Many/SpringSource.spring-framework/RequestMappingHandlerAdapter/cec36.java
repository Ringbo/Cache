diff --git a/spring-webflux/src/main/java/org/springframework/web/reactive/result/method/annotation/RequestMappingHandlerAdapter.java b/spring-webflux/src/main/java/org/springframework/web/reactive/result/method/annotation/RequestMappingHandlerAdapter.java
index 844a985..0a24e04 100644
--- a/spring-webflux/src/main/java/org/springframework/web/reactive/result/method/annotation/RequestMappingHandlerAdapter.java
+++ b/spring-webflux/src/main/java/org/springframework/web/reactive/result/method/annotation/RequestMappingHandlerAdapter.java
@@ -189,7 +189,7 @@
 				.then(() -> this.methodResolver.getRequestMappingMethod(handlerMethod)
 						.invoke(exchange, bindingContext)
 						.doOnNext(result -> result.setExceptionHandler(exceptionHandler))
-						.otherwise(exceptionHandler));
+						.switchOnError(exceptionHandler));
 	}
 
 	private Mono<HandlerResult> handleException(Throwable ex, HandlerMethod handlerMethod,
