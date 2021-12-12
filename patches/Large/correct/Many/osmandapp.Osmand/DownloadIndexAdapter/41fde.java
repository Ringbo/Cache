diff --git a/OsmAnd/src/net/osmand/plus/download/DownloadIndexAdapter.java b/OsmAnd/src/net/osmand/plus/download/DownloadIndexAdapter.java
index 388ecaa..837c4c2 100644
--- a/OsmAnd/src/net/osmand/plus/download/DownloadIndexAdapter.java
+++ b/OsmAnd/src/net/osmand/plus/download/DownloadIndexAdapter.java
@@ -64,7 +64,7 @@
 	}
 
 	public void collapseTrees(final CharSequence constraint) {
-		if (downloadFragment == null) {
+		if (downloadFragment == null || downloadFragment.getDownloadActivity() == null) {
 			return;
 		}
 		downloadFragment.getDownloadActivity().runOnUiThread(new Runnable() {
