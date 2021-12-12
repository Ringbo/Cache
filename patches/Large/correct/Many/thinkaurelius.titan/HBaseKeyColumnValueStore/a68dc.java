diff --git a/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseKeyColumnValueStore.java b/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseKeyColumnValueStore.java
index e25821b..8192fbd 100644
--- a/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseKeyColumnValueStore.java
+++ b/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseKeyColumnValueStore.java
@@ -167,7 +167,7 @@
     }
 
     public void mutateMany(Map<StaticBuffer, KCVMutation> mutations, StoreTransaction txh) throws StorageException {
-        storeManager.mutateMany(ImmutableMap.of(columnFamily, mutations), txh);
+        storeManager.mutateMany(ImmutableMap.of(storeName, mutations), txh);
     }
 
     @Override
