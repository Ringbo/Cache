diff --git a/android-client-common/src/main/java/com/google/android/apps/muzei/util/ImageBlurrer.java b/android-client-common/src/main/java/com/google/android/apps/muzei/util/ImageBlurrer.java
index a093a27..65713ec 100644
--- a/android-client-common/src/main/java/com/google/android/apps/muzei/util/ImageBlurrer.java
+++ b/android-client-common/src/main/java/com/google/android/apps/muzei/util/ImageBlurrer.java
@@ -46,7 +46,7 @@
             return null;
         }
 
-        Bitmap dest = src.copy(src.getConfig(), false);
+        Bitmap dest = src.copy(src.getConfig(), true);
         if (radius == 0f && desaturateAmount == 0f) {
             return dest;
         }
