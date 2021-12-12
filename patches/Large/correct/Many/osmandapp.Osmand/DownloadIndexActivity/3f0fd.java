diff --git a/OsmAnd/src/net/osmand/plus/activities/DownloadIndexActivity.java b/OsmAnd/src/net/osmand/plus/activities/DownloadIndexActivity.java
index feb4d37..8625980 100644
--- a/OsmAnd/src/net/osmand/plus/activities/DownloadIndexActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/DownloadIndexActivity.java
@@ -396,7 +396,7 @@
 				cachedSRTMFiles = new ArrayList<SrtmIndexItem>();
 				List<RegionCountry> countries = RegionRegistry.getRegionRegistry().getCountries();
 				for (RegionCountry rc : countries) {
-					if (rc.tiles.size() > 35) {
+					if (rc.tiles.size() > 35 && rc.getSubRegions().size() > 0) {
 						for (RegionCountry ch : rc.getSubRegions()) {
 							cachedSRTMFiles.add(new SrtmIndexItem(ch, indexFileNames));
 						}
