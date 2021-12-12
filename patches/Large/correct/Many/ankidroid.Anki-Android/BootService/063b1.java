diff --git a/AnkiDroid/src/main/java/com/ichi2/anki/services/BootService.java b/AnkiDroid/src/main/java/com/ichi2/anki/services/BootService.java
index 6d56f70..26ca6cf 100644
--- a/AnkiDroid/src/main/java/com/ichi2/anki/services/BootService.java
+++ b/AnkiDroid/src/main/java/com/ichi2/anki/services/BootService.java
@@ -72,7 +72,7 @@
                         calendar.set(Calendar.MINUTE, reminder.getJSONArray("time").getInt(1));
                         calendar.set(Calendar.SECOND, 0);
 
-                        alarmManager.setInexactRepeating(
+                        alarmManager.setRepeating(
                                 AlarmManager.RTC_WAKEUP,
                                 calendar.getTimeInMillis(),
                                 AlarmManager.INTERVAL_DAY,
@@ -99,7 +99,7 @@
         calendar.set(Calendar.SECOND, 0);
         final PendingIntent notificationIntent =
                 PendingIntent.getBroadcast(context, 0, new Intent(context, NotificationReceiver.class), 0);
-        alarmManager.setInexactRepeating(
+        alarmManager.setRepeating(
                 AlarmManager.RTC_WAKEUP,
                 calendar.getTimeInMillis(),
                 AlarmManager.INTERVAL_DAY,
