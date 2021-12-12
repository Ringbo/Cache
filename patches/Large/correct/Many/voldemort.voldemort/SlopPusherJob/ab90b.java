diff --git a/src/java/voldemort/server/scheduler/SlopPusherJob.java b/src/java/voldemort/server/scheduler/SlopPusherJob.java
index 7983ef7..80855fe 100644
--- a/src/java/voldemort/server/scheduler/SlopPusherJob.java
+++ b/src/java/voldemort/server/scheduler/SlopPusherJob.java
@@ -94,7 +94,7 @@
                     throw new InterruptedException("Task cancelled!");
                 attemptedPushes++;
 
-                if(attemptedPushes % 1000 == 0)
+                if(attemptedPushes % 10000 == 0)
                     logger.info("Attempted pushing " + attemptedPushes + " slops");
 
                 try {
@@ -106,7 +106,7 @@
                     Long attempted = attemptedByNode.get(nodeId);
                     if(attempted == null)
                         attempted = 0L;
-                    attemptedByNode.put(nodeId, attempted);
+                    attemptedByNode.put(nodeId, attempted + 1L);
                     if(failureDetector.isAvailable(node)) {
                         Store<ByteArray, byte[], byte[]> store = storeRepo.getNodeStore(slop.getStoreName(),
                                                                                         node.getId());
