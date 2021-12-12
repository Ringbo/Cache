diff --git a/services/java/com/android/server/wm/WindowManagerService.java b/services/java/com/android/server/wm/WindowManagerService.java
index 609016b..15a7ca6 100644
--- a/services/java/com/android/server/wm/WindowManagerService.java
+++ b/services/java/com/android/server/wm/WindowManagerService.java
@@ -5723,9 +5723,9 @@
             unrotDh = dh;
         }
         int sw = reduceConfigWidthSize(unrotDw, Surface.ROTATION_0, density, unrotDw, unrotDh);
-        sw = reduceConfigWidthSize(sw, Surface.ROTATION_90, density, unrotDw, unrotDh);
+        sw = reduceConfigWidthSize(sw, Surface.ROTATION_90, density, unrotDh, unrotDw);
         sw = reduceConfigWidthSize(sw, Surface.ROTATION_180, density, unrotDw, unrotDh);
-        sw = reduceConfigWidthSize(sw, Surface.ROTATION_270, density, unrotDw, unrotDh);
+        sw = reduceConfigWidthSize(sw, Surface.ROTATION_270, density, unrotDh, unrotDw);
         return sw;
     }
 
