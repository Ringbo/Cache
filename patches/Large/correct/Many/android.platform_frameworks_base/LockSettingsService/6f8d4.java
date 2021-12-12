diff --git a/services/core/java/com/android/server/LockSettingsService.java b/services/core/java/com/android/server/LockSettingsService.java
index d64fe32..2980dae 100644
--- a/services/core/java/com/android/server/LockSettingsService.java
+++ b/services/core/java/com/android/server/LockSettingsService.java
@@ -347,7 +347,7 @@
         CharSequence detail = r.getText(
                 com.android.internal.R.string.user_encrypted_detail);
 
-        PendingIntent intent = PendingIntent.getBroadcast(mContext, 0, ACTION_NULL,
+        PendingIntent intent = PendingIntent.getActivity(mContext, 0, ACTION_NULL,
                 PendingIntent.FLAG_UPDATE_CURRENT);
 
         showEncryptionNotification(user, title, message, detail, intent);
