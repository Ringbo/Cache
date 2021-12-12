diff --git a/server/sonar-process/src/main/java/org/sonar/process/NetworkUtils.java b/server/sonar-process/src/main/java/org/sonar/process/NetworkUtils.java
index 44fcfb7..5dd5813 100644
--- a/server/sonar-process/src/main/java/org/sonar/process/NetworkUtils.java
+++ b/server/sonar-process/src/main/java/org/sonar/process/NetworkUtils.java
@@ -39,7 +39,7 @@
     try  {
       socket = new ServerSocket();
       socket.setReuseAddress(true);
-      socket.bind(new InetSocketAddress(0));
+      socket.bind(new InetSocketAddress("localhost", 0));
       return socket.getLocalPort();
 
     } catch (IOException e) {
