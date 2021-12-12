diff --git a/presto-main/src/main/java/com/facebook/presto/execution/QueryStateMachine.java b/presto-main/src/main/java/com/facebook/presto/execution/QueryStateMachine.java
index 6bc9385..83dbcdf 100644
--- a/presto-main/src/main/java/com/facebook/presto/execution/QueryStateMachine.java
+++ b/presto-main/src/main/java/com/facebook/presto/execution/QueryStateMachine.java
@@ -481,7 +481,7 @@
                 }
 
                 if (plan.isMaterializedExchangeSource()) {
-                    writtenOutputPhysicalDataSize += stageStats.getPhysicalWrittenDataSize().toBytes();
+                    writtenIntermediatePhysicalDataSize += stageStats.getPhysicalWrittenDataSize().toBytes();
                 }
                 else {
                     writtenOutputPositions += stageInfo.getStageStats().getOperatorSummaries().stream()
