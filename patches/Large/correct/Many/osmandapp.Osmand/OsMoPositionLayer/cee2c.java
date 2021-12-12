diff --git a/OsmAnd/src/net/osmand/plus/osmo/OsMoPositionLayer.java b/OsmAnd/src/net/osmand/plus/osmo/OsMoPositionLayer.java
index 416f131..c21e131 100644
--- a/OsmAnd/src/net/osmand/plus/osmo/OsMoPositionLayer.java
+++ b/OsmAnd/src/net/osmand/plus/osmo/OsMoPositionLayer.java
@@ -86,7 +86,7 @@
 		final int r = getRadiusPoi(tb);
 		for (OsMoDevice t : getTrackingDevices()) {
 			Location l = t.getLastLocation();
-			if (t != null) {
+			if (l != null) {
 				int x = (int) tb.getPixXFromLatLon(l.getLatitude(), l.getLongitude());
 				int y = (int) tb.getPixYFromLatLon(l.getLatitude(), l.getLongitude());
 				pointAltUI.setColor(t.getColor());
