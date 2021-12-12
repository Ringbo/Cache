diff --git a/jetty-client/src/main/java/org/eclipse/jetty/client/HttpClient.java b/jetty-client/src/main/java/org/eclipse/jetty/client/HttpClient.java
index 27660d7..5fcd3e5 100644
--- a/jetty-client/src/main/java/org/eclipse/jetty/client/HttpClient.java
+++ b/jetty-client/src/main/java/org/eclipse/jetty/client/HttpClient.java
@@ -118,11 +118,11 @@
 
     /* ------------------------------------------------------------------------------- */
     /**
-     * @param blockingConnects True if connects will be in blocking mode.
+     * @param connectBlocking True if connects will be in blocking mode.
      */
-    public void setAsyncConnects(boolean blockingConnects)
+    public void setConnectBlocking(boolean connectBlocking)
     {
-        _connectBlocking = blockingConnects;
+        _connectBlocking = connectBlocking;
     }
 
     /* ------------------------------------------------------------------------------- */
