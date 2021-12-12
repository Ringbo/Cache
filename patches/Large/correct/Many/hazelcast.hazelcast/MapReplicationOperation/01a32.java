diff --git a/hazelcast/src/main/java/com/hazelcast/map/operation/MapReplicationOperation.java b/hazelcast/src/main/java/com/hazelcast/map/operation/MapReplicationOperation.java
index 844d3e8..a4e6491 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/operation/MapReplicationOperation.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/operation/MapReplicationOperation.java
@@ -68,7 +68,7 @@
                 mapInitialLoadInfo.put(name, recordStore.isLoaded());
             }
             // now prepare data to migrate records
-            Set<RecordReplicationInfo> recordSet = new HashSet<RecordReplicationInfo>();
+            Set<RecordReplicationInfo> recordSet = new HashSet<RecordReplicationInfo>(recordStore.size());
             for (Entry<Data, Record> recordEntry : recordStore.getReadonlyRecordMap().entrySet()) {
                 Data key = recordEntry.getKey();
                 Record record = recordEntry.getValue();
