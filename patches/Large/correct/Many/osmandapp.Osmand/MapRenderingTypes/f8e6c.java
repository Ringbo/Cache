diff --git a/OsmAnd-java/src/net/osmand/osm/MapRenderingTypes.java b/OsmAnd-java/src/net/osmand/osm/MapRenderingTypes.java
index 22c11a9..db4d7e6 100644
--- a/OsmAnd-java/src/net/osmand/osm/MapRenderingTypes.java
+++ b/OsmAnd-java/src/net/osmand/osm/MapRenderingTypes.java
@@ -568,7 +568,7 @@
 
 	protected void parseCategoryFromXml(XmlPullParser parser, String poiParentCategory, String poiParentPrefix) {
 		String poi_tag = parser.getAttributeValue("","poi_tag");
-		if (poi_tag != null) {
+		if (poi_tag != null && poiParentCategory.length() > 0) {
 			MapRulType rtype = new MapRulType();
 			rtype.poiCategory = AmenityType.getAndRegisterType(poiParentCategory);
 			rtype.poiSpecified = true;
