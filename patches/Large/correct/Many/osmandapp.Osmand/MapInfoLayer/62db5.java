diff --git a/OsmAnd/src/net/osmand/plus/views/MapInfoLayer.java b/OsmAnd/src/net/osmand/plus/views/MapInfoLayer.java
index 1c89e5f..6e557d7 100644
--- a/OsmAnd/src/net/osmand/plus/views/MapInfoLayer.java
+++ b/OsmAnd/src/net/osmand/plus/views/MapInfoLayer.java
@@ -704,7 +704,7 @@
 					makeUturnWhenPossible = routingHelper.makeUturnWhenPossible() ;
 					if (makeUturnWhenPossible) {
 						visible = true;
-						turnImminent = 1;
+						turnImminent = 0;
 						turnType = TurnType.valueOf(TurnType.TU, view.getSettings().LEFT_SIDE_NAVIGATION.get());
 						TurnPathHelper.calcTurnPath(pathForTurn, turnType, pathTransform);
 						invalidate();
