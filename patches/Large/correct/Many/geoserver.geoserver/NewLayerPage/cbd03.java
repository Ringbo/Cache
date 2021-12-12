diff --git a/src/web/core/src/main/java/org/geoserver/web/data/layer/NewLayerPage.java b/src/web/core/src/main/java/org/geoserver/web/data/layer/NewLayerPage.java
index f1fb26e..4c039d3 100644
--- a/src/web/core/src/main/java/org/geoserver/web/data/layer/NewLayerPage.java
+++ b/src/web/core/src/main/java/org/geoserver/web/data/layer/NewLayerPage.java
@@ -114,7 +114,7 @@
                     final CatalogIconFactory icons = CatalogIconFactory.get();
                     if(resource.isPublished()) {
                         PackageResourceReference icon = icons.getEnabledIcon();
-                        Fragment f = new Fragment(id, "iconFragment", NewLayerPage.this);
+                        Fragment f = new Fragment(id, "iconFragment", selectLayers);
                         f.add(new Image("layerIcon", icon));
                         return f;
                     } else {
