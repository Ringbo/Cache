diff --git a/spring-web-reactive/src/main/java/org/springframework/web/reactive/function/client/DefaultWebClientOperations.java b/spring-web-reactive/src/main/java/org/springframework/web/reactive/function/client/DefaultWebClientOperations.java
index 0c06efe..95d5ffe 100644
--- a/spring-web-reactive/src/main/java/org/springframework/web/reactive/function/client/DefaultWebClientOperations.java
+++ b/spring-web-reactive/src/main/java/org/springframework/web/reactive/function/client/DefaultWebClientOperations.java
@@ -129,7 +129,7 @@
 
 		@Override
 		public HeaderSpec uri(String uriTemplate, Object... uriVariables) {
-			return uri(getUriBuilderFactory().expand(uriTemplate));
+			return uri(getUriBuilderFactory().expand(uriTemplate, uriVariables));
 		}
 
 		@Override
