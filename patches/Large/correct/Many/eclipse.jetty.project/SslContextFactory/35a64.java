diff --git a/jetty-util/src/main/java/org/eclipse/jetty/util/ssl/SslContextFactory.java b/jetty-util/src/main/java/org/eclipse/jetty/util/ssl/SslContextFactory.java
index 82f1ed2..d55ba20 100644
--- a/jetty-util/src/main/java/org/eclipse/jetty/util/ssl/SslContextFactory.java
+++ b/jetty-util/src/main/java/org/eclipse/jetty/util/ssl/SslContextFactory.java
@@ -402,7 +402,7 @@
         SSLParameters enabled=context.getDefaultSSLParameters();
         SSLParameters supported=context.getSupportedSSLParameters();
         selectCipherSuites(enabled.getCipherSuites(),supported.getCipherSuites());
-        selectProtocols(enabled.getProtocols(),enabled.getProtocols());
+        selectProtocols(enabled.getProtocols(),supported.getProtocols());
 
         _factory = new Factory(keyStore,trustStore,context);
         if (LOG.isDebugEnabled())
