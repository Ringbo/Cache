diff --git a/hazelcast/src/main/java/com/hazelcast/map/MapService.java b/hazelcast/src/main/java/com/hazelcast/map/MapService.java
index 9d3384d..6c914bb 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/MapService.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/MapService.java
@@ -412,12 +412,12 @@
         if (shouldSchedule) {
             // if ttl is 0 then no eviction. if ttl is -1 then default configured eviction is applied
             if (ttl < 0 && mapContainer.getMapConfig().getTimeToLiveSeconds() > 0) {
-                scheduleTtlEviction(name, record, mapContainer.getMapConfig().getTimeToLiveSeconds() * 1000);
+                scheduleTtlEviction(name, record, mapContainer.getMapConfig().getTimeToLiveSeconds() * 1000L);
             } else if (ttl > 0) {
                 scheduleTtlEviction(name, record, ttl);
             }
             if (mapContainer.getMapConfig().getMaxIdleSeconds() > 0) {
-                scheduleIdleEviction(name, dataKey, mapContainer.getMapConfig().getMaxIdleSeconds() * 1000);
+                scheduleIdleEviction(name, dataKey, mapContainer.getMapConfig().getMaxIdleSeconds() * 1000L);
             }
         }
         return record;
