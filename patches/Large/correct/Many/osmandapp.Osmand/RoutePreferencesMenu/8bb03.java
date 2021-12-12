diff --git a/OsmAnd/src/net/osmand/plus/mapcontextmenu/other/RoutePreferencesMenu.java b/OsmAnd/src/net/osmand/plus/mapcontextmenu/other/RoutePreferencesMenu.java
index 1723b09..4be0b25 100644
--- a/OsmAnd/src/net/osmand/plus/mapcontextmenu/other/RoutePreferencesMenu.java
+++ b/OsmAnd/src/net/osmand/plus/mapcontextmenu/other/RoutePreferencesMenu.java
@@ -700,7 +700,7 @@
 	private List<LocalRoutingParameter> getRoutingParametersInner(ApplicationMode am) {
 		List<LocalRoutingParameter> list = new ArrayList<LocalRoutingParameter>();
 		RouteProvider.GPXRouteParamsBuilder rparams = mapActivity.getRoutingHelper().getCurrentGPXRoute();
-		boolean osmandRouter = settings.ROUTER_SERVICE.get() == RouteProvider.RouteService.OSMAND;
+		boolean osmandRouter = settings.ROUTER_SERVICE.getModeValue(am) == RouteProvider.RouteService.OSMAND;
 		if (!osmandRouter) {
 			list.add(new OtherLocalRoutingParameter(R.string.calculate_osmand_route_without_internet,
 					getString(R.string.calculate_osmand_route_without_internet), settings.GPX_ROUTE_CALC_OSMAND_PARTS
