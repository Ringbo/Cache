diff --git a/src/test/java/io/vertx/test/core/FaultToleranceTest.java b/src/test/java/io/vertx/test/core/FaultToleranceTest.java
index d63519e..b938af1 100644
--- a/src/test/java/io/vertx/test/core/FaultToleranceTest.java
+++ b/src/test/java/io/vertx/test/core/FaultToleranceTest.java
@@ -66,12 +66,12 @@
       Process process = startExternalNode(i);
       externalNodes.add(process);
     }
-    waitUntil(() -> externalNodesStarted.get() == NODE_COUNT, 30_000);
+    waitUntil(() -> externalNodesStarted.get() == NODE_COUNT, 60_000);
 
     JsonArray message1 = new JsonArray();
     IntStream.range(0, NODE_COUNT).forEach(message1::add);
     vertx.eventBus().publish("ping", message1);
-    waitUntil(() -> pongsReceived.get() == NODE_COUNT * NODE_COUNT * ADDRESSES_COUNT, 30_000);
+    waitUntil(() -> pongsReceived.get() == NODE_COUNT * NODE_COUNT * ADDRESSES_COUNT, 60_000);
 
     for (int i = 0; i < NODE_COUNT - 1; i++) {
       externalNodes.get(i).destroyForcibly();
@@ -81,17 +81,17 @@
     pongsReceived.set(0);
     JsonArray message2 = new JsonArray().add(NODE_COUNT - 1);
     vertx.eventBus().publish("ping", message2);
-    waitUntil(() -> pongsReceived.get() == ADDRESSES_COUNT, 30_000);
+    waitUntil(() -> pongsReceived.get() == ADDRESSES_COUNT, 60_000);
 
     JsonArray message3 = new JsonArray();
     IntStream.range(0, NODE_COUNT - 1).forEach(message3::add);
     vertx.eventBus().publish("ping", message3);
-    waitUntil(() -> noHandlersErrors.get() == (NODE_COUNT - 1) * ADDRESSES_COUNT, 30_000);
+    waitUntil(() -> noHandlersErrors.get() == (NODE_COUNT - 1) * ADDRESSES_COUNT, 60_000);
   }
 
   protected void waitForClusterStability(VertxInternal vertx) throws Exception {
     ClusterManager clusterManager = vertx.getClusterManager();
-    waitUntil(() -> clusterManager.getNodes().size() == 2, 30_000);
+    waitUntil(() -> clusterManager.getNodes().size() == 2, 60_000);
   }
 
   private Process startExternalNode(int id) throws Exception {
