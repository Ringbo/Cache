diff --git a/src/gwc/src/test/java/org/geoserver/gwc/GWCTest.java b/src/gwc/src/test/java/org/geoserver/gwc/GWCTest.java
index 93aeb74..e99d4f9 100644
--- a/src/gwc/src/test/java/org/geoserver/gwc/GWCTest.java
+++ b/src/gwc/src/test/java/org/geoserver/gwc/GWCTest.java
@@ -247,7 +247,8 @@
         tileLayer = new GeoServerTileLayer(layer, gridSetBroker, tileLayerInfo);
         GridSet testGridSet = namedGridsetCopy("TEST", gridSetBroker.getDefaults().worldEpsg4326());
 
-        GridSubset testGridSubset = GridSubsetFactory.createGridSubSet(testGridSet);
+        GridSubset testGridSubset = GridSubsetFactory.createGridSubSet(testGridSet, new BoundingBox(-180,0,0,90),
+                0, testGridSet.getGridLevels().length - 1);
         when(xmlConfig.getGridSet(eq("TEST"))).thenReturn(Optional.of(testGridSet));
         tileLayer.addGridSubset(testGridSubset);
         tileLayerGroup = new GeoServerTileLayer(layerGroup, gridSetBroker, tileLayerGroupInfo);
@@ -757,8 +758,7 @@
         ReferencedEnvelope bounds;
         // bounds outside layer bounds (which are -180,0,0,90)
         bounds = new ReferencedEnvelope(10, 20, 10, 20, DefaultGeographicCRS.WGS84);
-        BoundingBox layerBounds = tileLayer.getGridSubset("EPSG:4326").getGridSet()
-                .getOriginalExtent();
+        BoundingBox layerBounds = tileLayer.getGridSubset("EPSG:4326").getOriginalExtent();
 
         assertFalse(bounds.intersects(layerBounds.getMinX(), layerBounds.getMinY()));
         assertFalse(bounds.intersects(layerBounds.getMaxX(), layerBounds.getMaxY()));
