diff --git a/OsmAnd-java/src/net/osmand/plus/routing/RouteProvider.java b/OsmAnd-java/src/net/osmand/plus/routing/RouteProvider.java
index 764a2d9..8458a76 100644
--- a/OsmAnd-java/src/net/osmand/plus/routing/RouteProvider.java
+++ b/OsmAnd-java/src/net/osmand/plus/routing/RouteProvider.java
@@ -465,7 +465,7 @@
 		if (ApplicationMode.PEDESTRIAN == params.mode) {
 			uri.append("foot.gpx"); //$NON-NLS-1$
 		} else if (ApplicationMode.BICYCLE == params.mode) {
-			speed = 5.5f;
+			speed = 4.2f;
 			uri.append("bicycle.gpx"); //$NON-NLS-1$
 		} else {
 			speed = 15.3f;
