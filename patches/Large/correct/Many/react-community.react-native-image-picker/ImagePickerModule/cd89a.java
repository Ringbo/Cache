diff --git a/android/src/main/java/com/imagepicker/ImagePickerModule.java b/android/src/main/java/com/imagepicker/ImagePickerModule.java
index 30bea72..4de4b58 100644
--- a/android/src/main/java/com/imagepicker/ImagePickerModule.java
+++ b/android/src/main/java/com/imagepicker/ImagePickerModule.java
@@ -825,7 +825,7 @@
                                                  @NonNull final File file)
   {
     Uri result = null;
-    if (Build.VERSION.SDK_INT < 19)
+    if (Build.VERSION.SDK_INT < 21)
     {
       result = Uri.fromFile(file);
     }
