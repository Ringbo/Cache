diff --git a/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsFollowersFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsFollowersFragment.java
index 417cd5b..dc15eab 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsFollowersFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsFollowersFragment.java
@@ -86,7 +86,7 @@
 
     @Override
     protected boolean hasDataAvailable() {
-        return mFollowersWPCOM != null && mFollowersEmail != null;
+        return mFollowersWPCOM != null || mFollowersEmail != null;
     }
     @Override
     protected void saveStatsData(Bundle outState) {
@@ -144,7 +144,7 @@
             return;
         }
 
-        if (mFollowersWPCOM == null && mFollowersEmail == null) {
+        if (!hasDataAvailable()) {
             showHideNoResultsUI(true);
             mTotalsLabel.setText(getTotalFollowersLabel(0));
             return;
