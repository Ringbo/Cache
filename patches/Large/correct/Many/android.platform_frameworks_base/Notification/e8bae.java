diff --git a/core/java/android/app/Notification.java b/core/java/android/app/Notification.java
index c3dece8..6a95fa5 100644
--- a/core/java/android/app/Notification.java
+++ b/core/java/android/app/Notification.java
@@ -3122,7 +3122,7 @@
 
         private RemoteViews generateActionButton(Action action) {
             final boolean tombstone = (action.actionIntent == null);
-            RemoteViews button = new RemoteViews(mContext.getPackageName(),
+            RemoteViews button = new BuilderRemoteViews(mContext.getApplicationInfo(),
                     tombstone ? getActionTombstoneLayoutResource()
                               : getActionLayoutResource());
             button.setTextViewCompoundDrawablesRelative(R.id.action0, action.icon, 0, 0, 0);
@@ -4391,7 +4391,7 @@
 
         private RemoteViews generateMediaActionButton(Action action) {
             final boolean tombstone = (action.actionIntent == null);
-            RemoteViews button = new RemoteViews(mBuilder.mContext.getPackageName(),
+            RemoteViews button = new BuilderRemoteViews(mBuilder.mContext.getApplicationInfo(),
                     R.layout.notification_material_media_action);
             button.setImageViewResource(R.id.action0, action.icon);
             button.setDrawableParameters(R.id.action0, false, -1,
