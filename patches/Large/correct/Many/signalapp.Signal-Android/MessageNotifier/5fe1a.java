diff --git a/src/org/thoughtcrime/securesms/notifications/MessageNotifier.java b/src/org/thoughtcrime/securesms/notifications/MessageNotifier.java
index ff32c9f..feee947 100644
--- a/src/org/thoughtcrime/securesms/notifications/MessageNotifier.java
+++ b/src/org/thoughtcrime/securesms/notifications/MessageNotifier.java
@@ -419,7 +419,7 @@
     public void onReceive(Context context, Intent intent) {
       MasterSecret masterSecret  = KeyCachingService.getMasterSecret(context);
       int          reminderCount = intent.getIntExtra("reminder_count", 0);
-      MessageNotifier.updateNotification(context, masterSecret, true, reminderCount + 1);
+      MessageNotifier.updateNotification(context, masterSecret, true, true, reminderCount + 1);
     }
   }
 
