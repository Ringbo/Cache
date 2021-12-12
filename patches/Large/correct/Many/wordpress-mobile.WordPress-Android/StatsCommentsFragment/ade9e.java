diff --git a/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsCommentsFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsCommentsFragment.java
index d4d6992..a5fee7a 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsCommentsFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsCommentsFragment.java
@@ -82,7 +82,7 @@
             return;
         }
 
-        if (mDatamodels[1] != null) { // check if comment-followers is already here
+        if (mDatamodels[1] != null && !isErrorResponse(1)) { // check if comment-followers is already here
             mTotalsLabel.setVisibility(View.VISIBLE);
             int totalNumberOfFollowers = ((CommentFollowersModel) mDatamodels[1]).getTotal();
             mTotalsLabel.setText(
