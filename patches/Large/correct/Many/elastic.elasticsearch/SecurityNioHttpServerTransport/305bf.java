diff --git a/x-pack/plugin/security/src/main/java/org/elasticsearch/xpack/security/transport/nio/SecurityNioHttpServerTransport.java b/x-pack/plugin/security/src/main/java/org/elasticsearch/xpack/security/transport/nio/SecurityNioHttpServerTransport.java
index 006c78b..50a78d9 100644
--- a/x-pack/plugin/security/src/main/java/org/elasticsearch/xpack/security/transport/nio/SecurityNioHttpServerTransport.java
+++ b/x-pack/plugin/security/src/main/java/org/elasticsearch/xpack/security/transport/nio/SecurityNioHttpServerTransport.java
@@ -59,7 +59,7 @@
         this.sslEnabled = HTTP_SSL_ENABLED.get(settings);
         this.sslService = sslService;
         if (sslEnabled) {
-            this.sslConfiguration = sslService.sslConfiguration(SSLService.getHttpTransportSSLSettings(settings), Settings.EMPTY);
+            this.sslConfiguration = sslService.getHttpTransportSSLConfiguration();
             if (sslService.isConfigurationValidForServerUsage(sslConfiguration) == false) {
                 throw new IllegalArgumentException("a key must be provided to run as a server. the key should be configured using the " +
                     "[xpack.security.http.ssl.key] or [xpack.security.http.ssl.keystore.path] setting");
