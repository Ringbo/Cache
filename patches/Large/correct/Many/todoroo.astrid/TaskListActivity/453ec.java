diff --git a/astrid/src/com/todoroo/astrid/activity/TaskListActivity.java b/astrid/src/com/todoroo/astrid/activity/TaskListActivity.java
index 4866e8d..342084f 100644
--- a/astrid/src/com/todoroo/astrid/activity/TaskListActivity.java
+++ b/astrid/src/com/todoroo/astrid/activity/TaskListActivity.java
@@ -213,16 +213,19 @@
         long now = DateUtilities.now();
         long timeSinceFirst = now - firstLaunchTime;
 
-        if (timeSinceFirst < DateUtilities.ONE_DAY * 3 && !Preferences.getBoolean(StatisticsConstants.APP_OPEN_THREE_DAYS, false)) {
+        if (timeSinceFirst > DateUtilities.ONE_DAY * 3 && !Preferences.getBoolean(StatisticsConstants.APP_OPEN_THREE_DAYS, false)) {
             StatisticsService.reportEvent(StatisticsConstants.APP_OPEN_THREE_DAYS);
             Preferences.setBoolean(StatisticsConstants.APP_OPEN_THREE_DAYS, true);
-        } else if (timeSinceFirst < DateUtilities.ONE_WEEK && !Preferences.getBoolean(StatisticsConstants.APP_OPEN_ONE_WEEK, false)) {
+        }
+        if (timeSinceFirst > DateUtilities.ONE_WEEK && !Preferences.getBoolean(StatisticsConstants.APP_OPEN_ONE_WEEK, false)) {
             StatisticsService.reportEvent(StatisticsConstants.APP_OPEN_ONE_WEEK);
             Preferences.setBoolean(StatisticsConstants.APP_OPEN_ONE_WEEK, true);
-        } else if (timeSinceFirst < 2 * DateUtilities.ONE_WEEK && !Preferences.getBoolean(StatisticsConstants.APP_OPEN_TWO_WEEKS, false)) {
+        }
+        if (timeSinceFirst > 2 * DateUtilities.ONE_WEEK && !Preferences.getBoolean(StatisticsConstants.APP_OPEN_TWO_WEEKS, false)) {
             StatisticsService.reportEvent(StatisticsConstants.APP_OPEN_TWO_WEEKS);
             Preferences.setBoolean(StatisticsConstants.APP_OPEN_TWO_WEEKS, true);
-        } else if (timeSinceFirst < 3 * DateUtilities.ONE_WEEK && !Preferences.getBoolean(StatisticsConstants.APP_OPEN_THREE_WEEKS, false)) {
+        }
+        if (timeSinceFirst > 3 * DateUtilities.ONE_WEEK && !Preferences.getBoolean(StatisticsConstants.APP_OPEN_THREE_WEEKS, false)) {
             StatisticsService.reportEvent(StatisticsConstants.APP_OPEN_THREE_WEEKS);
             Preferences.setBoolean(StatisticsConstants.APP_OPEN_THREE_WEEKS, true);
         }
