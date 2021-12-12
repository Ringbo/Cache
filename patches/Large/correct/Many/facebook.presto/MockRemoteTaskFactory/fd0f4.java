diff --git a/presto-main/src/test/java/com/facebook/presto/execution/MockRemoteTaskFactory.java b/presto-main/src/test/java/com/facebook/presto/execution/MockRemoteTaskFactory.java
index 2a475e6..0e1dd8d 100644
--- a/presto-main/src/test/java/com/facebook/presto/execution/MockRemoteTaskFactory.java
+++ b/presto-main/src/test/java/com/facebook/presto/execution/MockRemoteTaskFactory.java
@@ -351,7 +351,7 @@
         }
 
         @Override
-        public int getQueuedPartitionedSplitCount()
+        public synchronized int getQueuedPartitionedSplitCount()
         {
             if (taskStateMachine.getState().isDone()) {
                 return 0;
