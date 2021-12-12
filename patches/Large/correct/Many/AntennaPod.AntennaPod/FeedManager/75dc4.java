diff --git a/src/de/danoeh/antennapod/feed/FeedManager.java b/src/de/danoeh/antennapod/feed/FeedManager.java
index d9b4e6c..98da731 100644
--- a/src/de/danoeh/antennapod/feed/FeedManager.java
+++ b/src/de/danoeh/antennapod/feed/FeedManager.java
@@ -39,7 +39,7 @@
 public class FeedManager {
 	private static final String TAG = "FeedManager";
 
-	public static final String ACITON_FEED_LIST_UPDATE = "de.danoeh.antennapod.action.feed.feedlistUpdate";
+	public static final String ACTION_FEED_LIST_UPDATE = "de.danoeh.antennapod.action.feed.feedlistUpdate";
 	public static final String ACTION_UNREAD_ITEMS_UPDATE = "de.danoeh.antennapod.action.feed.unreadItemsUpdate";
 	public static final String ACTION_QUEUE_UPDATE = "de.danoeh.antennapod.action.feed.queueUpdate";
 	public static final String ACTION_DOWNLOADLOG_UPDATE = "de.danoeh.antennapod.action.feed.downloadLogUpdate";
@@ -264,7 +264,7 @@
 	}
 
 	private void sendFeedUpdateBroadcast(Context context) {
-		context.sendBroadcast(new Intent(ACITON_FEED_LIST_UPDATE));
+		context.sendBroadcast(new Intent(ACTION_FEED_LIST_UPDATE));
 	}
 
 	private void sendPlaybackHistoryUpdateBroadcast(Context context) {
