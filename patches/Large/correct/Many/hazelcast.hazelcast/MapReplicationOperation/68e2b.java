diff --git a/hazelcast/src/main/java/com/hazelcast/map/operation/MapReplicationOperation.java b/hazelcast/src/main/java/com/hazelcast/map/operation/MapReplicationOperation.java
index a4e6491..8188003 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/operation/MapReplicationOperation.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/operation/MapReplicationOperation.java
@@ -65,10 +65,10 @@
             String name = entry.getKey();
             // adding if initial data is loaded for the only maps that has mapstore behind
             if(mapContainer.getStore() != null) {
-                mapInitialLoadInfo.put(name, recordStore.isLoaded());
+                mapInitialLoadInfo.put(name, replicaIndex > 0 || recordStore.isLoaded());
             }
             // now prepare data to migrate records
-            Set<RecordReplicationInfo> recordSet = new HashSet<RecordReplicationInfo>(recordStore.size());
+            Set<RecordReplicationInfo> recordSet = new HashSet<RecordReplicationInfo>();
             for (Entry<Data, Record> recordEntry : recordStore.getReadonlyRecordMap().entrySet()) {
                 Data key = recordEntry.getKey();
                 Record record = recordEntry.getValue();
