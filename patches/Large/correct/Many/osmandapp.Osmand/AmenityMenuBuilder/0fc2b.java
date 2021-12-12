diff --git a/OsmAnd/src/net/osmand/plus/mapcontextmenu/builders/AmenityMenuBuilder.java b/OsmAnd/src/net/osmand/plus/mapcontextmenu/builders/AmenityMenuBuilder.java
index 504957c..cde430e 100644
--- a/OsmAnd/src/net/osmand/plus/mapcontextmenu/builders/AmenityMenuBuilder.java
+++ b/OsmAnd/src/net/osmand/plus/mapcontextmenu/builders/AmenityMenuBuilder.java
@@ -334,7 +334,7 @@
 			String key = e.getKey();
 			String vl = e.getValue();
 
-			if (key.equals("image") || key.equals("mapillary")) {
+			if (key.equals("image") || key.equals("mapillary") || key.equals("subway_region")) {
 				continue;
 			}
 
