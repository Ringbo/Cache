diff --git a/x-pack/plugin/src/main/java/org/elasticsearch/xpack/ccr/action/ShardChangesAction.java b/x-pack/plugin/src/main/java/org/elasticsearch/xpack/ccr/action/ShardChangesAction.java
index c1c921f..d48610a 100644
--- a/x-pack/plugin/src/main/java/org/elasticsearch/xpack/ccr/action/ShardChangesAction.java
+++ b/x-pack/plugin/src/main/java/org/elasticsearch/xpack/ccr/action/ShardChangesAction.java
@@ -239,7 +239,7 @@
         }
 
         final List<Translog.Operation> operations = new ArrayList<>();
-        final LocalCheckpointTracker tracker = new LocalCheckpointTracker(indexShard.indexSettings(), maxSeqNo, minSeqNo);
+        final LocalCheckpointTracker tracker = new LocalCheckpointTracker(maxSeqNo, minSeqNo);
         try (Translog.Snapshot snapshot = indexShard.getTranslog().getSnapshotBetween(minSeqNo, maxSeqNo)) {
             for (Translog.Operation op = snapshot.next(); op != null; op = snapshot.next()) {
                 if (op.seqNo() >= minSeqNo && op.seqNo() <= maxSeqNo) {
