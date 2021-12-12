diff --git a/packages/SystemUI/src/com/android/systemui/usb/StorageNotification.java b/packages/SystemUI/src/com/android/systemui/usb/StorageNotification.java
index ad21555..05ee9c2 100644
--- a/packages/SystemUI/src/com/android/systemui/usb/StorageNotification.java
+++ b/packages/SystemUI/src/com/android/systemui/usb/StorageNotification.java
@@ -170,8 +170,8 @@
 
             final String fsUuid = rec.getFsUuid();
             final VolumeInfo info = mStorageManager.findVolumeByUuid(fsUuid);
-            if (info != null && info.isMountedWritable()) {
-                // Yay, private volume is here!
+            if ((info != null && info.isMountedWritable()) || rec.isSnoozed()) {
+                // Yay, private volume is here, or user snoozed
                 mNotificationManager.cancelAsUser(fsUuid, PRIVATE_ID, UserHandle.ALL);
 
             } else {
@@ -190,7 +190,7 @@
                         .setVisibility(Notification.VISIBILITY_PUBLIC)
                         .setLocalOnly(true)
                         .setCategory(Notification.CATEGORY_SYSTEM)
-                        .setOngoing(true)
+                        .setDeleteIntent(buildSnoozeIntent(fsUuid))
                         .build();
 
                 mNotificationManager.notifyAsUser(fsUuid, PRIVATE_ID, notif, UserHandle.ALL);
@@ -202,9 +202,9 @@
         if (volumeCount == 0 && disk.size > 0) {
             // No supported volumes found, give user option to format
             final CharSequence title = mContext.getString(
-                    R.string.ext_media_unmountable_notification_title, disk.getDescription());
+                    R.string.ext_media_unsupported_notification_title, disk.getDescription());
             final CharSequence text = mContext.getString(
-                    R.string.ext_media_unmountable_notification_message, disk.getDescription());
+                    R.string.ext_media_unsupported_notification_message, disk.getDescription());
 
             final Notification notif = new Notification.Builder(mContext)
                     .setSmallIcon(getSmallIcon(disk, VolumeInfo.STATE_UNMOUNTABLE))
@@ -324,7 +324,7 @@
                             mContext.getString(R.string.ext_media_unmount_action),
                             buildUnmountPendingIntent(vol)))
                     .setContentIntent(initIntent)
-                    .setDeleteIntent(buildSnoozeIntent(vol))
+                    .setDeleteIntent(buildSnoozeIntent(vol.getFsUuid()))
                     .setCategory(Notification.CATEGORY_SYSTEM)
                     .build();
 
@@ -342,7 +342,7 @@
                             mContext.getString(R.string.ext_media_unmount_action),
                             buildUnmountPendingIntent(vol)))
                     .setContentIntent(browseIntent)
-                    .setDeleteIntent(buildSnoozeIntent(vol))
+                    .setDeleteIntent(buildSnoozeIntent(vol.getFsUuid()))
                     .setCategory(Notification.CATEGORY_SYSTEM)
                     .setPriority(Notification.PRIORITY_LOW)
                     .build();
@@ -376,7 +376,7 @@
                 R.string.ext_media_unmountable_notification_message, disk.getDescription());
 
         return buildNotificationBuilder(vol, title, text)
-                .setContentIntent(buildVolumeSettingsPendingIntent(vol))
+                .setContentIntent(buildInitPendingIntent(vol))
                 .setCategory(Notification.CATEGORY_ERROR)
                 .build();
     }
@@ -591,11 +591,11 @@
                 PendingIntent.FLAG_CANCEL_CURRENT, null, UserHandle.CURRENT);
     }
 
-    private PendingIntent buildSnoozeIntent(VolumeInfo vol) {
+    private PendingIntent buildSnoozeIntent(String fsUuid) {
         final Intent intent = new Intent(ACTION_SNOOZE_VOLUME);
-        intent.putExtra(VolumeRecord.EXTRA_FS_UUID, vol.getFsUuid());
+        intent.putExtra(VolumeRecord.EXTRA_FS_UUID, fsUuid);
 
-        final int requestKey = vol.getId().hashCode();
+        final int requestKey = fsUuid.hashCode();
         return PendingIntent.getBroadcastAsUser(mContext, requestKey, intent,
                 PendingIntent.FLAG_CANCEL_CURRENT, UserHandle.CURRENT);
     }
