diff --git a/handler/src/main/java/io/netty/handler/ssl/SslContextBuilder.java b/handler/src/main/java/io/netty/handler/ssl/SslContextBuilder.java
index e935e7c..fcc840e 100644
--- a/handler/src/main/java/io/netty/handler/ssl/SslContextBuilder.java
+++ b/handler/src/main/java/io/netty/handler/ssl/SslContextBuilder.java
@@ -31,7 +31,7 @@
      * Creates a builder for new client-side {@link SslContext}.
      */
     public static SslContextBuilder forClient() {
-        return new SslContextBuilder(true);
+        return new SslContextBuilder(false);
     }
 
     /**
@@ -41,7 +41,7 @@
      * @param keyFile a PKCS#8 private key file in PEM format
      */
     public static SslContextBuilder forServer(File keyCertChainFile, File keyFile) {
-        return new SslContextBuilder(false).keyManager(keyCertChainFile, keyFile);
+        return new SslContextBuilder(true).keyManager(keyCertChainFile, keyFile);
     }
 
     /**
@@ -54,7 +54,7 @@
      */
     public static SslContextBuilder forServer(
             File keyCertChainFile, File keyFile, String keyPassword) {
-        return new SslContextBuilder(false).keyManager(keyCertChainFile, keyFile, keyPassword);
+        return new SslContextBuilder(true).keyManager(keyCertChainFile, keyFile, keyPassword);
     }
 
     private final boolean forServer;
