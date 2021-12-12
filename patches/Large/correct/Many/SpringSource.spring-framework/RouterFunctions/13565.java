diff --git a/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/RouterFunctions.java b/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/RouterFunctions.java
index eca10d5..60e1543 100644
--- a/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/RouterFunctions.java
+++ b/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/RouterFunctions.java
@@ -234,7 +234,7 @@
 					.defaultIfEmpty(notFound())
 					.flatMap(handlerFunction -> wrapException(() -> handlerFunction.handle(request)))
 					.flatMap(response -> wrapException(() -> response.writeTo(exchange, strategies)))
-					.switchOnError(ResponseStatusException.class,
+					.onErrorResume(ResponseStatusException.class,
 							ex -> {
 								exchange.getResponse().setStatusCode(ex.getStatus());
 								if (ex.getMessage() != null) {
