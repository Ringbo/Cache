diff --git a/OsmAnd/src/net/osmand/plus/activities/SettingsActivity.java b/OsmAnd/src/net/osmand/plus/activities/SettingsActivity.java
index 7e25728..f160561 100644
--- a/OsmAnd/src/net/osmand/plus/activities/SettingsActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/SettingsActivity.java
@@ -403,7 +403,7 @@
 			if(VECTOR_MAP.equals((String) newValue)){
 				osmandSettings.setUsingMapVectorData(true);
 			} else {
-				osmandSettings.setUsingMapVectorData(true);
+				osmandSettings.setUsingMapVectorData(false);
 				osmandSettings.setMapTileSource((String) newValue);
 			}
 			updateTileSourceSummary();
