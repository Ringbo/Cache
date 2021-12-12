diff --git a/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/HandlerFilterFunction.java b/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/HandlerFilterFunction.java
index 5f4fed5..df331e3 100644
--- a/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/HandlerFilterFunction.java
+++ b/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/HandlerFilterFunction.java
@@ -92,10 +92,10 @@
 	 * @return the filter adaptation of the request processor
 	 */
 	static <T extends ServerResponse, R extends ServerResponse> HandlerFilterFunction<T, R> ofResponseProcessor(
-			Function<T, R> responseProcessor) {
+			Function<T, Mono<R>> responseProcessor) {
 
 		Assert.notNull(responseProcessor, "'responseProcessor' must not be null");
-		return (request, next) -> next.handle(request).map(responseProcessor);
+		return (request, next) -> next.handle(request).then(responseProcessor);
 	}
 
 
