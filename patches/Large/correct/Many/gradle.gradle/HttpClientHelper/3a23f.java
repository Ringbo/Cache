diff --git a/subprojects/resources-http/src/main/java/org/gradle/internal/resource/transport/http/HttpClientHelper.java b/subprojects/resources-http/src/main/java/org/gradle/internal/resource/transport/http/HttpClientHelper.java
index 2ea9271..2bf0cb0 100644
--- a/subprojects/resources-http/src/main/java/org/gradle/internal/resource/transport/http/HttpClientHelper.java
+++ b/subprojects/resources-http/src/main/java/org/gradle/internal/resource/transport/http/HttpClientHelper.java
@@ -116,7 +116,7 @@
         return response;
     }
 
-    private CloseableHttpClient getClient() {
+    private synchronized CloseableHttpClient getClient() {
         if (client == null) {
             HttpClientBuilder builder = HttpClientBuilder.create();
             builder.setRedirectStrategy(new AlwaysRedirectRedirectStrategy());
