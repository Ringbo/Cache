diff --git a/libs/analytics/WordPressAnalytics/src/main/java/org/wordpress/android/analytics/AnalyticsTrackerMixpanel.java b/libs/analytics/WordPressAnalytics/src/main/java/org/wordpress/android/analytics/AnalyticsTrackerMixpanel.java
index 4ee267a..911efa6 100644
--- a/libs/analytics/WordPressAnalytics/src/main/java/org/wordpress/android/analytics/AnalyticsTrackerMixpanel.java
+++ b/libs/analytics/WordPressAnalytics/src/main/java/org/wordpress/android/analytics/AnalyticsTrackerMixpanel.java
@@ -191,7 +191,7 @@
         if (metadata.isUserConnected() && metadata.isWordPressComUser()) {
             setWordPressComUserName(metadata.getUsername());
             // Re-unify the user
-            if (getAnonID() != null) {
+            if (getAnonID() != null && getWordPressComUserName() != null) {
                 mMixpanel.alias(getWordPressComUserName(), getAnonID());
                 clearAnonID();
             } else {
