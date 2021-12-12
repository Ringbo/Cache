diff --git a/collect_app/src/main/java/org/odk/collect/android/widgets/BaseImageWidget.java b/collect_app/src/main/java/org/odk/collect/android/widgets/BaseImageWidget.java
index 4e6ec29..e726c93 100644
--- a/collect_app/src/main/java/org/odk/collect/android/widgets/BaseImageWidget.java
+++ b/collect_app/src/main/java/org/odk/collect/android/widgets/BaseImageWidget.java
@@ -63,7 +63,7 @@
         // remove the file
         deleteFile();
         if (imageView != null) {
-            imageView.setImageBitmap(null);
+            imageView.setImageDrawable(null);
         }
 
         errorTextView.setVisibility(View.GONE);
