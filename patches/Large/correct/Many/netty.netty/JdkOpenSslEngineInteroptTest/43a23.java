diff --git a/handler/src/test/java/io/netty/handler/ssl/JdkOpenSslEngineInteroptTest.java b/handler/src/test/java/io/netty/handler/ssl/JdkOpenSslEngineInteroptTest.java
index 06dcef0..0c874b1 100644
--- a/handler/src/test/java/io/netty/handler/ssl/JdkOpenSslEngineInteroptTest.java
+++ b/handler/src/test/java/io/netty/handler/ssl/JdkOpenSslEngineInteroptTest.java
@@ -88,6 +88,6 @@
     @Override
     protected boolean mySetupMutualAuthServerIsValidClientException(Throwable cause) {
         // TODO(scott): work around for a JDK issue. The exception should be SSLHandshakeException.
-        return super.mySetupMutualAuthServerIsValidException(cause) || cause instanceof SSLException;
+        return super.mySetupMutualAuthServerIsValidClientException(cause) || cause instanceof SSLException;
     }
 }
