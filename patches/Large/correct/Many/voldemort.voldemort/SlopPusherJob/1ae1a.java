diff --git a/src/java/voldemort/server/scheduler/SlopPusherJob.java b/src/java/voldemort/server/scheduler/SlopPusherJob.java
index 59f1fcb..58d3939 100644
--- a/src/java/voldemort/server/scheduler/SlopPusherJob.java
+++ b/src/java/voldemort/server/scheduler/SlopPusherJob.java
@@ -73,7 +73,7 @@
     public void run() {
         logger.debug("Pushing slop...");
 
-        int numNodes = storeRepo.getAllLocalStores().size();
+        int numNodes = storeRepo.getAllNodeStores().size();
         Map<Integer, Long> attemptedByNode = Maps.newHashMapWithExpectedSize(numNodes);
         for(int i = 0; i < numNodes; i++)
             attemptedByNode.put(i, 0L);
