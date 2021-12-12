diff --git a/services/java/com/android/server/wm/WindowManagerService.java b/services/java/com/android/server/wm/WindowManagerService.java
index eed41a0..1e9fd02 100644
--- a/services/java/com/android/server/wm/WindowManagerService.java
+++ b/services/java/com/android/server/wm/WindowManagerService.java
@@ -5460,8 +5460,9 @@
             shortSize = (int)(shortSize/dm.density);
 
             // These semi-magic numbers define our compatibility modes for
-            // applications with different screens.  Don't change unless you
-            // make sure to test lots and lots of apps!
+            // applications with different screens.  These are guarantees to
+            // app developers about the space they can expect for a particular
+            // configuration.  DO NOT CHANGE!
             if (longSize < 470) {
                 // This is shorter than an HVGA normal density screen (which
                 // is 480 pixels on its long side).
@@ -5469,12 +5470,12 @@
                         | Configuration.SCREENLAYOUT_LONG_NO;
             } else {
                 // What size is this screen screen?
-                if (longSize >= 800 && shortSize >= 600) {
-                    // SVGA or larger screens at medium density are the point
+                if (longSize >= 960 && shortSize >= 720) {
+                    // 1.5xVGA or larger screens at medium density are the point
                     // at which we consider it to be an extra large screen.
                     mScreenLayout = Configuration.SCREENLAYOUT_SIZE_XLARGE;
-                } else if (longSize >= 530 && shortSize >= 400) {
-                    // SVGA or larger screens at high density are the point
+                } else if (longSize >= 640 && shortSize >= 480) {
+                    // VGA or larger screens at medium density are the point
                     // at which we consider it to be a large screen.
                     mScreenLayout = Configuration.SCREENLAYOUT_SIZE_LARGE;
                 } else {
