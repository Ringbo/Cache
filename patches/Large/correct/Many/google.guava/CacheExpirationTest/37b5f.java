diff --git a/guava-tests/test/com/google/common/cache/CacheExpirationTest.java b/guava-tests/test/com/google/common/cache/CacheExpirationTest.java
index c2c221e..e0c53c6 100644
--- a/guava-tests/test/com/google/common/cache/CacheExpirationTest.java
+++ b/guava-tests/test/com/google/common/cache/CacheExpirationTest.java
@@ -440,7 +440,7 @@
     assertEquals(10, removalListener.getCount());
   }
 
-  private void getAll(LoadingCache<Integer, Integer> cache, List<Integer> keys) {
+  private static void getAll(LoadingCache<Integer, Integer> cache, List<Integer> keys) {
     for (int i : keys) {
       cache.getUnchecked(i);
     }
