diff --git a/hazelcast/src/main/java/com/hazelcast/map/impl/tx/TxnSetOperation.java b/hazelcast/src/main/java/com/hazelcast/map/impl/tx/TxnSetOperation.java
index 182d5fa..356e758 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/impl/tx/TxnSetOperation.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/impl/tx/TxnSetOperation.java
@@ -112,7 +112,7 @@
     public Operation getBackupOperation() {
         final Record record = recordStore.getRecord(dataKey);
         final RecordInfo replicationInfo = Records.buildRecordInfo(record);
-        return new PutBackupOperation(name, dataKey, dataValue, replicationInfo, true);
+        return new PutBackupOperation(name, dataKey, dataValue, replicationInfo, true, false);
     }
 
     public void onWaitExpire() {
