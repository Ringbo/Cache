diff --git a/dropwizard-client/src/main/java/io/dropwizard/client/DropwizardSSLConnectionSocketFactory.java b/dropwizard-client/src/main/java/io/dropwizard/client/DropwizardSSLConnectionSocketFactory.java
index 431cf0d..f87210e 100644
--- a/dropwizard-client/src/main/java/io/dropwizard/client/DropwizardSSLConnectionSocketFactory.java
+++ b/dropwizard-client/src/main/java/io/dropwizard/client/DropwizardSSLConnectionSocketFactory.java
@@ -90,7 +90,7 @@
         sslContextBuilder.loadTrustMaterial(trustStore, trustStrategy);
     }
 
-    private KeyStore loadKeyStore(String type, File path, String password) throws Exception {
+    private static KeyStore loadKeyStore(String type, File path, String password) throws Exception {
         final KeyStore keyStore = KeyStore.getInstance(type);
         try (InputStream inputStream = new FileInputStream(path)) {
             keyStore.load(inputStream, password.toCharArray());
