diff --git a/source-gallery/src/main/java/com/google/android/apps/muzei/gallery/GallerySetupActivity.java b/source-gallery/src/main/java/com/google/android/apps/muzei/gallery/GallerySetupActivity.java
index 73fabcc..9a67710 100644
--- a/source-gallery/src/main/java/com/google/android/apps/muzei/gallery/GallerySetupActivity.java
+++ b/source-gallery/src/main/java/com/google/android/apps/muzei/gallery/GallerySetupActivity.java
@@ -61,7 +61,7 @@
             return;
         }
 
-        if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
+        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
             setResult(RESULT_OK);
             finish();
         } else {
