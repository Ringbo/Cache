diff --git a/OsmAnd/src/net/osmand/plus/views/RouteInfoControls.java b/OsmAnd/src/net/osmand/plus/views/RouteInfoControls.java
index f7bd4e97..91e91a3 100644
--- a/OsmAnd/src/net/osmand/plus/views/RouteInfoControls.java
+++ b/OsmAnd/src/net/osmand/plus/views/RouteInfoControls.java
@@ -603,7 +603,7 @@
 	
 	
 	public boolean distChanged(int oldDist, int dist){
-		if(oldDist != 0 && Math.abs(oldDist - dist) > 10){
+		if(oldDist != 0 && Math.abs(oldDist - dist) < 10){
 			return false;
 		}
 		return true;
