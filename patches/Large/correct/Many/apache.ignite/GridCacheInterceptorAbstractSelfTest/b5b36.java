diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheInterceptorAbstractSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheInterceptorAbstractSelfTest.java
index ae6c5e1..e321cf2 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheInterceptorAbstractSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheInterceptorAbstractSelfTest.java
@@ -1335,7 +1335,7 @@
      * @param expVal Expected value.
      * @throws Exception If failed.
      */
-    private void checkCacheValue(Object key, @Nullable Object expVal) throws Exception {
+    private void checkCacheValue(String key, @Nullable Object expVal) throws Exception {
         interceptor.disabled = true;
 
         if (storeEnabled())
@@ -1343,7 +1343,7 @@
 
         try {
             for (int i = 0; i < gridCount(); i++)
-                assertEquals("Unexpected value for grid " + i, expVal, grid(i).cache(null).get(key));
+                assertEquals("Unexpected value for grid " + i, expVal, jcache(i).get(key));
         }
         finally {
             interceptor.disabled = false;
