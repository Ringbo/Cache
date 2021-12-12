diff --git a/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/DefaultServerRequest.java b/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/DefaultServerRequest.java
index 0a77a91..b40e3c3 100644
--- a/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/DefaultServerRequest.java
+++ b/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/DefaultServerRequest.java
@@ -120,13 +120,13 @@
 	@Override
 	public <T> Mono<T> bodyToMono(Class<? extends T> elementClass) {
 		Mono<T> mono = body(BodyExtractors.toMono(elementClass));
-		return mono.mapError(UnsupportedMediaTypeException.class, ERROR_MAPPER);
+		return mono.onErrorMap(UnsupportedMediaTypeException.class, ERROR_MAPPER);
 	}
 
 	@Override
 	public <T> Flux<T> bodyToFlux(Class<? extends T> elementClass) {
 		Flux<T> flux = body(BodyExtractors.toFlux(elementClass));
-		return flux.mapError(UnsupportedMediaTypeException.class, ERROR_MAPPER);
+		return flux.onErrorMap(UnsupportedMediaTypeException.class, ERROR_MAPPER);
 	}
 
 	@Override
