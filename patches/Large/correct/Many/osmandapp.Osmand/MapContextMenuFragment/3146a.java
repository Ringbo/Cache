diff --git a/OsmAnd/src/net/osmand/plus/mapcontextmenu/MapContextMenuFragment.java b/OsmAnd/src/net/osmand/plus/mapcontextmenu/MapContextMenuFragment.java
index 80d7d4e..d4e6cea 100644
--- a/OsmAnd/src/net/osmand/plus/mapcontextmenu/MapContextMenuFragment.java
+++ b/OsmAnd/src/net/osmand/plus/mapcontextmenu/MapContextMenuFragment.java
@@ -498,13 +498,13 @@
 		List<TransportStopRoute> localTransportStopRoutes = menu.getMenuController().getLocalTransportStopRoutes();
 		List<TransportStopRoute> nearbyTransportStopRoutes = menu.getMenuController().getNearbyTransportStopRoutes();
 
-		if (localTransportStopRoutes.size() > 0) {
+		if (localTransportStopRoutes!=null&&localTransportStopRoutes.size() > 0) {
 			localTransportStopRoutesGrid.setAdapter(createTransportStopRouteAdapter(localTransportStopRoutes));
 			localTransportStopRoutesGrid.setVisibility(View.VISIBLE);
 		} else {
 			localTransportStopRoutesGrid.setVisibility(View.GONE);
 		}
-		if (nearbyTransportStopRoutes.size() > 0) {
+		if (nearbyTransportStopRoutes!=null&&nearbyTransportStopRoutes.size() > 0) {
 			String nearInDistance = getMyApplication().getString(R.string.transport_nearby_routes) + " "
 					+ OsmAndFormatter.getFormattedDistance(150, getMyApplication());
 			nearbRoutesWithinTv.setText(nearInDistance);
