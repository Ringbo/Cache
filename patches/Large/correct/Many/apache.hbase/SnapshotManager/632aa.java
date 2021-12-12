diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/master/snapshot/SnapshotManager.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/master/snapshot/SnapshotManager.java
index 1abd605..bc472d3 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/master/snapshot/SnapshotManager.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/master/snapshot/SnapshotManager.java
@@ -697,7 +697,7 @@
     TableDescriptor htd = TableDescriptorBuilder.copy(tableName, snapshotTableDesc);
     org.apache.hadoop.hbase.client.SnapshotDescription snapshotPOJO = null;
     if (cpHost != null) {
-      snapshotPOJO = ProtobufUtil.createSnapshotDesc(reqSnapshot);
+      snapshotPOJO = ProtobufUtil.createSnapshotDesc(snapshot);
       cpHost.preCloneSnapshot(snapshotPOJO, htd);
     }
     long procId;
@@ -827,7 +827,7 @@
     // call Coprocessor pre hook
     org.apache.hadoop.hbase.client.SnapshotDescription snapshotPOJO = null;
     if (cpHost != null) {
-      snapshotPOJO = ProtobufUtil.createSnapshotDesc(reqSnapshot);
+      snapshotPOJO = ProtobufUtil.createSnapshotDesc(snapshot);
       cpHost.preRestoreSnapshot(snapshotPOJO, snapshotTableDesc);
     }
 
