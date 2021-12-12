diff --git a/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/keycolumnvalue/inmemory/InMemoryStoreManager.java b/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/keycolumnvalue/inmemory/InMemoryStoreManager.java
index 89b1d44..becb513 100644
--- a/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/keycolumnvalue/inmemory/InMemoryStoreManager.java
+++ b/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/keycolumnvalue/inmemory/InMemoryStoreManager.java
@@ -80,7 +80,7 @@
 
     @Override
     public KeyColumnValueStore openDatabase(final String name) throws StorageException {
-        if (!stores.contains(name)) {
+        if (!stores.containsKey(name)) {
             stores.putIfAbsent(name,new InMemoryKeyColumnValueStore(name));
         }
         KeyColumnValueStore store = stores.get(name);
