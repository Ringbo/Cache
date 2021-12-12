diff --git a/OsmAnd-java/src/net/osmand/osm/MapPoiTypes.java b/OsmAnd-java/src/net/osmand/osm/MapPoiTypes.java
index f4a0d76..96f3971 100644
--- a/OsmAnd-java/src/net/osmand/osm/MapPoiTypes.java
+++ b/OsmAnd-java/src/net/osmand/osm/MapPoiTypes.java
@@ -382,7 +382,7 @@
 							lastTypePoiAdditionalsCategories.addAll(lastCategoryPoiAdditionalsCategories);
 							lastTypePoiAdditionalsCategories.addAll(lastFilterPoiAdditionalsCategories);
 							if(!Algorithms.isEmpty(parser.getAttributeValue("", "poi_additional_category"))) {
-								Collections.addAll(lastFilterPoiAdditionalsCategories, parser.getAttributeValue("", "poi_additional_category").split(","));
+								Collections.addAll(lastTypePoiAdditionalsCategories, parser.getAttributeValue("", "poi_additional_category").split(","));
 							}
 							if(!Algorithms.isEmpty(parser.getAttributeValue("", "excluded_poi_additional_category"))) {
 								lastType.addExcludedPoiAdditionalCategories(parser.getAttributeValue("", "excluded_poi_additional_category").split(","));
