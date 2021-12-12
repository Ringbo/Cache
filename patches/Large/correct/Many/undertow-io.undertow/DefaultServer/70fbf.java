diff --git a/core/src/test/java/io/undertow/testutils/DefaultServer.java b/core/src/test/java/io/undertow/testutils/DefaultServer.java
index c6481ef..345e90e 100644
--- a/core/src/test/java/io/undertow/testutils/DefaultServer.java
+++ b/core/src/test/java/io/undertow/testutils/DefaultServer.java
@@ -791,7 +791,9 @@
 
     private static boolean isAlpnEnabled() {
         if (alpnEnabled == null) {
-            SSLEngine engine = getServerSslContext().createSSLEngine();
+            //we use the client context, as the server one is wrapped by a SNISSLEngine
+            //so we can't tell that ALPN is enabled or now
+            SSLEngine engine = getClientSSLContext().createSSLEngine();
             ALPNProvider provider = ALPNManager.INSTANCE.getProvider(engine);
             if (provider instanceof JettyAlpnProvider) {
                 alpnEnabled = System.getProperty("alpn-boot-string") != null;
