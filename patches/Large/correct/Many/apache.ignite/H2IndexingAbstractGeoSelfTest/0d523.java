diff --git a/modules/geospatial/src/test/java/org/apache/ignite/internal/processors/query/h2/H2IndexingAbstractGeoSelfTest.java b/modules/geospatial/src/test/java/org/apache/ignite/internal/processors/query/h2/H2IndexingAbstractGeoSelfTest.java
index fb6a104..e9f96e3 100644
--- a/modules/geospatial/src/test/java/org/apache/ignite/internal/processors/query/h2/H2IndexingAbstractGeoSelfTest.java
+++ b/modules/geospatial/src/test/java/org/apache/ignite/internal/processors/query/h2/H2IndexingAbstractGeoSelfTest.java
@@ -227,7 +227,7 @@
         if (!dynamic)
             cache.destroy();
         else
-            grid.context().cache().dynamicDestroyCache(cache.getName(), true, true);
+            grid.context().cache().dynamicDestroyCache(cache.getName(), true, true, false);
     }
 
     /**
