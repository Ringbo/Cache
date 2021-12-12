diff --git a/src/main/java/com/ning/http/util/SslUtils.java b/src/main/java/com/ning/http/util/SslUtils.java
index 90897b0..55cd47d 100644
--- a/src/main/java/com/ning/http/util/SslUtils.java
+++ b/src/main/java/com/ning/http/util/SslUtils.java
@@ -51,7 +51,7 @@
     public static SSLContext getSSLContext()
             throws GeneralSecurityException, IOException {
         SSLConfig config = new SSLConfig();
-        if (config.keyStoreLocation == null || config.trustStoreLocation != null) {
+        if (config.keyStoreLocation == null || config.trustStoreLocation == null) {
             return getLooseSSLContext();
         } else {
             return getStrictSSLContext(config);
