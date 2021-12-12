diff --git a/services/java/com/android/server/DeviceStorageMonitorService.java b/services/java/com/android/server/DeviceStorageMonitorService.java
index a4c376d..94a087a 100644
--- a/services/java/com/android/server/DeviceStorageMonitorService.java
+++ b/services/java/com/android/server/DeviceStorageMonitorService.java
@@ -405,7 +405,7 @@
         notification.setLatestEventInfo(mContext, title, details, intent);
         mNotificationMgr.notifyAsUser(null, LOW_MEMORY_NOTIFICATION_ID, notification,
                 UserHandle.ALL);
-        mContext.sendStickyBroadcast(mStorageLowIntent);
+        mContext.sendStickyBroadcastAsUser(mStorageLowIntent, UserHandle.ALL);
     }
 
     /**
@@ -428,7 +428,7 @@
      */
     private final void sendFullNotification() {
         if(localLOGV) Slog.i(TAG, "Sending memory full notification");
-        mContext.sendStickyBroadcast(mStorageFullIntent);
+        mContext.sendStickyBroadcastAsUser(mStorageFullIntent, UserHandle.ALL);
     }
 
     /**
