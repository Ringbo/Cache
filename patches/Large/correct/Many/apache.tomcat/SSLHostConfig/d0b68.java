diff --git a/java/org/apache/tomcat/util/net/SSLHostConfig.java b/java/org/apache/tomcat/util/net/SSLHostConfig.java
index ec520da..b084c71 100644
--- a/java/org/apache/tomcat/util/net/SSLHostConfig.java
+++ b/java/org/apache/tomcat/util/net/SSLHostConfig.java
@@ -107,7 +107,7 @@
     }
 
 
-    public Object getOpenSslContext() {
+    public Long getOpenSslContext() {
         return openSslContext;
     }
 
