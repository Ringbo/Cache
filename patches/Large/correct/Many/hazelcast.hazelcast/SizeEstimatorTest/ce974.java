diff --git a/hazelcast/src/test/java/com/hazelcast/map/SizeEstimatorTest.java b/hazelcast/src/test/java/com/hazelcast/map/SizeEstimatorTest.java
index 666db8c..55e3c94 100644
--- a/hazelcast/src/test/java/com/hazelcast/map/SizeEstimatorTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/map/SizeEstimatorTest.java
@@ -56,7 +56,7 @@
 
         final IMap<Integer, Long> map = h.getMap(MAP_NAME);
         map.put(0, 10L);
-        assertEquals(148, map.getLocalMapStats().getHeapCost());
+        assertEquals(156, map.getLocalMapStats().getHeapCost());
     }
 
     @Test
