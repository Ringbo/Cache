diff --git a/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/configuration/backend/KCVSConfiguration.java b/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/configuration/backend/KCVSConfiguration.java
index 44c9781..a2d249c 100644
--- a/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/configuration/backend/KCVSConfiguration.java
+++ b/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/configuration/backend/KCVSConfiguration.java
@@ -169,7 +169,7 @@
         List<Entry> result = BackendOperation.execute(new BackendOperation.Transactional<List<Entry>>() {
             @Override
             public List<Entry> call(StoreTransaction txh) throws BackendException {
-                return store.getSlice(new KeySliceQuery(rowKey, BufferUtil.zeroBuffer(128), BufferUtil.oneBuffer(128)),txh);
+                return store.getSlice(new KeySliceQuery(rowKey, BufferUtil.zeroBuffer(1), BufferUtil.oneBuffer(128)),txh);
             }
 
             @Override
