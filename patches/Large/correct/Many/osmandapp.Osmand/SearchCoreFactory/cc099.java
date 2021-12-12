diff --git a/OsmAnd-java/src/net/osmand/search/core/SearchCoreFactory.java b/OsmAnd-java/src/net/osmand/search/core/SearchCoreFactory.java
index 0fe421f..f82d52b 100644
--- a/OsmAnd-java/src/net/osmand/search/core/SearchCoreFactory.java
+++ b/OsmAnd-java/src/net/osmand/search/core/SearchCoreFactory.java
@@ -562,7 +562,7 @@
 			if (p.hasObjectType(ObjectType.POI_TYPE)) {
 				return -1;
 			}
-			if (p.getUnknownSearchWordLength() > 3 || p.getRadiusLevel() > 1) {
+			if (p.getUnknownSearchWordLength() >= 3 || p.getRadiusLevel() > 1) {
 				return SEARCH_AMENITY_BY_NAME_API_PRIORITY_IF_3_CHAR;
 			}
 			return -1;
