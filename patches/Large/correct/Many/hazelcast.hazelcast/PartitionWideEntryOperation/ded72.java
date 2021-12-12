diff --git a/hazelcast/src/main/java/com/hazelcast/map/operation/PartitionWideEntryOperation.java b/hazelcast/src/main/java/com/hazelcast/map/operation/PartitionWideEntryOperation.java
index fb7f184..20cc279 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/operation/PartitionWideEntryOperation.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/operation/PartitionWideEntryOperation.java
@@ -132,7 +132,7 @@
                            Object valueAfterProcess, EntryEventType eventType) {
         final String mapName = name;
         final MapServiceContext mapServiceContext = getMapServiceContext();
-        if (mapServiceContext.hasRegisteredListener(mapName) || eventType == NO_NEED_TO_FIRE_EVENT) {
+        if (!mapServiceContext.hasRegisteredListener(mapName) || eventType == NO_NEED_TO_FIRE_EVENT) {
             return;
         }
         final Data oldValue = mapServiceContext.toData(valueBeforeProcess);
