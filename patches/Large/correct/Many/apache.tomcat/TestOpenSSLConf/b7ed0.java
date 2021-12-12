diff --git a/test/org/apache/tomcat/util/net/openssl/TestOpenSSLConf.java b/test/org/apache/tomcat/util/net/openssl/TestOpenSSLConf.java
index a0f68b8..e0fbe55 100644
--- a/test/org/apache/tomcat/util/net/openssl/TestOpenSSLConf.java
+++ b/test/org/apache/tomcat/util/net/openssl/TestOpenSSLConf.java
@@ -37,7 +37,7 @@
     private static final String ENABLED_CIPHER = "AES256-SHA256";
     private static final String[] EXPECTED_CIPHERS = {"AES256-SHA256"};
     private static final String[] ENABLED_PROTOCOLS = {"TLSv1.1"};
-    private static final String[] DISABLED_PROTOCOLS = {"SSLv3", "TLSv1", "TLSv1.2"};
+    private static final String[] DISABLED_PROTOCOLS = {"SSLv3", "TLSv1", "TLSv1.2", "TLSv1.3"};
 
     public SSLHostConfig initOpenSSLConfCmdCipher(String... commands) throws Exception {
         Assert.assertNotNull(commands);
@@ -78,7 +78,9 @@
 
     @Test
     public void testOpenSSLConfCmdCipher() throws Exception {
-        SSLHostConfig sslHostConfig = initOpenSSLConfCmdCipher("CipherString", ENABLED_CIPHER);
+        // Ensure TLSv1.3 ciphers aren't returned
+        SSLHostConfig sslHostConfig = initOpenSSLConfCmdCipher("CipherString", ENABLED_CIPHER,
+                "MaxProtocol", "TLSv1.2");
         String[] ciphers = sslHostConfig.getEnabledCiphers();
         Assert.assertThat("Wrong HostConfig ciphers", ciphers,
                 CoreMatchers.is(EXPECTED_CIPHERS));
