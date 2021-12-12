diff --git a/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseKeyColumnValueStore.java b/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseKeyColumnValueStore.java
index 4059a1c..ff0be71 100644
--- a/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseKeyColumnValueStore.java
+++ b/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseKeyColumnValueStore.java
@@ -192,7 +192,7 @@
     }
 
     public void mutateMany(Map<StaticBuffer, KCVMutation> mutations, StoreTransaction txh) throws StorageException {
-        storeManager.mutateMany(ImmutableMap.of(columnFamily, mutations), txh);
+        storeManager.mutateMany(ImmutableMap.of(storeName, mutations), txh);
     }
 
     @Override
