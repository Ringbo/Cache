diff --git a/hazelcast/src/main/java/com/hazelcast/map/MapService.java b/hazelcast/src/main/java/com/hazelcast/map/MapService.java
index 148c195..0482f7a 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/MapService.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/MapService.java
@@ -586,7 +586,7 @@
                     oldValue = oldValue != null ? oldValue : toObject(dataOldValue);
                     testValue = oldValue;
                 } else {
-                    value = value != null ? value : toObject(value);
+                    value = value != null ? value : toObject(dataValue);
                     testValue = value;
                 }
                 key = key != null ? key : toObject(key);
