diff --git a/library/src/main/java/com/danikula/videocache/HttpProxyCacheServer.java b/library/src/main/java/com/danikula/videocache/HttpProxyCacheServer.java
index b5f0282..b165812 100644
--- a/library/src/main/java/com/danikula/videocache/HttpProxyCacheServer.java
+++ b/library/src/main/java/com/danikula/videocache/HttpProxyCacheServer.java
@@ -299,7 +299,7 @@
 
     private void closeSocketOutput(Socket socket) {
         try {
-            if (socket.isOutputShutdown()) {
+            if (!socket.isOutputShutdown()) {
                 socket.shutdownOutput();
             }
         } catch (IOException e) {
