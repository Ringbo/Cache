diff --git a/hazelcast/src/main/java/com/hazelcast/map/operation/MultipleEntryOperation.java b/hazelcast/src/main/java/com/hazelcast/map/operation/MultipleEntryOperation.java
index a030979..46cb965 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/operation/MultipleEntryOperation.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/operation/MultipleEntryOperation.java
@@ -116,7 +116,7 @@
                            EntryEventType eventType) {
         final String mapName = name;
         final MapServiceContext mapServiceContext = getMapServiceContext();
-        if (mapServiceContext.hasRegisteredListener(mapName) || eventType == NO_NEED_TO_FIRE_EVENT) {
+        if (!mapServiceContext.hasRegisteredListener(mapName) || eventType == NO_NEED_TO_FIRE_EVENT) {
             return;
         }
         final Data oldValue = mapServiceContext.toData(valueBeforeProcess);
