diff --git a/storm-core/src/jvm/org/apache/storm/executor/spout/SpoutExecutor.java b/storm-core/src/jvm/org/apache/storm/executor/spout/SpoutExecutor.java
index ba1c830..7a5066b 100644
--- a/storm-core/src/jvm/org/apache/storm/executor/spout/SpoutExecutor.java
+++ b/storm-core/src/jvm/org/apache/storm/executor/spout/SpoutExecutor.java
@@ -202,7 +202,7 @@
             Long id = (Long) tuple.getValue(0);
             Long timeDeltaMs = (Long) tuple.getValue(1);
             TupleInfo tupleInfo = (TupleInfo) pending.remove(id);
-            if (tupleInfo.getMessageId() != null) {
+            if (tupleInfo != null && tupleInfo.getMessageId() != null) {
                 if (taskId != tupleInfo.getTaskId()) {
                     throw new RuntimeException("Fatal error, mismatched task ids: " + taskId + " " + tupleInfo.getTaskId());
                 }
