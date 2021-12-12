diff --git a/OsmAnd/src/net/osmand/plus/activities/MapActivity.java b/OsmAnd/src/net/osmand/plus/activities/MapActivity.java
index 37e00ec..29f7b10 100644
--- a/OsmAnd/src/net/osmand/plus/activities/MapActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/MapActivity.java
@@ -713,7 +713,7 @@
 					if(mapView.getZoom() != z && !mapView.mapIsAnimating()){
 						long now = System.currentTimeMillis();
 						// prevent ui hysterisis (check time interval for autozoom)
-						if(Math.abs(mapView.getZoom() - z) > 1 || (lastTimeAutoZooming - now) > 6500){
+						if((lastTimeAutoZooming - now) > 6500){
 							lastTimeAutoZooming = now;
 							mapView.setZoom(z);
 						}
@@ -740,10 +740,10 @@
 
 	public int defineZoomFromSpeed(float speed, int currentZoom){
 		speed *= 3.6;
-   	 	if(speed < 4){
+   	 	if(speed < 5){
 			return currentZoom;
+		// less than 23: show zoom 17 
 		} else if(speed < 23){
-			// less than 23 - show 17 
 			return 17;
 		} else if(speed < 43){
 			return 16;
