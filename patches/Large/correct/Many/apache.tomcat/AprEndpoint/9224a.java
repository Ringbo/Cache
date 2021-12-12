diff --git a/java/org/apache/tomcat/util/net/AprEndpoint.java b/java/org/apache/tomcat/util/net/AprEndpoint.java
index e948d96..7ec996c 100644
--- a/java/org/apache/tomcat/util/net/AprEndpoint.java
+++ b/java/org/apache/tomcat/util/net/AprEndpoint.java
@@ -2341,7 +2341,7 @@
 
         private void doRun() {
             // Process the request from this socket
-            if (socket.getSocket() == null) {
+            if (socket.getSocket() == null || !connections.containsKey(socket)) {
                 // Closed in another thread
                 return;
             }
