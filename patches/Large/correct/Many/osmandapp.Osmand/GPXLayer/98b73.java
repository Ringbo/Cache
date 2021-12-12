diff --git a/OsmAnd/src/net/osmand/plus/views/GPXLayer.java b/OsmAnd/src/net/osmand/plus/views/GPXLayer.java
index b1c5ff0..f4afdb3 100644
--- a/OsmAnd/src/net/osmand/plus/views/GPXLayer.java
+++ b/OsmAnd/src/net/osmand/plus/views/GPXLayer.java
@@ -148,7 +148,7 @@
 		paintInnerCircle.setAntiAlias(true);
 		paintInnerRect = new Paint();
 		paintInnerRect.setStyle(Style.FILL_AND_STROKE);
-		paintInnerCircle.setColor(0xddFFFFFF);
+		paintInnerRect.setColor(0xddFFFFFF);
 		paintInnerRect.setAntiAlias(true);
 
 		paintIcon = new Paint();
