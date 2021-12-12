diff --git a/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java b/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
index d8adb67..9b5a1b3 100644
--- a/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
+++ b/OsmAnd/src/net/osmand/plus/routing/RoutingHelper.java
@@ -292,7 +292,7 @@
 			Thread job = currentRunningJob;
 			if(job instanceof RouteRecalculationThread) {
 				RouteRecalculationThread thread = (RouteRecalculationThread) job;
-				if(thread.isParamsChanged()) {
+				if(!thread.isParamsChanged()) {
 					thread.stopCalculation();
 				}
 			}
