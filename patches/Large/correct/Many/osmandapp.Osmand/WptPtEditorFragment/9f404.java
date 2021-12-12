diff --git a/OsmAnd/src/net/osmand/plus/mapcontextmenu/editors/WptPtEditorFragment.java b/OsmAnd/src/net/osmand/plus/mapcontextmenu/editors/WptPtEditorFragment.java
index 9a3b6c8..704ff11 100644
--- a/OsmAnd/src/net/osmand/plus/mapcontextmenu/editors/WptPtEditorFragment.java
+++ b/OsmAnd/src/net/osmand/plus/mapcontextmenu/editors/WptPtEditorFragment.java
@@ -164,7 +164,7 @@
 
 		MapContextMenu menu = getMapActivity().getContextMenu();
 
-		if (menu.getLatLon() != null) {
+		if (menu.getLatLon() != null && menu.isActive()) {
 
 			LatLon latLon = new LatLon(wpt.getLatitude(), wpt.getLongitude());
 
