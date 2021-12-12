diff --git a/OsmAnd/src/net/osmand/plus/parkingpoint/ParkingPositionPlugin.java b/OsmAnd/src/net/osmand/plus/parkingpoint/ParkingPositionPlugin.java
index b45def4..a823b93 100644
--- a/OsmAnd/src/net/osmand/plus/parkingpoint/ParkingPositionPlugin.java
+++ b/OsmAnd/src/net/osmand/plus/parkingpoint/ParkingPositionPlugin.java
@@ -409,7 +409,7 @@
 			 * @return
 			 */
 			private boolean distChanged(int oldDist, int dist){
-				if(oldDist != 0 && Math.abs(oldDist - dist) > 30){
+				if(oldDist != 0 && Math.abs(oldDist - dist) < 30){
 					return false;
 				}
 				return true;
