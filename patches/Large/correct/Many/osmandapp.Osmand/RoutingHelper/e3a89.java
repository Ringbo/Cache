diff --git a/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java b/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
index 1904ad4..0377985 100644
--- a/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
+++ b/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
@@ -595,7 +595,7 @@
 				if (showToast.value) {
 					String msg = app.getString(R.string.new_route_calculated_dist) + ": "
 							+ OsmAndFormatter.getFormattedDistance(res.getWholeDistance(), app);
-					if (res.getRoutingTime() != 0f) {
+					if (OsmandPlugin.isDevelopment() && res.getRoutingTime() != 0f) {
 						msg += " (" + Algorithms.formatDuration((int) res.getRoutingTime()) + ")";
 					}
 					app.showToastMessage(msg);
