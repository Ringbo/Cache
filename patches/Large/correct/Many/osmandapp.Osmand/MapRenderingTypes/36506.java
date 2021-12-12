diff --git a/OsmAnd-java/src/net/osmand/osm/MapRenderingTypes.java b/OsmAnd-java/src/net/osmand/osm/MapRenderingTypes.java
index 07c07ef..22c11a9 100644
--- a/OsmAnd-java/src/net/osmand/osm/MapRenderingTypes.java
+++ b/OsmAnd-java/src/net/osmand/osm/MapRenderingTypes.java
@@ -473,7 +473,7 @@
 		}
 		
 
-		if (poiParentCategory != null) {
+		if (poiParentCategory != null && poiParentCategory.length() > 0) {
 			rtype.poiCategory = AmenityType.getAndRegisterType(poiParentCategory);
 			rtype.poiSpecified = true;
 		}
@@ -482,7 +482,7 @@
 		}
 
 		String poiCategory = parser.getAttributeValue("", "poi_category");
-		if (poiCategory != null) {
+		if (poiCategory != null && poiCategory.length() > 0) {
 			rtype.poiSpecified = true;
 			if (poiCategory.length() == 0) {
 				rtype.poiCategory = null;
