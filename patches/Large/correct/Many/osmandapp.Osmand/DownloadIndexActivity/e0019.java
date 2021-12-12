diff --git a/OsmAnd/src/net/osmand/plus/activities/DownloadIndexActivity.java b/OsmAnd/src/net/osmand/plus/activities/DownloadIndexActivity.java
index 4028bb8..d4146a2 100644
--- a/OsmAnd/src/net/osmand/plus/activities/DownloadIndexActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/DownloadIndexActivity.java
@@ -755,7 +755,7 @@
 							boolean result = downloadFile(entry, filesToReindex, indexOfAllFiles, forceWifi);
 							if (result) {
 								DownloadIndexActivity.this.entriesToDownload.remove(filename);
-								if (entry.type != DownloadActivityType.SRTM_FILE) {
+								if (entry.type != DownloadActivityType.SRTM_FILE && entry.type != DownloadActivityType.HILLSHADE_FILE) {
 									downloads.set(downloads.get() + 1);
 								}
 								if (entry.existingBackupFile != null) {
