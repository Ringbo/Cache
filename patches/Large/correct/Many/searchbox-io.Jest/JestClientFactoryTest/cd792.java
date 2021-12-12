diff --git a/jest/src/test/java/io/searchbox/client/JestClientFactoryTest.java b/jest/src/test/java/io/searchbox/client/JestClientFactoryTest.java
index 79ca2c1..b151eaf 100755
--- a/jest/src/test/java/io/searchbox/client/JestClientFactoryTest.java
+++ b/jest/src/test/java/io/searchbox/client/JestClientFactoryTest.java
@@ -28,7 +28,7 @@
         factory.setHttpClientConfig(httpClientConfig);
         final RequestConfig defaultRequestConfig = factory.getRequestConfig();
         assertNotNull(defaultRequestConfig);
-        assertEquals(150, defaultRequestConfig.getConnectionRequestTimeout());
+        assertEquals(150, defaultRequestConfig.getConnectTimeout());
         assertEquals(300, defaultRequestConfig.getSocketTimeout());
     }
 
