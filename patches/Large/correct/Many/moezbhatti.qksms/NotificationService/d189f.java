diff --git a/QKSMS/src/main/java/com/moez/QKSMS/service/NotificationService.java b/QKSMS/src/main/java/com/moez/QKSMS/service/NotificationService.java
index 9873655..1782d13 100644
--- a/QKSMS/src/main/java/com/moez/QKSMS/service/NotificationService.java
+++ b/QKSMS/src/main/java/com/moez/QKSMS/service/NotificationService.java
@@ -54,7 +54,7 @@
             if (conversationPrefs.getNotificationsEnabled()) {
                 // Only show QuickReply if we're outside of the app, and they have popups and QuickReply enabled.
                 if (!LifecycleHandler.isApplicationVisible() &&
-                        intent.getBooleanExtra(EXTRA_POPUP, false) && prefs.getBoolean(SettingsFragment.QUICKREPLY, Build.VERSION.SDK_INT < 23)) {
+                        intent.getBooleanExtra(EXTRA_POPUP, false) && prefs.getBoolean(SettingsFragment.QUICKREPLY, Build.VERSION.SDK_INT < 24)) {
 
                     popupIntent = new Intent(context, QKReplyActivity.class);
                     popupIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
