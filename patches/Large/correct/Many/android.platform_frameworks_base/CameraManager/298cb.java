diff --git a/core/java/android/hardware/camera2/CameraManager.java b/core/java/android/hardware/camera2/CameraManager.java
index 8903b4a..ff9282e 100644
--- a/core/java/android/hardware/camera2/CameraManager.java
+++ b/core/java/android/hardware/camera2/CameraManager.java
@@ -55,7 +55,7 @@
 
     private final ICameraService mCameraService;
     private ArrayList<String> mDeviceIdList;
-    private HashSet<CameraListener> mListenerSet = new HashSet<CameraListener>();
+    private final HashSet<CameraListener> mListenerSet = new HashSet<CameraListener>();
     private final Context mContext;
     private final Object mLock = new Object();
 
@@ -332,7 +332,7 @@
 
                 Integer oldStatus = mDeviceStatus.put(id, status);
 
-                if (oldStatus == status) {
+                if (oldStatus != null && oldStatus == status) {
                     Log.v(TAG, String.format(
                             "Device status changed to 0x%x, which is what it already was",
                             status));
