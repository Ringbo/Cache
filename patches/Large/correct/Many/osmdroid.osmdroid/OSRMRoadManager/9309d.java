diff --git a/osmdroid-android/src/org/osmdroid/bonuspack/routing/OSRMRoadManager.java b/osmdroid-android/src/org/osmdroid/bonuspack/routing/OSRMRoadManager.java
index 308fc86..af2f6ef 100644
--- a/osmdroid-android/src/org/osmdroid/bonuspack/routing/OSRMRoadManager.java
+++ b/osmdroid-android/src/org/osmdroid/bonuspack/routing/OSRMRoadManager.java
@@ -193,7 +193,7 @@
 		try {
 			JSONObject jObject = new JSONObject(jString);
 			String route_geometry = jObject.getString("route_geometry");
-			road.mRouteHigh = PolylineEncoder.decode(route_geometry, 10);
+			road.mRouteHigh = PolylineEncoder.decode(route_geometry, 1);
 			JSONArray jInstructions = jObject.getJSONArray("route_instructions");
 			int n = jInstructions.length();
 			RoadNode lastNode = null;
