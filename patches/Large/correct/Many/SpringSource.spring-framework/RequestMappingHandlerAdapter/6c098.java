diff --git a/spring-web-reactive/src/main/java/org/springframework/web/reactive/result/method/annotation/RequestMappingHandlerAdapter.java b/spring-web-reactive/src/main/java/org/springframework/web/reactive/result/method/annotation/RequestMappingHandlerAdapter.java
index 43ec18e..4eff186 100644
--- a/spring-web-reactive/src/main/java/org/springframework/web/reactive/result/method/annotation/RequestMappingHandlerAdapter.java
+++ b/spring-web-reactive/src/main/java/org/springframework/web/reactive/result/method/annotation/RequestMappingHandlerAdapter.java
@@ -273,7 +273,7 @@
 		resolvers.add(new ServerWebExchangeArgumentResolver());
 
 		// Custom resolvers
-		if (getCustomArgumentResolvers() != null) {
+		if (getCustomInitBinderArgumentResolvers() != null) {
 			resolvers.addAll(getCustomInitBinderArgumentResolvers());
 		}
 
