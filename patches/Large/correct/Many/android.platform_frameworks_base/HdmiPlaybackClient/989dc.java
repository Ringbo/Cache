diff --git a/core/java/android/hardware/hdmi/HdmiPlaybackClient.java b/core/java/android/hardware/hdmi/HdmiPlaybackClient.java
index 83da29a..f0bd237 100644
--- a/core/java/android/hardware/hdmi/HdmiPlaybackClient.java
+++ b/core/java/android/hardware/hdmi/HdmiPlaybackClient.java
@@ -90,7 +90,7 @@
     public void queryDisplayStatus(DisplayStatusCallback callback) {
         // TODO: PendingResult.
         try {
-            mService.oneTouchPlay(getCallbackWrapper(callback));
+            mService.queryDisplayStatus(getCallbackWrapper(callback));
         } catch (RemoteException e) {
             Log.e(TAG, "queryDisplayStatus threw exception ", e);
         }
