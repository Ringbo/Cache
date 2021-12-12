diff --git a/src/main/src/test/java/org/geoserver/catalog/ResourcePoolTest.java b/src/main/src/test/java/org/geoserver/catalog/ResourcePoolTest.java
index 3098d1d..b691e6e 100644
--- a/src/main/src/test/java/org/geoserver/catalog/ResourcePoolTest.java
+++ b/src/main/src/test/java/org/geoserver/catalog/ResourcePoolTest.java
@@ -207,7 +207,9 @@
         gs.save(global);
 
         Catalog catalog = getCatalog();
-        assertEquals(200, ((SoftValueHashMap)catalog.getResourcePool().getFeatureTypeCache()).getHardReferencesCount());
+        // we actually keep two versions of the feature type in the cache, so we need it 
+        // twice as big
+        assertEquals(400, ((SoftValueHashMap)catalog.getResourcePool().getFeatureTypeCache()).getHardReferencesCount());
     }
     
     @Test public void testDropCoverageStore() throws Exception {
