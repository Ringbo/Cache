diff --git a/OsmAnd/src/net/osmand/plus/activities/DownloadIndexActivity.java b/OsmAnd/src/net/osmand/plus/activities/DownloadIndexActivity.java
index 69000bb..15a26b5 100644
--- a/OsmAnd/src/net/osmand/plus/activities/DownloadIndexActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/DownloadIndexActivity.java
@@ -814,7 +814,7 @@
 			} else if(lc.contains("_asia_")) {
 				nameId = R.string.index_name_asia;
 				order = 50;
-			} else if(lc.contains("_oceania_")) {
+			} else if(lc.contains("_oceania_") || lc.contains("_australia") ) {
 				nameId = R.string.index_name_oceania;
 				order = 70;
 			} else if(lc.contains("_wiki_")) {
