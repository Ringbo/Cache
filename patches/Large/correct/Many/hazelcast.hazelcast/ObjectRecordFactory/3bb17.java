diff --git a/hazelcast/src/main/java/com/hazelcast/map/record/ObjectRecordFactory.java b/hazelcast/src/main/java/com/hazelcast/map/record/ObjectRecordFactory.java
index 9fb4c70..36adc3e 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/record/ObjectRecordFactory.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/record/ObjectRecordFactory.java
@@ -42,7 +42,7 @@
         if (value instanceof Data) {
             v = serializationService.toObject(value);
         }
-        return statisticsEnabled ? new ObjectRecordWithStats(key, v) : new ObjectRecord(key, v);
+        return statisticsEnabled ? new ObjectRecordWithStats(key, value) : new ObjectRecord(key, v);
     }
 
     @Override
