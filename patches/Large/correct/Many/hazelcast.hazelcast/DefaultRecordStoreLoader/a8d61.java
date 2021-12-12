diff --git a/hazelcast/src/main/java/com/hazelcast/map/DefaultRecordStoreLoader.java b/hazelcast/src/main/java/com/hazelcast/map/DefaultRecordStoreLoader.java
index b8d3f82..531e8f6 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/DefaultRecordStoreLoader.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/DefaultRecordStoreLoader.java
@@ -168,7 +168,7 @@
         if (entries == null || entries.isEmpty()) {
             return Collections.emptyList();
         }
-        final List<Data> keyValueSequence = new ArrayList<Data>();
+        final List<Data> keyValueSequence = new ArrayList<Data>(entries.size());
         for (final Map.Entry<Object, Object> entry : entries.entrySet()) {
             final Object key = entry.getKey();
             final Object value = entry.getValue();
@@ -268,7 +268,7 @@
     }
 
     private void doChunkedLoad(Map<Data, Object> loadedKeys, NodeEngine nodeEngine) {
-        final int mapLoadChunkSize = nodeEngine.getGroupProperties().MAP_LOAD_CHUNK_SIZE.getInteger();
+        final int mapLoadChunkSize = getLoadBatchSize();
         final Queue<Map> chunks = new LinkedList<Map>();
         Map<Data, Object> partitionKeys = new HashMap<Data, Object>();
         Iterator<Map.Entry<Data, Object>> iterator = loadedKeys.entrySet().iterator();
