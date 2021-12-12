diff --git a/jetty-start/src/main/java/org/eclipse/jetty/start/Monitor.java b/jetty-start/src/main/java/org/eclipse/jetty/start/Monitor.java
index 8955907..17cffd7 100644
--- a/jetty-start/src/main/java/org/eclipse/jetty/start/Monitor.java
+++ b/jetty-start/src/main/java/org/eclipse/jetty/start/Monitor.java
@@ -38,7 +38,7 @@
 
     ServerSocket _socket;
     
-    Monitor(int port,String key)
+    public Monitor(int port,String key)
     {
         try
         {
