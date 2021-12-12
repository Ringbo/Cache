diff --git a/spring-webflux/src/main/java/org/springframework/web/reactive/resource/VersionResourceResolver.java b/spring-webflux/src/main/java/org/springframework/web/reactive/resource/VersionResourceResolver.java
index 6d6d459..a4c2634 100644
--- a/spring-webflux/src/main/java/org/springframework/web/reactive/resource/VersionResourceResolver.java
+++ b/spring-webflux/src/main/java/org/springframework/web/reactive/resource/VersionResourceResolver.java
@@ -159,7 +159,7 @@
 			List<? extends Resource> locations, ResourceResolverChain chain) {
 
 		return chain.resolveResource(exchange, requestPath, locations)
-				.otherwiseIfEmpty(Mono.defer(() ->
+				.switchIfEmpty(Mono.defer(() ->
 						resolveVersionedResource(exchange, requestPath, locations, chain)));
 	}
 
