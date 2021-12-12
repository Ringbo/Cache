diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/igfs/IgfsStreamsSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/igfs/IgfsStreamsSelfTest.java
index 86e4c31..254161a 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/igfs/IgfsStreamsSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/igfs/IgfsStreamsSelfTest.java
@@ -153,7 +153,7 @@
      * @throws IgniteCheckedException In case of exception.
      */
     public void testConfiguration() throws IgniteCheckedException {
-        GridCacheProxyImpl metaCache = getFieldValue(fs, "meta", "metaCache");
+        GridCacheAdapter metaCache = getFieldValue(fs, "meta", "metaCache");
         GridCacheAdapter dataCache = getFieldValue(fs, "data", "dataCache");
 
         assertNotNull(metaCache);
