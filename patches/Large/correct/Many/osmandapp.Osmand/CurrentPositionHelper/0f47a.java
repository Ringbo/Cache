diff --git a/OsmAnd/src/net/osmand/plus/CurrentPositionHelper.java b/OsmAnd/src/net/osmand/plus/CurrentPositionHelper.java
index b54cd0c..adfc5ad 100644
--- a/OsmAnd/src/net/osmand/plus/CurrentPositionHelper.java
+++ b/OsmAnd/src/net/osmand/plus/CurrentPositionHelper.java
@@ -38,15 +38,15 @@
 
 	private void initCtx(OsmandApplication app) {
 		am = app.getSettings().getApplicationMode();
-		GeneralRouterProfile p ;
+		String p ;
 		if (am.isDerivedRoutingFrom(ApplicationMode.BICYCLE)) {
-			p = GeneralRouterProfile.BICYCLE;
+			p = GeneralRouterProfile.BICYCLE.name().toLowerCase();
 		} else if (am.isDerivedRoutingFrom(ApplicationMode.PEDESTRIAN)) {
-			p = GeneralRouterProfile.PEDESTRIAN;
+			p = GeneralRouterProfile.PEDESTRIAN.name().toLowerCase();
 		} else if (am.isDerivedRoutingFrom(ApplicationMode.CAR)) {
-			p = GeneralRouterProfile.CAR;
+			p = GeneralRouterProfile.CAR.name().toLowerCase();
 		} else {
-			p = GeneralRouterProfile.CAR;
+			p = "geocoding";
 		}
 		BinaryMapIndexReader[] rs = new BinaryMapIndexReader[app.getResourceManager().getAddressRepositories().size()];
 		if (rs.length > 0) {
@@ -54,10 +54,10 @@
 			for (RegionAddressRepository rep : app.getResourceManager().getAddressRepositories()) {
 				rs[i++] = rep.getFile();
 			}
-			RoutingConfiguration cfg = app.getDefaultRoutingConfig().build(p.name().toLowerCase(), 10,
+			RoutingConfiguration cfg = app.getDefaultRoutingConfig().build(p, 10,
 					new HashMap<String, String>());
 			ctx = new RoutePlannerFrontEnd(false).buildRoutingContext(cfg, null, rs);
-			RoutingConfiguration defCfg = app.getDefaultRoutingConfig().build(GeneralRouterProfile.CAR.name().toLowerCase(), 10,
+			RoutingConfiguration defCfg = app.getDefaultRoutingConfig().build("geocoding", 10,
 					new HashMap<String, String>());
 			defCtx = new RoutePlannerFrontEnd(false).buildRoutingContext(defCfg, null, rs);
 		} else {
