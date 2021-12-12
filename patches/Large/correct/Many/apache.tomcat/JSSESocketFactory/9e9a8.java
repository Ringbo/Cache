diff --git a/java/org/apache/tomcat/util/net/jsse/JSSESocketFactory.java b/java/org/apache/tomcat/util/net/jsse/JSSESocketFactory.java
index e5079c9..31f6cc5 100644
--- a/java/org/apache/tomcat/util/net/jsse/JSSESocketFactory.java
+++ b/java/org/apache/tomcat/util/net/jsse/JSSESocketFactory.java
@@ -332,7 +332,7 @@
             String msg = sm.getString("jsse.keystore_load_failed", type, path,
                     ex.getMessage());
             log.error(msg, ex);
-            throw new IOException(msg, ex);
+            throw new IOException(msg);
         } finally {
             if (istream != null) {
                 try {
