diff --git a/services/java/com/android/server/AlarmManagerService.java b/services/java/com/android/server/AlarmManagerService.java
index f960833..440f8e1 100644
--- a/services/java/com/android/server/AlarmManagerService.java
+++ b/services/java/com/android/server/AlarmManagerService.java
@@ -130,12 +130,14 @@
         PowerManager pm = (PowerManager)context.getSystemService(Context.POWER_SERVICE);
         mWakeLock = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, TAG);
         
-        mTimeTickSender = PendingIntent.getBroadcast(context, 0,
+        mTimeTickSender = PendingIntent.getBroadcastAsUser(context, 0,
                 new Intent(Intent.ACTION_TIME_TICK).addFlags(
-                        Intent.FLAG_RECEIVER_REGISTERED_ONLY), 0);
+                        Intent.FLAG_RECEIVER_REGISTERED_ONLY), 0,
+                        UserHandle.ALL);
         Intent intent = new Intent(Intent.ACTION_DATE_CHANGED);
         intent.addFlags(Intent.FLAG_RECEIVER_REPLACE_PENDING);
-        mDateChangeSender = PendingIntent.getBroadcast(context, 0, intent, 0);
+        mDateChangeSender = PendingIntent.getBroadcastAsUser(context, 0, intent,
+                Intent.FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT, UserHandle.ALL);
         
         // now that we have initied the driver schedule the alarm
         mClockReceiver= new ClockReceiver();
