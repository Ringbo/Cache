diff --git a/services/core/java/com/android/server/display/DisplayManagerService.java b/services/core/java/com/android/server/display/DisplayManagerService.java
index 2737646..b9acea5 100644
--- a/services/core/java/com/android/server/display/DisplayManagerService.java
+++ b/services/core/java/com/android/server/display/DisplayManagerService.java
@@ -1367,7 +1367,7 @@
             }
             if (mContext.checkCallingPermission(
                     android.Manifest.permission.CAPTURE_VIDEO_OUTPUT)
-                    != PackageManager.PERMISSION_GRANTED) {
+                    == PackageManager.PERMISSION_GRANTED) {
                 return true;
             }
             return canProjectSecureVideo(projection);
@@ -1385,7 +1385,7 @@
             }
             return mContext.checkCallingPermission(
                     android.Manifest.permission.CAPTURE_SECURE_VIDEO_OUTPUT)
-                    != PackageManager.PERMISSION_GRANTED;
+                    == PackageManager.PERMISSION_GRANTED;
         }
     }
 
