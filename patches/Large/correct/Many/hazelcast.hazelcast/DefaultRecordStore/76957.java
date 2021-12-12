diff --git a/hazelcast/src/main/java/com/hazelcast/map/DefaultRecordStore.java b/hazelcast/src/main/java/com/hazelcast/map/DefaultRecordStore.java
index 568c162..4e4cb0f 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/DefaultRecordStore.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/DefaultRecordStore.java
@@ -384,7 +384,7 @@
 
         if (store != null) {
             store.deleteAll(keysObject);
-            toBeRemovedKeys.clear();
+            toBeRemovedKeys.removeAll(keysToDelete);
         }
 
         clearRecordsMap(lockedRecords);
