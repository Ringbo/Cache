diff --git a/OsmAnd/src/net/osmand/plus/routing/RouteProvider.java b/OsmAnd/src/net/osmand/plus/routing/RouteProvider.java
index fb46e25..dedcfd7 100644
--- a/OsmAnd/src/net/osmand/plus/routing/RouteProvider.java
+++ b/OsmAnd/src/net/osmand/plus/routing/RouteProvider.java
@@ -1024,7 +1024,7 @@
 			}
 		}
 		params.intermediates = null;
-		return new RouteCalculationResult(res, null, params, null);
+		return new RouteCalculationResult(res, null, params, null, true);
 	}
 
 	public GPXFile createOsmandRouterGPX(RouteCalculationResult srcRoute, OsmandApplication ctx) {	
