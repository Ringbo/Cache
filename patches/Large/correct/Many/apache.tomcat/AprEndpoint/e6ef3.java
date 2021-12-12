diff --git a/java/org/apache/tomcat/util/net/AprEndpoint.java b/java/org/apache/tomcat/util/net/AprEndpoint.java
index a2a1d36..448ea3f 100644
--- a/java/org/apache/tomcat/util/net/AprEndpoint.java
+++ b/java/org/apache/tomcat/util/net/AprEndpoint.java
@@ -625,12 +625,12 @@
     @Override
     protected void releaseSSLContext(SSLHostConfig sslHostConfig) {
         Long ctx = sslHostConfig.getOpenSslContext();
-        if (ctx != null) {
+        if (ctx != null && ctx != 0) {
             SSLContext.free(ctx.longValue());
             sslHostConfig.setOpenSslContext(null);
         }
         Long cctx = sslHostConfig.getOpenSslConfContext();
-        if (cctx != null) {
+        if (cctx != null && cctx != 0) {
             SSLConf.free(cctx.longValue());
             sslHostConfig.setOpenSslConfContext(null);
         }
