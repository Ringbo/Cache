diff --git a/src/org/thoughtcrime/securesms/notifications/MessageNotifier.java b/src/org/thoughtcrime/securesms/notifications/MessageNotifier.java
index 8dc15df..049b1e2 100644
--- a/src/org/thoughtcrime/securesms/notifications/MessageNotifier.java
+++ b/src/org/thoughtcrime/securesms/notifications/MessageNotifier.java
@@ -542,7 +542,7 @@
         protected Void doInBackground(Void... params) {
           MasterSecret masterSecret  = KeyCachingService.getMasterSecret(context);
           int          reminderCount = intent.getIntExtra("reminder_count", 0);
-          MessageNotifier.updateNotification(context, masterSecret, true, true, reminderCount + 1);
+          MessageNotifier.updateNotification(context, masterSecret, true, false, reminderCount + 1);
 
           return null;
         }
