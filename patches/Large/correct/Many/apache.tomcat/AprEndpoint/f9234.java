diff --git a/java/org/apache/tomcat/util/net/AprEndpoint.java b/java/org/apache/tomcat/util/net/AprEndpoint.java
index 845d76a..46f9432 100644
--- a/java/org/apache/tomcat/util/net/AprEndpoint.java
+++ b/java/org/apache/tomcat/util/net/AprEndpoint.java
@@ -1975,7 +1975,7 @@
             sendfileThread.start();
         }
 
-        protected void stop() {
+        protected synchronized void stop() {
             sendfileRunning = false;
 
             // Wait for the sendfile thread to exit, otherwise parallel
