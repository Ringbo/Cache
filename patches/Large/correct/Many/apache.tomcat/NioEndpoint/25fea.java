diff --git a/java/org/apache/tomcat/util/net/NioEndpoint.java b/java/org/apache/tomcat/util/net/NioEndpoint.java
index da6bd98..af2e6df 100644
--- a/java/org/apache/tomcat/util/net/NioEndpoint.java
+++ b/java/org/apache/tomcat/util/net/NioEndpoint.java
@@ -415,7 +415,7 @@
             try {
                 log.error("",t);
             } catch (Throwable tt) {
-                ExceptionUtils.handleThrowable(t);
+                ExceptionUtils.handleThrowable(tt);
             }
             // Tell to close the socket
             return false;
