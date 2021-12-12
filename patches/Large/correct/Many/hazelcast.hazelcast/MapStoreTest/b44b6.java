diff --git a/hazelcast/src/test/java/com/hazelcast/map/mapstore/MapStoreTest.java b/hazelcast/src/test/java/com/hazelcast/map/mapstore/MapStoreTest.java
index 91eefc9..8be999c 100644
--- a/hazelcast/src/test/java/com/hazelcast/map/mapstore/MapStoreTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/map/mapstore/MapStoreTest.java
@@ -1293,7 +1293,7 @@
         for (int i = 0; i < size; i++) {
             map.put(i, i);
         }
-        instance2.getLifecycleService().terminate();
+        instance2.getLifecycleService().shutdown();
         mapStore.awaitStores();
     }
 
