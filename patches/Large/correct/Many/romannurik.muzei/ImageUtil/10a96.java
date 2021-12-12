diff --git a/main/src/main/java/com/google/android/apps/muzei/render/ImageUtil.java b/main/src/main/java/com/google/android/apps/muzei/render/ImageUtil.java
index ed6d128..4d4c31f 100644
--- a/main/src/main/java/com/google/android/apps/muzei/render/ImageUtil.java
+++ b/main/src/main/java/com/google/android/apps/muzei/render/ImageUtil.java
@@ -22,7 +22,7 @@
 public class ImageUtil {
     // Make sure input images are very small!
     public static float calculateDarkness(Bitmap bitmap) {
-        if (bitmap == null) {
+        if (bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
             return 0;
         }
 
