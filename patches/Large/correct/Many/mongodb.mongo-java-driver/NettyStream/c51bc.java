diff --git a/driver-core/src/main/com/mongodb/connection/netty/NettyStream.java b/driver-core/src/main/com/mongodb/connection/netty/NettyStream.java
index 71140bf..7a96d48 100644
--- a/driver-core/src/main/com/mongodb/connection/netty/NettyStream.java
+++ b/driver-core/src/main/com/mongodb/connection/netty/NettyStream.java
@@ -115,7 +115,7 @@
             @Override
             public void initChannel(final SocketChannel ch) throws Exception {
                 if (sslSettings.isEnabled()) {
-                    SSLEngine engine = SSLContext.getDefault().createSSLEngine();
+                    SSLEngine engine = SSLContext.getDefault().createSSLEngine(address.getHost(), address.getPort());
                     engine.setUseClientMode(true);
                     if (!sslSettings.isInvalidHostNameAllowed()) {
                         engine.setSSLParameters(enableHostNameVerification(engine.getSSLParameters()));
