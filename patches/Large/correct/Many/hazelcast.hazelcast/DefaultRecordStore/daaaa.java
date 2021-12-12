diff --git a/hazelcast/src/main/java/com/hazelcast/map/DefaultRecordStore.java b/hazelcast/src/main/java/com/hazelcast/map/DefaultRecordStore.java
index 9e241e9..494bd6d 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/DefaultRecordStore.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/DefaultRecordStore.java
@@ -383,7 +383,7 @@
 
         if (store != null) {
             store.deleteAll(keysObject);
-            toBeRemovedKeys.clear();
+            toBeRemovedKeys.removeAll(keysToDelete);
         }
 
         clearRecordsMap(lockedRecords);
