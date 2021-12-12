diff --git a/PhotoPicker/src/main/java/me/iwf/photopicker/PhotoPicker.java b/PhotoPicker/src/main/java/me/iwf/photopicker/PhotoPicker.java
index 576e026..e5f9580 100644
--- a/PhotoPicker/src/main/java/me/iwf/photopicker/PhotoPicker.java
+++ b/PhotoPicker/src/main/java/me/iwf/photopicker/PhotoPicker.java
@@ -105,7 +105,7 @@
     }
 
     public PhotoPickerBuilder setShowCamera(boolean showCamera) {
-      mPickerOptionsBundle.putBoolean(EXTRA_SHOW_GIF, showCamera);
+      mPickerOptionsBundle.putBoolean(EXTRA_SHOW_CAMERA, showCamera);
       return this;
     }
 
