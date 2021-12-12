diff --git a/handler/src/main/java/io/netty/handler/ssl/OpenSslClientContext.java b/handler/src/main/java/io/netty/handler/ssl/OpenSslClientContext.java
index ddaa62f..6d50884 100644
--- a/handler/src/main/java/io/netty/handler/ssl/OpenSslClientContext.java
+++ b/handler/src/main/java/io/netty/handler/ssl/OpenSslClientContext.java
@@ -184,8 +184,8 @@
             }
             synchronized (OpenSslContext.class) {
                 if (trustCertChainFile != null) {
-                    /* Load the certificate chain. We must skip the first cert when server mode */
-                    if (!SSLContext.setCertificateChainFile(ctx, trustCertChainFile.getPath(), true)) {
+                    /* Load the certificate chain. We must NOT skip the first cert when client mode */
+                    if (!SSLContext.setCertificateChainFile(ctx, trustCertChainFile.getPath(), false)) {
                         long error = SSL.getLastErrorNumber();
                         if (OpenSsl.isError(error)) {
                             throw new SSLException(
