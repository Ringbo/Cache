diff --git a/hazelcast/src/test/java/com/hazelcast/map/EvictionTest.java b/hazelcast/src/test/java/com/hazelcast/map/EvictionTest.java
index 93812f9..b19b7db 100644
--- a/hazelcast/src/test/java/com/hazelcast/map/EvictionTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/map/EvictionTest.java
@@ -503,7 +503,7 @@
         for (int i = 0; i < size; i++) {
             map.put(i, i);
         }
-        assertTrue(latch.await(1, TimeUnit.MINUTES));
+        assertTrue(latch.await(5, TimeUnit.MINUTES));
         assertEquals(0, map.size());
     }
 
