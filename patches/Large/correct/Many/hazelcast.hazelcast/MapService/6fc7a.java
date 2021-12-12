diff --git a/hazelcast/src/main/java/com/hazelcast/map/MapService.java b/hazelcast/src/main/java/com/hazelcast/map/MapService.java
index 2fde1d3..fa78d49 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/MapService.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/MapService.java
@@ -874,9 +874,9 @@
                 long total = Runtime.getRuntime().totalMemory();
                 long used = (total - Runtime.getRuntime().freeMemory());
                 if (maxSizePolicy == MaxSizeConfig.MaxSizePolicy.USED_HEAP_SIZE) {
-                    return maxSize > (used / 1024 / 1024);
+                    return maxSize < (used / 1024 / 1024);
                 } else {
-                    return maxSize > (used / total);
+                    return maxSize < (used / total);
                 }
             }
             return false;
