diff --git a/redisson/src/test/java/org/redisson/ConcurrentRedissonSortedSetTest.java b/redisson/src/test/java/org/redisson/ConcurrentRedissonSortedSetTest.java
index df9b620..241b2d2 100644
--- a/redisson/src/test/java/org/redisson/ConcurrentRedissonSortedSetTest.java
+++ b/redisson/src/test/java/org/redisson/ConcurrentRedissonSortedSetTest.java
@@ -40,7 +40,7 @@
 
         Collections.sort(elements);
         Integer[] p = elements.toArray(new Integer[elements.size()]);
-        assertThat(map).contains(p);
+        assertThat(map).containsExactly(p);
 
         map.clear();
         r.shutdown();
