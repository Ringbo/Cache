diff --git a/proxy/src/main/java/net/md_5/bungee/BungeeCord.java b/proxy/src/main/java/net/md_5/bungee/BungeeCord.java
index 6d3f260..14b7a7d 100644
--- a/proxy/src/main/java/net/md_5/bungee/BungeeCord.java
+++ b/proxy/src/main/java/net/md_5/bungee/BungeeCord.java
@@ -249,7 +249,7 @@
     {
         this.isRunning = false;
 
-        httpClient.close();
+        httpClient.closeAsynchronously(); // TODO: Fix
         executors.shutdown();
 
         stopListeners();
