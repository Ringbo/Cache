diff --git a/spring-webflux/src/main/java/org/springframework/web/reactive/result/method/annotation/RequestMappingHandlerAdapter.java b/spring-webflux/src/main/java/org/springframework/web/reactive/result/method/annotation/RequestMappingHandlerAdapter.java
index 0a24e04..a158554 100644
--- a/spring-webflux/src/main/java/org/springframework/web/reactive/result/method/annotation/RequestMappingHandlerAdapter.java
+++ b/spring-webflux/src/main/java/org/springframework/web/reactive/result/method/annotation/RequestMappingHandlerAdapter.java
@@ -189,7 +189,7 @@
 				.then(() -> this.methodResolver.getRequestMappingMethod(handlerMethod)
 						.invoke(exchange, bindingContext)
 						.doOnNext(result -> result.setExceptionHandler(exceptionHandler))
-						.switchOnError(exceptionHandler));
+						.onErrorResume(exceptionHandler));
 	}
 
 	private Mono<HandlerResult> handleException(Throwable ex, HandlerMethod handlerMethod,
