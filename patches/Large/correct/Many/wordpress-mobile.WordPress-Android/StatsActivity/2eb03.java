diff --git a/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsActivity.java
index 04ddc15..37d8cbf 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsActivity.java
@@ -400,7 +400,7 @@
                                 AnalyticsTracker.track(AnalyticsTracker.Stat.SIGNED_INTO_JETPACK);
                                 AnalyticsTracker.track(
                                         AnalyticsTracker.Stat.PERFORMED_JETPACK_SIGN_IN_FROM_STATS_SCREEN);
-                                if (!isFinishing()) {
+                                if (isFinishing()) {
                                     return;
                                 }
                                 // We have the blogID now, but we need to re-check if the network connection is available
