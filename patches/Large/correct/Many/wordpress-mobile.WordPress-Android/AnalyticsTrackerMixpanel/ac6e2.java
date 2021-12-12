diff --git a/libs/analytics/WordPressAnalytics/src/main/java/org/wordpress/android/analytics/AnalyticsTrackerMixpanel.java b/libs/analytics/WordPressAnalytics/src/main/java/org/wordpress/android/analytics/AnalyticsTrackerMixpanel.java
index 2c05165..7e39d02 100644
--- a/libs/analytics/WordPressAnalytics/src/main/java/org/wordpress/android/analytics/AnalyticsTrackerMixpanel.java
+++ b/libs/analytics/WordPressAnalytics/src/main/java/org/wordpress/android/analytics/AnalyticsTrackerMixpanel.java
@@ -421,7 +421,7 @@
             case EDITOR_TOGGLED_OFF:
                 instructions = AnalyticsTrackerMixpanelInstructionsForStat.
                         mixpanelInstructionsForEventName("Editor - Toggled New Editor Off");
-                instructions.setPeoplePropertyToValue("enabled_new_editor", true);
+                instructions.setPeoplePropertyToValue("enabled_new_editor", false);
                 break;
             case EDITOR_UPLOAD_MEDIA_FAILED:
                 instructions = AnalyticsTrackerMixpanelInstructionsForStat.
