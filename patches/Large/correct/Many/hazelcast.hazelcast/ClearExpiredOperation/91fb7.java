diff --git a/hazelcast/src/main/java/com/hazelcast/map/operation/ClearExpiredOperation.java b/hazelcast/src/main/java/com/hazelcast/map/operation/ClearExpiredOperation.java
index db43e6a..30c21ef 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/operation/ClearExpiredOperation.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/operation/ClearExpiredOperation.java
@@ -41,7 +41,8 @@
     @Override
     public void run() throws Exception {
         final PartitionContainer partitionContainer = mapService.getPartitionContainer(getPartitionId());
-        final RecordStore recordStore = partitionContainer.getRecordStore(name);
+        // this should be existing record store since we don't want to trigger record store creation.
+        final RecordStore recordStore = partitionContainer.getExistingRecordStore(name);
         evictedKeyValueSequence = recordStore.clearUnLockedExpiredRecords();
     }
 
