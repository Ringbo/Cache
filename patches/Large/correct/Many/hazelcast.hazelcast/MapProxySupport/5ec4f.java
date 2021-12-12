diff --git a/hazelcast/src/main/java/com/hazelcast/map/impl/proxy/MapProxySupport.java b/hazelcast/src/main/java/com/hazelcast/map/impl/proxy/MapProxySupport.java
index f57b329..236e124 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/impl/proxy/MapProxySupport.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/impl/proxy/MapProxySupport.java
@@ -862,7 +862,7 @@
                     checkNotNull(entry.getKey(), NULL_KEY_IS_NOT_ALLOWED);
                     checkNotNull(entry.getValue(), NULL_VALUE_IS_NOT_ALLOWED);
 
-                    putInternal(mapService.getMapServiceContext().toData(entry.getKey(), partitionStrategy),
+                    setInternal(mapService.getMapServiceContext().toData(entry.getKey(), partitionStrategy),
                             mapService.getMapServiceContext().toData(entry.getValue()),
                             -1,
                             TimeUnit.MILLISECONDS);
