diff --git a/OsmAnd/src/net/osmand/plus/search/QuickSearchDialogFragment.java b/OsmAnd/src/net/osmand/plus/search/QuickSearchDialogFragment.java
index 91e2405..230592b 100644
--- a/OsmAnd/src/net/osmand/plus/search/QuickSearchDialogFragment.java
+++ b/OsmAnd/src/net/osmand/plus/search/QuickSearchDialogFragment.java
@@ -1156,7 +1156,7 @@
 		SearchSettings settings = searchUICore.getSearchSettings()
 				.setEmptyQueryAllowed(true)
 				.setAddressSearch(true)
-				.setSortByName(true)
+				.setSortByName(false)
 				.setSearchTypes(ObjectType.CITY, ObjectType.VILLAGE, ObjectType.POSTCODE,
 						ObjectType.HOUSE, ObjectType.STREET_INTERSECTION, ObjectType.STREET,
 						ObjectType.LOCATION, ObjectType.PARTIAL_LOCATION)
