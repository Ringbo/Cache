diff --git a/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/keycolumnvalue/KCVSUtil.java b/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/keycolumnvalue/KCVSUtil.java
index 2b4d9e4..9311648 100644
--- a/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/keycolumnvalue/KCVSUtil.java
+++ b/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/keycolumnvalue/KCVSUtil.java
@@ -46,7 +46,7 @@
     }
 
     public static KeyIterator getKeys(KeyColumnValueStore store, StoreFeatures features, int keyLength, int sliceLength, StoreTransaction txh) throws BackendException {
-        return getKeys(store,new SliceQuery(BufferUtil.zeroBuffer(sliceLength), BufferUtil.oneBuffer(sliceLength)).setLimit(1),
+        return getKeys(store,new SliceQuery(BufferUtil.zeroBuffer(1), BufferUtil.oneBuffer(sliceLength)).setLimit(1),
                 features,keyLength,txh);
     }
 
@@ -54,7 +54,7 @@
         if (features.hasUnorderedScan()) {
             return store.getKeys(slice, txh);
         } else if (features.hasOrderedScan()) {
-            return store.getKeys(new KeyRangeQuery(BufferUtil.zeroBuffer(keyLength), BufferUtil.oneBuffer(keyLength), slice), txh);
+            return store.getKeys(new KeyRangeQuery(BufferUtil.zeroBuffer(1), BufferUtil.oneBuffer(keyLength), slice), txh);
         } else throw new UnsupportedOperationException("Provided stores does not support scan operations: " + store);
     }
 
@@ -71,7 +71,7 @@
         return get(store, key, column, txh) != null;
     }
 
-    private static final StaticBuffer START = BufferUtil.zeroBuffer(8), END = BufferUtil.oneBuffer(32);
+    private static final StaticBuffer START = BufferUtil.zeroBuffer(1), END = BufferUtil.oneBuffer(32);
 
     public static boolean containsKey(KeyColumnValueStore store, StaticBuffer key, StoreTransaction txh) throws BackendException {
         return containsKey(store,key,32,txh);
