diff --git a/OsmAnd/src/net/osmand/plus/mapcontextmenu/MapContextMenu.java b/OsmAnd/src/net/osmand/plus/mapcontextmenu/MapContextMenu.java
index dcab53a..843e268 100644
--- a/OsmAnd/src/net/osmand/plus/mapcontextmenu/MapContextMenu.java
+++ b/OsmAnd/src/net/osmand/plus/mapcontextmenu/MapContextMenu.java
@@ -898,7 +898,8 @@
 
 	public PointDescription getPointDescriptionForMarker() {
 		PointDescription pd = getPointDescriptionForTarget();
-		if (Algorithms.isEmpty(pd.getName()) && !nameStr.equals(PointDescription.getAddressNotFoundStr(mapActivity))) {
+		if (Algorithms.isEmpty(pd.getName()) && !Algorithms.isEmpty(nameStr)
+				&& !nameStr.equals(PointDescription.getAddressNotFoundStr(mapActivity))) {
 			return new PointDescription(PointDescription.POINT_TYPE_MAP_MARKER, nameStr);
 		} else {
 			return pd;
