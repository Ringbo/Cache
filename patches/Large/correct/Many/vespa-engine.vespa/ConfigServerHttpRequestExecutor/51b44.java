diff --git a/node-admin/src/main/java/com/yahoo/vespa/hosted/node/admin/util/ConfigServerHttpRequestExecutor.java b/node-admin/src/main/java/com/yahoo/vespa/hosted/node/admin/util/ConfigServerHttpRequestExecutor.java
index c5144f1..954de4b 100644
--- a/node-admin/src/main/java/com/yahoo/vespa/hosted/node/admin/util/ConfigServerHttpRequestExecutor.java
+++ b/node-admin/src/main/java/com/yahoo/vespa/hosted/node/admin/util/ConfigServerHttpRequestExecutor.java
@@ -185,7 +185,7 @@
                     makeSslContext(keyStoreOptions, trustStoreOptions), NoopHostnameVerifier.INSTANCE);
             return new SelfCloseableHttpClient(sslSocketFactory);
         } catch (Exception e) {
-            NODE_ADMIN_LOGGER.error("Failed to create HTTP client with custom SSL Context, proceeding with default");
+            NODE_ADMIN_LOGGER.error("Failed to create HTTP client with custom SSL Context, proceeding with default", e);
             return new SelfCloseableHttpClient();
         }
     }
