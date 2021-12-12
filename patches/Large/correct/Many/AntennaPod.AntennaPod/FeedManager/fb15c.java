diff --git a/src/de/danoeh/antennapod/feed/FeedManager.java b/src/de/danoeh/antennapod/feed/FeedManager.java
index 2aab5c5..6479f98 100644
--- a/src/de/danoeh/antennapod/feed/FeedManager.java
+++ b/src/de/danoeh/antennapod/feed/FeedManager.java
@@ -710,7 +710,7 @@
 	public FeedMedia getFeedMedia(long id, Feed feed) {
 		if (feed != null) {
 			for (FeedItem item : feed.getItems()) {
-				if (item.getMedia().getId() == id) {
+				if (item.getMedia() != null && item.getMedia().getId() == id) {
 					return item.getMedia();
 				}
 			}
