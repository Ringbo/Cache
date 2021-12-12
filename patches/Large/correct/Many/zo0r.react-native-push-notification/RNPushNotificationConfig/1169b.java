diff --git a/android/src/main/java/com/dieam/reactnativepushnotification/modules/RNPushNotificationConfig.java b/android/src/main/java/com/dieam/reactnativepushnotification/modules/RNPushNotificationConfig.java
index 00da200..4be0352 100644
--- a/android/src/main/java/com/dieam/reactnativepushnotification/modules/RNPushNotificationConfig.java
+++ b/android/src/main/java/com/dieam/reactnativepushnotification/modules/RNPushNotificationConfig.java
@@ -10,7 +10,7 @@
 class RNPushNotificationConfig {
     private static final String KEY_CHANNEL_NAME = "com.dieam.reactnativepushnotification.notification_channel_name";
     private static final String KEY_CHANNEL_DESCRIPTION = "com.dieam.reactnativepushnotification.notification_channel_description";
-    private static final String KEY_NOTIFICATION_ICON = "com.dieam.reactnativepushnotification.notification_color";
+    private static final String KEY_NOTIFICATION_COLOR = "com.dieam.reactnativepushnotification.notification_color";
 
     private static Bundle metadata;
     private Context context;
@@ -33,7 +33,7 @@
         try {
             return metadata.getString(KEY_CHANNEL_NAME);
         } catch (Exception e) {
-            Log.e(RNPushNotification.LOG_TAG, "Unable to find " + KEY_CHANNEL_NAME + " in manifest. Falling back to default");
+            Log.w(RNPushNotification.LOG_TAG, "Unable to find " + KEY_CHANNEL_NAME + " in manifest. Falling back to default");
         }
         // Default
         return "rn-push-notification-channel";
@@ -42,17 +42,17 @@
         try {
             return metadata.getString(KEY_CHANNEL_DESCRIPTION);
         } catch (Exception e) {
-            Log.e(RNPushNotification.LOG_TAG, "Unable to find " + KEY_CHANNEL_DESCRIPTION + " in manifest. Falling back to default");
+            Log.w(RNPushNotification.LOG_TAG, "Unable to find " + KEY_CHANNEL_DESCRIPTION + " in manifest. Falling back to default");
         }
         // Default
         return "";
     }
     public int getNotificationColor() {
         try {
-            int resourceId = metadata.getInt(KEY_NOTIFICATION_ICON);
+            int resourceId = metadata.getInt(KEY_NOTIFICATION_COLOR);
             return ResourcesCompat.getColor(context.getResources(), resourceId, null);
         } catch (Exception e) {
-            Log.e(RNPushNotification.LOG_TAG, "Unable to find " + KEY_NOTIFICATION_ICON + " in manifest. Falling back to default");
+            Log.w(RNPushNotification.LOG_TAG, "Unable to find " + KEY_NOTIFICATION_COLOR + " in manifest. Falling back to default");
         }
         // Default
         return -1;
