diff --git a/hbase-client/src/main/java/org/apache/hadoop/hbase/MetaTableAccessor.java b/hbase-client/src/main/java/org/apache/hadoop/hbase/MetaTableAccessor.java
index 5dc0565..dad9aef 100644
--- a/hbase-client/src/main/java/org/apache/hadoop/hbase/MetaTableAccessor.java
+++ b/hbase-client/src/main/java/org/apache/hadoop/hbase/MetaTableAccessor.java
@@ -1759,7 +1759,7 @@
       // master tries to assign these offline regions. This is followed by re-assignments of the
       // daughter regions from resumed {@link SplitTableRegionProcedure}
       addRegionStateToPut(putA, RegionState.State.CLOSED);
-      addRegionStateToPut(putA, RegionState.State.CLOSED);
+      addRegionStateToPut(putB, RegionState.State.CLOSED);
 
       addSequenceNum(putA, 1, -1, splitA.getReplicaId()); //new regions, openSeqNum = 1 is fine.
       addSequenceNum(putB, 1, -1, splitB.getReplicaId());
