diff --git a/hazelcast/src/test/java/com/hazelcast/map/mapstore/MapStoreTest.java b/hazelcast/src/test/java/com/hazelcast/map/mapstore/MapStoreTest.java
index ce81b72..cf10c7e 100644
--- a/hazelcast/src/test/java/com/hazelcast/map/mapstore/MapStoreTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/map/mapstore/MapStoreTest.java
@@ -1391,7 +1391,7 @@
         MapConfig writeBehindBackupConfig = config.getMapConfig(name);
         MapStoreConfig mapStoreConfig = new MapStoreConfig();
         mapStoreConfig.setWriteDelaySeconds(5);
-        final MapStoreWithStoreCount mapStore = new MapStoreWithStoreCount(expectedStoreCount, 300, 100);
+        final MapStoreWithStoreCount mapStore = new MapStoreWithStoreCount(expectedStoreCount, 300, 50);
         mapStoreConfig.setImplementation(mapStore);
         writeBehindBackupConfig.setMapStoreConfig(mapStoreConfig);
         // create nodes.
