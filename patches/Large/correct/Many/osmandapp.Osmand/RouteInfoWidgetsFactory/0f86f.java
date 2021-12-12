diff --git a/OsmAnd/src/net/osmand/plus/views/mapwidgets/RouteInfoWidgetsFactory.java b/OsmAnd/src/net/osmand/plus/views/mapwidgets/RouteInfoWidgetsFactory.java
index 131da2d..25bdf7c 100644
--- a/OsmAnd/src/net/osmand/plus/views/mapwidgets/RouteInfoWidgetsFactory.java
+++ b/OsmAnd/src/net/osmand/plus/views/mapwidgets/RouteInfoWidgetsFactory.java
@@ -649,7 +649,7 @@
 
 			this.scaleCoefficient = scaleCoefficent;
 			laneStraight = getPathFromTurnType(paths, TurnType.C, null, scaleCoefficient / miniCoeff);
-			laneStraightBitmap = TurnPathHelper.getBitmapFromTurnType(ctx.getResources(), bitmapCache, TurnType.C, 0, 0, TurnPathHelper.FIRST_TURN, null, scaleCoefficient / miniCoeff, leftSide);
+			laneStraightBitmap = TurnPathHelper.getBitmapFromTurnType(ctx.getResources(), bitmapCache, TurnType.C, 0, 0, TurnPathHelper.FIRST_TURN, scaleCoefficient / miniCoeff, leftSide);
 			paintBlack = new Paint();
 			paintBlack.setStyle(Style.STROKE);
 			paintBlack.setColor(Color.BLACK);
