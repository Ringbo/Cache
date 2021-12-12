diff --git a/OsmAnd/src/net/osmand/plus/routing/RouteProvider.java b/OsmAnd/src/net/osmand/plus/routing/RouteProvider.java
index 05c6d9f..a2f092f 100644
--- a/OsmAnd/src/net/osmand/plus/routing/RouteProvider.java
+++ b/OsmAnd/src/net/osmand/plus/routing/RouteProvider.java
@@ -405,7 +405,7 @@
 			RoutingParameter pr = e.getValue();
 			String vl;
 			if(key.equals(GeneralRouter.USE_SHORTEST_WAY)) {
-				Boolean bool = settings.FAST_ROUTE_MODE.getModeValue(params.mode);
+				Boolean bool = !settings.FAST_ROUTE_MODE.getModeValue(params.mode);
 				vl = bool ? "true" : null;
 			} else if(pr.getType() == RoutingParameterType.BOOLEAN) {
 				CommonPreference<Boolean> pref = settings.getCustomRoutingBooleanProperty(key);
