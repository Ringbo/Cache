diff --git a/astrid/plugin-src/com/todoroo/astrid/reminders/NotificationActivity.java b/astrid/plugin-src/com/todoroo/astrid/reminders/NotificationActivity.java
index 2ca73a3..955a60c 100644
--- a/astrid/plugin-src/com/todoroo/astrid/reminders/NotificationActivity.java
+++ b/astrid/plugin-src/com/todoroo/astrid/reminders/NotificationActivity.java
@@ -199,7 +199,7 @@
      * Snooze and re-trigger this alarm
      */
     private void snooze() {
-        if(Preferences.getBoolean(R.string.p_rmd_snooze_dialog, true)) {
+        if(Preferences.getBoolean(R.string.p_rmd_snooze_dialog, false)) {
             Date now = new Date();
             now.setHours(now.getHours() + 1);
             int hour = now.getHours();
