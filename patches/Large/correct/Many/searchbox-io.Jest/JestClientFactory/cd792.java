diff --git a/jest/src/main/java/io/searchbox/client/JestClientFactory.java b/jest/src/main/java/io/searchbox/client/JestClientFactory.java
index f4d16da..f384f92 100755
--- a/jest/src/main/java/io/searchbox/client/JestClientFactory.java
+++ b/jest/src/main/java/io/searchbox/client/JestClientFactory.java
@@ -149,7 +149,7 @@
     // Extension point
     protected RequestConfig getRequestConfig() {
         return RequestConfig.custom()
-                .setConnectionRequestTimeout(httpClientConfig.getConnTimeout())
+                .setConnectTimeout(httpClientConfig.getConnTimeout())
                 .setSocketTimeout(httpClientConfig.getReadTimeout())
                 .build();
     }
