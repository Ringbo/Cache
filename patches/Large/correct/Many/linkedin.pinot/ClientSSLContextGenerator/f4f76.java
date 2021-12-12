diff --git a/pinot-common/src/main/java/com/linkedin/pinot/common/utils/ClientSSLContextGenerator.java b/pinot-common/src/main/java/com/linkedin/pinot/common/utils/ClientSSLContextGenerator.java
index eeac5b2..56d1bf5 100644
--- a/pinot-common/src/main/java/com/linkedin/pinot/common/utils/ClientSSLContextGenerator.java
+++ b/pinot-common/src/main/java/com/linkedin/pinot/common/utils/ClientSSLContextGenerator.java
@@ -60,7 +60,7 @@
   }
 
   public ClientSSLContextGenerator(Configuration sslConfig) {
-    if (sslConfig.getBoolean(CONFIG_OF_ENABLE_SERVER_VERIFICATION)) {
+    if (sslConfig.getBoolean(CONFIG_OF_ENABLE_SERVER_VERIFICATION, true)) {
       _serverCACertFile = sslConfig.getString(CONFIG_OF_SERVER_CA_CERT);
     } else {
       _serverCACertFile = null;
