diff --git a/OsmAnd/src/net/osmand/plus/routing/RouteAnimation.java b/OsmAnd/src/net/osmand/plus/routing/RouteAnimation.java
index 2690111..d9764ab 100644
--- a/OsmAnd/src/net/osmand/plus/routing/RouteAnimation.java
+++ b/OsmAnd/src/net/osmand/plus/routing/RouteAnimation.java
@@ -103,7 +103,7 @@
 						current.setSpeed(meters / intervalTime * coeff);	
 					}
 					current.setTime(System.currentTimeMillis());
-					if(!current.hasAccuracy()) {
+					if(!current.hasAccuracy() || Double.isNaN(current.getAccuracy())) {
 						current.setAccuracy(5);
 					}
 					if (prev != null && prev.distanceTo(current) > 3) {
