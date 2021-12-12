diff --git a/core/java/android/provider/CalendarContract.java b/core/java/android/provider/CalendarContract.java
index d743484..aa22041 100644
--- a/core/java/android/provider/CalendarContract.java
+++ b/core/java/android/provider/CalendarContract.java
@@ -2393,7 +2393,7 @@
             intent.setData(ContentUris.withAppendedId(CalendarContract.CONTENT_URI, alarmTime));
             intent.putExtra(ALARM_TIME, alarmTime);
             PendingIntent pi = PendingIntent.getBroadcast(context, 0, intent, 0);
-            manager.setExact(AlarmManager.RTC_WAKEUP, alarmTime, pi);
+            manager.setExactAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, alarmTime, pi);
         }
 
         /**
