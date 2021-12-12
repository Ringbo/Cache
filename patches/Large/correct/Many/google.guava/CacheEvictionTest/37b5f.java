diff --git a/guava-tests/test/com/google/common/cache/CacheEvictionTest.java b/guava-tests/test/com/google/common/cache/CacheEvictionTest.java
index 041a212..e70a5a5 100644
--- a/guava-tests/test/com/google/common/cache/CacheEvictionTest.java
+++ b/guava-tests/test/com/google/common/cache/CacheEvictionTest.java
@@ -411,7 +411,7 @@
     assertThat(keySet).containsExactly(5, 6, 7, 8, 9, 10, 11, 12);
   }
 
-  private void getAll(LoadingCache<Integer, Integer> cache, List<Integer> keys) {
+  private static void getAll(LoadingCache<Integer, Integer> cache, List<Integer> keys) {
     for (int i : keys) {
       cache.getUnchecked(i);
     }
