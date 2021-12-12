diff --git a/OsmAndCore-sample/src/net/osmand/core/samples/android/sample1/CurrentPositionHelper.java b/OsmAndCore-sample/src/net/osmand/core/samples/android/sample1/CurrentPositionHelper.java
index 07f06e0..db679b7 100644
--- a/OsmAndCore-sample/src/net/osmand/core/samples/android/sample1/CurrentPositionHelper.java
+++ b/OsmAndCore-sample/src/net/osmand/core/samples/android/sample1/CurrentPositionHelper.java
@@ -117,7 +117,7 @@
 		if (rs.length > 0) {
 			RoutingConfiguration defCfg = RoutingConfiguration.getDefault().build("geocoding", 10,
 					new HashMap<String, String>());
-			defCtx = new RoutePlannerFrontEnd(false).buildRoutingContext(defCfg, null, rs);
+			defCtx = new RoutePlannerFrontEnd().buildRoutingContext(defCfg, null, rs);
 		} else {
 			defCtx = null;
 		}
