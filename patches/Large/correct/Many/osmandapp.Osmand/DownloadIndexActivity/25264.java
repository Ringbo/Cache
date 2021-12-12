diff --git a/OsmAnd/src/net/osmand/plus/activities/DownloadIndexActivity.java b/OsmAnd/src/net/osmand/plus/activities/DownloadIndexActivity.java
index 902a12c..b454036 100644
--- a/OsmAnd/src/net/osmand/plus/activities/DownloadIndexActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/DownloadIndexActivity.java
@@ -443,7 +443,7 @@
 									    String filename = filesToDownload.get(i);
 										DownloadEntry entry = entriesToDownload.get(filename);
 										if (entry != null) {
-											String indexOfAllFiles = filesToDownload.size() < 1 ? "" : (" ["+(i+1)+"/"+filesToDownload.size()+"]"); 
+											String indexOfAllFiles = filesToDownload.size() <= 1 ? "" : (" ["+(i+1)+"/"+filesToDownload.size()+"]"); 
 											if (downloadFile(filename, entry.fileToSave, entry.fileToUnzip, entry.unzip, impl, entry.dateModified,
 													entry.parts, filesToReindex, indexOfAllFiles)) {
 												entriesToDownload.remove(filename);
