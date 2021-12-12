diff --git a/spring-webflux/src/main/java/org/springframework/web/reactive/resource/ResourceWebHandler.java b/spring-webflux/src/main/java/org/springframework/web/reactive/resource/ResourceWebHandler.java
index 9009ed2..405d7f6 100644
--- a/spring-webflux/src/main/java/org/springframework/web/reactive/resource/ResourceWebHandler.java
+++ b/spring-webflux/src/main/java/org/springframework/web/reactive/resource/ResourceWebHandler.java
@@ -276,7 +276,7 @@
 	public Mono<Void> handle(ServerWebExchange exchange) {
 
 		return getResource(exchange)
-				.otherwiseIfEmpty(Mono.defer(() -> {
+				.switchIfEmpty(Mono.defer(() -> {
 					logger.trace("No matching resource found - returning 404");
 					exchange.getResponse().setStatusCode(HttpStatus.NOT_FOUND);
 					return Mono.empty();
