diff --git a/OsmAnd/src/net/osmand/plus/download/ui/ItemViewHolder.java b/OsmAnd/src/net/osmand/plus/download/ui/ItemViewHolder.java
index 9aed8dd..29ad64e 100644
--- a/OsmAnd/src/net/osmand/plus/download/ui/ItemViewHolder.java
+++ b/OsmAnd/src/net/osmand/plus/download/ui/ItemViewHolder.java
@@ -129,7 +129,7 @@
 		if (!isDownloading) {
 			progressBar.setVisibility(View.GONE);
 			
-			descrTextView.setVisibility(color);
+			descrTextView.setTextColor(color);
 			descrTextView.setVisibility(View.VISIBLE);
 			if ((indexItem.getType() == DownloadActivityType.SRTM_COUNTRY_FILE ||
 					indexItem.getType() == DownloadActivityType.HILLSHADE_FILE) && srtmDisabled) {
