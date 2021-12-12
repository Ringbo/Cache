diff --git a/OsmAnd/src/net/osmand/plus/views/POIMapLayer.java b/OsmAnd/src/net/osmand/plus/views/POIMapLayer.java
index 4cc668c..76f2af0 100644
--- a/OsmAnd/src/net/osmand/plus/views/POIMapLayer.java
+++ b/OsmAnd/src/net/osmand/plus/views/POIMapLayer.java
@@ -392,11 +392,12 @@
 		}
 		if(Algorithms.isEmpty(lng)) {
 			//TODO: Third choice to display wiki article in if it does not exist in the OsmAnd locale or "en" should be the longest article (most information, usually the on in the region's local language)
-			lng = a.getNameSelected();
+			lng = a.getNameSelected(null);
 		}
 		// This should not occur
 		if(Algorithms.isEmpty(lng)) {
-			lng = "EN";
+			//lng = "EN";
+			lng = "XX";
 		}
 
 		final String langSelected = lng;
