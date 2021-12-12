diff --git a/OsmAnd/src/net/osmand/plus/routing/RouteProvider.java b/OsmAnd/src/net/osmand/plus/routing/RouteProvider.java
index 1925272..8c9b20c 100644
--- a/OsmAnd/src/net/osmand/plus/routing/RouteProvider.java
+++ b/OsmAnd/src/net/osmand/plus/routing/RouteProvider.java
@@ -331,19 +331,19 @@
 			p = GeneralRouterProfile.CAR;
 		}
 		List<String> specs = new ArrayList<String>();
-		if (!app.getSettings().FAST_ROUTE_MODE.get()) {
+		if (!app.getSettings().FAST_ROUTE_MODE.getModeValue(params.mode)) {
 			specs.add(GeneralRouter.USE_SHORTEST_WAY);
 		}
-		if(app.getSettings().AVOID_FERRIES.get()){
+		if(app.getSettings().AVOID_FERRIES.getModeValue(params.mode)){
 			specs.add(GeneralRouter.AVOID_FERRIES);
 		}
-		if(app.getSettings().AVOID_TOLL_ROADS.get()){
+		if(app.getSettings().AVOID_TOLL_ROADS.getModeValue(params.mode)){
 			specs.add(GeneralRouter.AVOID_TOLL);
 		}
-		if(app.getSettings().AVOID_MOTORWAY.get()){
+		if(app.getSettings().AVOID_MOTORWAY.getModeValue(params.mode)){
 			specs.add(GeneralRouter.AVOID_MOTORWAY);
 		}
-		if(app.getSettings().AVOID_UNPAVED_ROADS.get()){
+		if(app.getSettings().AVOID_UNPAVED_ROADS.getModeValue(params.mode)){
 			specs.add(GeneralRouter.AVOID_UNPAVED);
 		}
 		String[] specialization = specs.toArray(new String[specs.size()]);
