diff --git a/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java b/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
index 29ccb1b..8686a52 100644
--- a/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
+++ b/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
@@ -254,7 +254,7 @@
 		boolean calculateRoute = false;
 		synchronized (this) {
 			// 0. Route empty or needs to be extended? Then re-calculate route.
-			if(route.isEmpty()) {
+			if(route.isEmpty() || (settings.getPointToStart() != null)) {
 				calculateRoute = true;
 			} else {
 				// 1. Update current route position status according to latest received location
