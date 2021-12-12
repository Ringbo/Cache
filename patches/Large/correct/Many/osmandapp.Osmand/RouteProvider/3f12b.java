diff --git a/OsmAnd/src/net/osmand/plus/routing/RouteProvider.java b/OsmAnd/src/net/osmand/plus/routing/RouteProvider.java
index 8042d02..cfc76b4 100644
--- a/OsmAnd/src/net/osmand/plus/routing/RouteProvider.java
+++ b/OsmAnd/src/net/osmand/plus/routing/RouteProvider.java
@@ -248,7 +248,7 @@
 			}
 		}
 		private void introduceFirstPoint(Location start) {
-			if (locations.get(0).distanceTo(start) > 200) {
+			if (!locations.isEmpty() && locations.get(0).distanceTo(start) > 200) {
 				// add start point
 				locations.add(0, start);
 				if (directions != null) {
