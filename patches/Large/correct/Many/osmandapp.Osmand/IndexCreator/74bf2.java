diff --git a/DataExtractionOSM/src/net/osmand/data/preparation/IndexCreator.java b/DataExtractionOSM/src/net/osmand/data/preparation/IndexCreator.java
index 55c7cfe..4a28d3e 100644
--- a/DataExtractionOSM/src/net/osmand/data/preparation/IndexCreator.java
+++ b/DataExtractionOSM/src/net/osmand/data/preparation/IndexCreator.java
@@ -884,7 +884,7 @@
 			}
 		}
 		
-		if(boundary != null){
+		if (boundary != null && boundary.getCenterPoint() != null) {
 			LatLon point = boundary.getCenterPoint();
 			boolean cityFound = false; 
 			for (City c : cityManager.getClosestObjects(point.getLatitude(), point.getLongitude(), 3)) {
