diff --git a/jetty-server/src/test/java/org/eclipse/jetty/server/InsufficientThreadsDetectionTest.java b/jetty-server/src/test/java/org/eclipse/jetty/server/InsufficientThreadsDetectionTest.java
index f54f709..e95356b 100644
--- a/jetty-server/src/test/java/org/eclipse/jetty/server/InsufficientThreadsDetectionTest.java
+++ b/jetty-server/src/test/java/org/eclipse/jetty/server/InsufficientThreadsDetectionTest.java
@@ -69,14 +69,14 @@
 
     @Test // Github issue #586
     public void testCaseForMultipleConnectors() throws Exception {
-        // server has 3 threads in the executor
-        _server = new Server(new QueuedThreadPool(3));
+        // server has 4 threads in the executor
+        _server = new Server(new QueuedThreadPool(4));
 
-        // first connector consumes all 3 threads from server pool
+        // first connector consumes all 4 threads from server pool
         _server.addConnector(new ServerConnector(_server, null, null, null, 1, 1, new HttpConnectionFactory()));
 
-        // second connect also require 3 threads but uses own executor, so its threads should not be counted
-        final QueuedThreadPool connectorPool = new QueuedThreadPool(3, 3);
+        // second connect also require 4 threads but uses own executor, so its threads should not be counted
+        final QueuedThreadPool connectorPool = new QueuedThreadPool(4, 4);
         _server.addConnector(new ServerConnector(_server, connectorPool, null, null, 1, 1, new HttpConnectionFactory()));
 
         // should not throw exception because limit was not overflown
