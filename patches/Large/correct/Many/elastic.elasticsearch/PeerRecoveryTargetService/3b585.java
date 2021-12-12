diff --git a/core/src/main/java/org/elasticsearch/indices/recovery/PeerRecoveryTargetService.java b/core/src/main/java/org/elasticsearch/indices/recovery/PeerRecoveryTargetService.java
index 0c20d70..c25315a 100644
--- a/core/src/main/java/org/elasticsearch/indices/recovery/PeerRecoveryTargetService.java
+++ b/core/src/main/java/org/elasticsearch/indices/recovery/PeerRecoveryTargetService.java
@@ -356,7 +356,7 @@
             final long globalCheckpoint = Translog.readGlobalCheckpoint(recoveryTarget.translogLocation());
             final Tuple<Long, Long> seqNoStats = recoveryTarget.store().loadSeqNoInfo();
             long maxSeqNo = seqNoStats.v1();
-            long localCheckpoint = seqNoStats.v1();
+            long localCheckpoint = seqNoStats.v2();
             if (maxSeqNo <= globalCheckpoint) {
                 assert localCheckpoint <= globalCheckpoint;
                 /*
