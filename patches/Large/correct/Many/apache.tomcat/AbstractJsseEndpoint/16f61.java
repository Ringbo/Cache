diff --git a/java/org/apache/tomcat/util/net/AbstractJsseEndpoint.java b/java/org/apache/tomcat/util/net/AbstractJsseEndpoint.java
index d915d64..ea6d550 100644
--- a/java/org/apache/tomcat/util/net/AbstractJsseEndpoint.java
+++ b/java/org/apache/tomcat/util/net/AbstractJsseEndpoint.java
@@ -67,8 +67,8 @@
         SSLHostConfig sslHostConfig = getSSLHostConfig(sniHostName);
         SSLContextWrapper sslContextWrapper = (SSLContextWrapper) sslHostConfig.getSslContext();
         if (sslContextWrapper == null) {
-            // TODO i18n
-            throw new IllegalStateException();
+            throw new IllegalStateException(
+                    sm.getString("endpoint.jsse.noSslContext", sniHostName));
         }
 
         SSLEngine engine = sslContextWrapper.getSSLContext().createSSLEngine();
