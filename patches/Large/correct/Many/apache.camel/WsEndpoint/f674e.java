diff --git a/components/camel-ahc-ws/src/main/java/org/apache/camel/component/ahc/ws/WsEndpoint.java b/components/camel-ahc-ws/src/main/java/org/apache/camel/component/ahc/ws/WsEndpoint.java
index 25f6950..0d891e4 100644
--- a/components/camel-ahc-ws/src/main/java/org/apache/camel/component/ahc/ws/WsEndpoint.java
+++ b/components/camel-ahc-ws/src/main/java/org/apache/camel/component/ahc/ws/WsEndpoint.java
@@ -112,7 +112,7 @@
             config = new DefaultAsyncHttpClientConfig.Builder().build();
             client = new DefaultAsyncHttpClient(config);
         } else {
-            client = new DefaultAsyncHttpClient();
+            client = new DefaultAsyncHttpClient(config);
         }
         return client;
     }
