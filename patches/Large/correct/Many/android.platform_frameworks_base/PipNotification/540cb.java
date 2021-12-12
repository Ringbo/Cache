diff --git a/packages/SystemUI/src/com/android/systemui/pip/tv/PipNotification.java b/packages/SystemUI/src/com/android/systemui/pip/tv/PipNotification.java
index 30240c3..c8f4185 100644
--- a/packages/SystemUI/src/com/android/systemui/pip/tv/PipNotification.java
+++ b/packages/SystemUI/src/com/android/systemui/pip/tv/PipNotification.java
@@ -194,7 +194,7 @@
 
     private void dismissPipNotification() {
         mNotified = false;
-        mNotificationManager.cancel(SystemMessage.NOTE_TV_PIP);
+        mNotificationManager.cancel(NOTIFICATION_TAG, SystemMessage.NOTE_TV_PIP);
     }
 
     private boolean updateMediaControllerMetadata() {
