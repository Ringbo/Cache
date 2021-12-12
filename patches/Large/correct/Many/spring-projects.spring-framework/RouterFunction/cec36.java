diff --git a/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/RouterFunction.java b/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/RouterFunction.java
index 73f3ca1..4f7c012 100644
--- a/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/RouterFunction.java
+++ b/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/RouterFunction.java
@@ -48,7 +48,7 @@
 	 */
 	default RouterFunction<T> and(RouterFunction<T> other) {
 		return request -> this.route(request)
-				.otherwiseIfEmpty(Mono.defer(() -> other.route(request)));
+				.switchIfEmpty(Mono.defer(() -> other.route(request)));
 	}
 
 	/**
@@ -63,7 +63,7 @@
 	default RouterFunction<?> andOther(RouterFunction<?> other) {
 		return request -> this.route(request)
 				.map(RouterFunctions::cast)
-				.otherwiseIfEmpty(
+				.switchIfEmpty(
 						Mono.defer(() -> other.route(request).map(RouterFunctions::cast)));
 	}
 
