diff --git a/src/main/java/com/gitblit/wicket/WicketUtils.java b/src/main/java/com/gitblit/wicket/WicketUtils.java
index f1f084c..bba3f79 100644
--- a/src/main/java/com/gitblit/wicket/WicketUtils.java
+++ b/src/main/java/com/gitblit/wicket/WicketUtils.java
@@ -536,7 +536,7 @@
 			// past
 			title = timeUtils.timeAgo(date);
 		}
-		if ((System.currentTimeMillis() - date.getTime()) < 10 * 24 * 60 * 60 * 1000L) {
+		if (title != null && (System.currentTimeMillis() - date.getTime()) < 10 * 24 * 60 * 60 * 1000L) {
 			String tmp = dateString;
 			dateString = title;
 			title = tmp;
