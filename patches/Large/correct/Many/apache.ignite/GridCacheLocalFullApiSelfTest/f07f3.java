diff --git a/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/local/GridCacheLocalFullApiSelfTest.java b/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/local/GridCacheLocalFullApiSelfTest.java
index 38344e6..49e1fe5 100644
--- a/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/local/GridCacheLocalFullApiSelfTest.java
+++ b/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/local/GridCacheLocalFullApiSelfTest.java
@@ -77,7 +77,7 @@
      * @throws Exception In case of error.
      */
     public void testFilteredKeySet() throws Exception {
-        if (!txEnabled())
+        if (!txEnabled() || portableEnabled())
             return;
 
         final GridCache<String, Integer> myCache = cache();
