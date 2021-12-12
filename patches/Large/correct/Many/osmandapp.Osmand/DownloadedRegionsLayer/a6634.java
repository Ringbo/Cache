diff --git a/OsmAnd/src/net/osmand/plus/views/DownloadedRegionsLayer.java b/OsmAnd/src/net/osmand/plus/views/DownloadedRegionsLayer.java
index 56460aa..140ab06 100644
--- a/OsmAnd/src/net/osmand/plus/views/DownloadedRegionsLayer.java
+++ b/OsmAnd/src/net/osmand/plus/views/DownloadedRegionsLayer.java
@@ -301,7 +301,11 @@
 			if (region != null && region.getRegionDownloadName() != null) {
 				List<IndexItem> indexItems = app.getDownloadThread().getIndexes().getIndexItems(region);
 				for (IndexItem item : indexItems) {
-					if (item.getType() == DownloadActivityType.NORMAL_FILE) {
+					if (item.getType() == DownloadActivityType.NORMAL_FILE
+							|| item.getType() == DownloadActivityType.ROADS_FILE
+							|| item.getType() == DownloadActivityType.SRTM_COUNTRY_FILE
+							|| item.getType() == DownloadActivityType.HILLSHADE_FILE
+							|| item.getType() == DownloadActivityType.WIKIPEDIA_FILE) {
 						if (app.getDownloadThread().isDownloading(item)) {
 							downloadingObjects.add(o);
 						} else if (item.isOutdated()) {
@@ -505,7 +509,7 @@
 					List<IndexItem> dataItems = new LinkedList<>();
 					IndexItem regularMapItem = null;
 					for (IndexItem item : indexItems) {
-						if (item.isDownloaded()) {
+						if (item.isDownloaded() || app.getDownloadThread().isDownloading(item)) {
 							dataItems.add(item);
 							if (item.getType() == DownloadActivityType.NORMAL_FILE) {
 								regularMapItem = item;
