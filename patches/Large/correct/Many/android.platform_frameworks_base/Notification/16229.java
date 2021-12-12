diff --git a/core/java/android/app/Notification.java b/core/java/android/app/Notification.java
index ed3bb92..62a8421 100644
--- a/core/java/android/app/Notification.java
+++ b/core/java/android/app/Notification.java
@@ -1787,7 +1787,7 @@
             RemoteViews button = new RemoteViews(mContext.getPackageName(),
                     tombstone ? R.layout.notification_action_tombstone
                               : R.layout.notification_action);
-            button.setTextViewCompoundDrawables(R.id.action0, action.icon, 0, 0, 0);
+            button.setTextViewCompoundDrawablesRelative(R.id.action0, action.icon, 0, 0, 0);
             button.setTextViewText(R.id.action0, action.title);
             if (!tombstone) {
                 button.setOnClickPendingIntent(R.id.action0, action.actionIntent);
