diff --git a/spring-webflux/src/main/java/org/springframework/web/reactive/resource/WebJarsResourceResolver.java b/spring-webflux/src/main/java/org/springframework/web/reactive/resource/WebJarsResourceResolver.java
index 7fa1422..710ba37 100644
--- a/spring-webflux/src/main/java/org/springframework/web/reactive/resource/WebJarsResourceResolver.java
+++ b/spring-webflux/src/main/java/org/springframework/web/reactive/resource/WebJarsResourceResolver.java
@@ -75,7 +75,7 @@
 			List<? extends Resource> locations, ResourceResolverChain chain) {
 
 		return chain.resolveResource(exchange, requestPath, locations)
-				.otherwiseIfEmpty(Mono.defer(() -> {
+				.switchIfEmpty(Mono.defer(() -> {
 					String webJarsResourcePath = findWebJarResourcePath(requestPath);
 					if (webJarsResourcePath != null) {
 						return chain.resolveResource(exchange, webJarsResourcePath, locations);
@@ -91,7 +91,7 @@
 			List<? extends Resource> locations, ResourceResolverChain chain) {
 
 		return chain.resolveUrlPath(resourceUrlPath, locations)
-				.otherwiseIfEmpty(Mono.defer(() -> {
+				.switchIfEmpty(Mono.defer(() -> {
 					String webJarResourcePath = findWebJarResourcePath(resourceUrlPath);
 					if (webJarResourcePath != null) {
 						return chain.resolveUrlPath(webJarResourcePath, locations);
