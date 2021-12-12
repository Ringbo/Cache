diff --git a/services/core/java/com/android/server/LockSettingsService.java b/services/core/java/com/android/server/LockSettingsService.java
index 85eee2b..8e0114a 100644
--- a/services/core/java/com/android/server/LockSettingsService.java
+++ b/services/core/java/com/android/server/LockSettingsService.java
@@ -348,7 +348,7 @@
         CharSequence detail = r.getText(
                 com.android.internal.R.string.user_encrypted_detail);
 
-        PendingIntent intent = PendingIntent.getBroadcast(mContext, 0, ACTION_NULL,
+        PendingIntent intent = PendingIntent.getActivity(mContext, 0, ACTION_NULL,
                 PendingIntent.FLAG_UPDATE_CURRENT);
 
         showEncryptionNotification(user, title, message, detail, intent);
