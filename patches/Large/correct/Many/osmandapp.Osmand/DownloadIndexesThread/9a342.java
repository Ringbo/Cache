diff --git a/OsmAnd/src/net/osmand/plus/download/DownloadIndexesThread.java b/OsmAnd/src/net/osmand/plus/download/DownloadIndexesThread.java
index 1cc8142..383a3a7 100644
--- a/OsmAnd/src/net/osmand/plus/download/DownloadIndexesThread.java
+++ b/OsmAnd/src/net/osmand/plus/download/DownloadIndexesThread.java
@@ -551,7 +551,9 @@
 						!date.equals(indexactivateddate) &&
 						!date.equals(indexfilesdate) &&
 						indexActivatedFileNames.containsKey(sfName)) {
-					if (item.getType() == DownloadActivityType.NORMAL_FILE){
+					if (item.getType() == DownloadActivityType.NORMAL_FILE ||
+							item.getType() == DownloadActivityType.ROADS_FILE ||
+							item.getType() == DownloadActivityType.SRTM_COUNTRY_FILE){
 						itemsToUpdate.add(item);
 					} else {
 						long itemSize = item.getSize();
