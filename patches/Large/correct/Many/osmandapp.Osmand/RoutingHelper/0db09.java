diff --git a/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java b/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
index ce93989..d822b7f 100644
--- a/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
+++ b/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
@@ -501,11 +501,11 @@
 										+ " : " + OsmAndFormatter.getFormattedDistance(l, context)); //$NON-NLS-1$
 							} else {
 								if (res.getErrorMessage() != null) {
-									showMessage(context.getString(R.string.error_calculating_route) + " : " + res.getErrorMessage()); //$NON-NLS-1$
+									showMessage(context.getString(R.string.error_calculating_route) + " : " + res.getErrorMessage(), Toast.LENGTH_LONG); //$NON-NLS-1$
 								} else if (res.getLocations() == null) {
-									showMessage(context.getString(R.string.error_calculating_route_occured));
+									showMessage(context.getString(R.string.error_calculating_route_occured), Toast.LENGTH_LONG);
 								} else {
-									showMessage(context.getString(R.string.empty_route_calculated));
+									showMessage(context.getString(R.string.empty_route_calculated), Toast.LENGTH_LONG);
 								}
 							}
 							lastTimeEvaluatedRoute = System.currentTimeMillis();
