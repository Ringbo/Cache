diff --git a/OsmAnd-java/src/net/osmand/util/MapUtils.java b/OsmAnd-java/src/net/osmand/util/MapUtils.java
index d4cfdaa..9ce21d2 100644
--- a/OsmAnd-java/src/net/osmand/util/MapUtils.java
+++ b/OsmAnd-java/src/net/osmand/util/MapUtils.java
@@ -217,7 +217,7 @@
 	}
 	
 	public static double getPowZoom(float zoom){
-		if(zoom >= 0 && zoom - Math.floor(zoom) < 0.05f){
+		if(zoom >= 0 && zoom - Math.floor(zoom) < 0.001f){
 			return 1 << ((int)zoom); 
 		} else {
 			return Math.pow(2, zoom);
