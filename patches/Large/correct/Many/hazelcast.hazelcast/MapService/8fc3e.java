diff --git a/hazelcast/src/main/java/com/hazelcast/map/MapService.java b/hazelcast/src/main/java/com/hazelcast/map/MapService.java
index 9334f31..80200f3 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/MapService.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/MapService.java
@@ -196,7 +196,7 @@
             for (int i = 0; i < nodeEngine.getPartitionService().getPartitionCount(); i++) {
                 RecordStore recordStore = getPartitionContainer(i).getRecordStore(mapContainer.getName());
                 // add your owned entries to the map so they will be merged
-                if (nodeEngine.getPartitionService().getPartitionOwner(i).equals(nodeEngine.getClusterService().getThisAddress())) {
+                if (nodeEngine.getClusterService().getThisAddress().equals(nodeEngine.getPartitionService().getPartitionOwner(i))) {
                     if (!recordMap.containsKey(mapContainer)) {
                         recordMap.put(mapContainer, new ArrayList<Record>());
                     }
