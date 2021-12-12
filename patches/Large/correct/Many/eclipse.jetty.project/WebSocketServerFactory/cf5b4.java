diff --git a/jetty-websocket/websocket-server/src/main/java/org/eclipse/jetty/websocket/server/WebSocketServerFactory.java b/jetty-websocket/websocket-server/src/main/java/org/eclipse/jetty/websocket/server/WebSocketServerFactory.java
index 605bbff..337e765 100644
--- a/jetty-websocket/websocket-server/src/main/java/org/eclipse/jetty/websocket/server/WebSocketServerFactory.java
+++ b/jetty-websocket/websocket-server/src/main/java/org/eclipse/jetty/websocket/server/WebSocketServerFactory.java
@@ -329,7 +329,11 @@
         super.doStart();
     }
 
-    private DecoratedObjectFactory findDecorator()
+    /**
+     * Attempt to find the DecoratedObjectFactory that should be used.
+     * @return the DecoratedObjectFactory that should be used. (never null)
+     */
+    protected DecoratedObjectFactory findDecorator()
     {
         DecoratedObjectFactory objectFactory;
 
@@ -350,9 +354,9 @@
 
     /**
      * Attempt to find the Executor that should be used.
-     * @return the Executor that should be used.
+     * @return the Executor that should be used. (never null)
      */
-    private Executor findExecutor()
+    protected Executor findExecutor()
     {
         if(context != null)
         {
