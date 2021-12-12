diff --git a/src/main/java/com/ning/http/client/AsyncHttpClientConfig.java b/src/main/java/com/ning/http/client/AsyncHttpClientConfig.java
index 87f85bf..be78015 100644
--- a/src/main/java/com/ning/http/client/AsyncHttpClientConfig.java
+++ b/src/main/java/com/ning/http/client/AsyncHttpClientConfig.java
@@ -42,7 +42,7 @@
  */
 public class AsyncHttpClientConfig {
 
-    private final static String ASYNC_CLIENT = AsyncHttpClient.class.getName() + ".";
+    private final static String ASYNC_CLIENT = AsyncHttpClientConfig.class.getName() + ".";
 
     private final int maxTotalConnections;
     private final int maxConnectionPerHost;
