diff --git a/src/org/wordpress/android/ui/stats/StatsActivity.java b/src/org/wordpress/android/ui/stats/StatsActivity.java
index e859274..499928d 100644
--- a/src/org/wordpress/android/ui/stats/StatsActivity.java
+++ b/src/org/wordpress/android/ui/stats/StatsActivity.java
@@ -64,7 +64,7 @@
         mStatsPhoneFragment = (StatsPhoneFragment) fm.findFragmentByTag(StatsPhoneFragment.TAG);
         if (mStatsPhoneFragment == null) { 
             mStatsPhoneFragment = StatsPhoneFragment.newInstance(ViewType.TOP_POSTS_AND_PAGES);
-            fm.beginTransaction().add(R.id.stats_container, mStatsPhoneFragment).commit();
+            fm.beginTransaction().add(R.id.stats_container, mStatsPhoneFragment, StatsPhoneFragment.TAG).commit();
         }
         
         mNavFragment = (DialogFragment) fm.findFragmentByTag(StatsNavDialogFragment.TAG);
