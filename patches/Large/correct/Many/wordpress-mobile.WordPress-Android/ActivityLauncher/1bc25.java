diff --git a/WordPress/src/main/java/org/wordpress/android/ui/ActivityLauncher.java b/WordPress/src/main/java/org/wordpress/android/ui/ActivityLauncher.java
index bed58e1..3aa1632 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/ActivityLauncher.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/ActivityLauncher.java
@@ -189,7 +189,7 @@
         statsPostViewIntent.putExtra(StatsSingleItemDetailsActivity.ARG_REMOTE_ITEM_ID, post.getItemID());
         statsPostViewIntent.putExtra(StatsSingleItemDetailsActivity.ARG_REMOTE_ITEM_TYPE, post.getPostType());
         statsPostViewIntent.putExtra(StatsSingleItemDetailsActivity.ARG_ITEM_TITLE, post.getTitle());
-        statsPostViewIntent.putExtra(StatsSingleItemDetailsActivity.ARG_ITEM_URL, post.getTitle());
+        statsPostViewIntent.putExtra(StatsSingleItemDetailsActivity.ARG_ITEM_URL, post.getUrl());
         context.startActivity(statsPostViewIntent);
     }
 
