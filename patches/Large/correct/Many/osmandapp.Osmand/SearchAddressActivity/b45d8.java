diff --git a/OsmAnd/src/net/osmand/plus/activities/search/SearchAddressActivity.java b/OsmAnd/src/net/osmand/plus/activities/search/SearchAddressActivity.java
index 171ef81..6fd0ccb 100644
--- a/OsmAnd/src/net/osmand/plus/activities/search/SearchAddressActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/search/SearchAddressActivity.java
@@ -358,7 +358,7 @@
 		building = null;
 		region = osmandSettings.getLastSearchedRegion();
 		RegionAddressRepository reg = ((OsmandApplication)getApplication()).getResourceManager().getRegionRepository(region);
-		if(reg.useEnglishNames() != osmandSettings.USE_ENGLISH_NAMES.get()){
+		if(reg != null && reg.useEnglishNames() != osmandSettings.USE_ENGLISH_NAMES.get()){
 			reg.setUseEnglishNames(osmandSettings.USE_ENGLISH_NAMES.get());
 		}
 		loadData();
