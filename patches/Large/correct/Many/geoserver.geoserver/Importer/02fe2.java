diff --git a/src/extension/importer/core/src/main/java/org/geoserver/importer/Importer.java b/src/extension/importer/core/src/main/java/org/geoserver/importer/Importer.java
index 9aa3b88..6da847f 100644
--- a/src/extension/importer/core/src/main/java/org/geoserver/importer/Importer.java
+++ b/src/extension/importer/core/src/main/java/org/geoserver/importer/Importer.java
@@ -921,7 +921,7 @@
             if (task.getLayer().getResource() instanceof FeatureTypeInfo) {
                 FeatureTypeInfo featureType = (FeatureTypeInfo) task.getLayer().getResource();
                 FeatureTypeInfo resource = getCatalog().getResourceByName(
-                        featureType.getName(), FeatureTypeInfo.class);
+                        featureType.getQualifiedName(), FeatureTypeInfo.class);
                 calculateBounds(resource);
             }
 
