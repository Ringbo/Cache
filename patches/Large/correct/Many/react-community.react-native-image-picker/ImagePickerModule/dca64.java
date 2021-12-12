diff --git a/android/src/main/java/com/imagepicker/ImagePickerModule.java b/android/src/main/java/com/imagepicker/ImagePickerModule.java
index 4de4b58..41a08eb 100644
--- a/android/src/main/java/com/imagepicker/ImagePickerModule.java
+++ b/android/src/main/java/com/imagepicker/ImagePickerModule.java
@@ -307,7 +307,7 @@
 
     // user cancel
     if (resultCode != Activity.RESULT_OK) {
-      responseHelper.invokeResponse(callback);
+      responseHelper.invokeCancel(callback);
       callback = null;
       return;
     }
