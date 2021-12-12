diff --git a/hazelcast/src/test/java/com/hazelcast/map/mapstore/MapLoaderFailoverTest.java b/hazelcast/src/test/java/com/hazelcast/map/mapstore/MapLoaderFailoverTest.java
index 4d6c201..e7797f1 100644
--- a/hazelcast/src/test/java/com/hazelcast/map/mapstore/MapLoaderFailoverTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/map/mapstore/MapLoaderFailoverTest.java
@@ -108,7 +108,7 @@
         assertSizeAndLoadCount(map);
 
         hz3.getLifecycleService().terminate();
-        assertClusterSize(2, nodes[0]);
+        assertClusterSizeEventually(2, nodes[0]);
         map.loadAll(true);
 
         assertSizeEventually(MAP_STORE_ENTRY_COUNT, map);
@@ -132,7 +132,7 @@
         pausingLoader.awaitPause();
 
         hz3.getLifecycleService().terminate();
-        assertClusterSize(2, nodes[0]);
+        assertClusterSizeEventually(2, nodes[0]);
 
         pausingLoader.resume();
 
