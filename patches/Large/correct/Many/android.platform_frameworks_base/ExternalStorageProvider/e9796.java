diff --git a/packages/ExternalStorageProvider/src/com/android/externalstorage/ExternalStorageProvider.java b/packages/ExternalStorageProvider/src/com/android/externalstorage/ExternalStorageProvider.java
index 3ef9b8e..10e5dcc 100644
--- a/packages/ExternalStorageProvider/src/com/android/externalstorage/ExternalStorageProvider.java
+++ b/packages/ExternalStorageProvider/src/com/android/externalstorage/ExternalStorageProvider.java
@@ -161,7 +161,8 @@
                     final VolumeInfo privateVol = mStorageManager.findPrivateForEmulated(volume);
                     title = mStorageManager.getBestVolumeDescription(privateVol);
                 }
-            } else if (volume.getType() == VolumeInfo.TYPE_PUBLIC) {
+            } else if (volume.getType() == VolumeInfo.TYPE_PUBLIC
+                    && volume.getMountUserId() == userId) {
                 rootId = volume.getFsUuid();
                 title = mStorageManager.getBestVolumeDescription(volume);
             } else {
