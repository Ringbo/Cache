diff --git a/guava-tests/test/com/google/common/cache/EmptyCachesTest.java b/guava-tests/test/com/google/common/cache/EmptyCachesTest.java
index 994f236..38d5945 100644
--- a/guava-tests/test/com/google/common/cache/EmptyCachesTest.java
+++ b/guava-tests/test/com/google/common/cache/EmptyCachesTest.java
@@ -379,7 +379,7 @@
             DurationSpec.of(1, DAYS)));
   }
 
-  private void warmUp(LoadingCache<Object, Object> cache, int minimum, int maximum) {
+  private static void warmUp(LoadingCache<Object, Object> cache, int minimum, int maximum) {
     for (int i = minimum; i < maximum; i++) {
       cache.getUnchecked(i);
     }
