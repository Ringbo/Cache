diff --git a/services/core/java/com/android/server/wm/WindowState.java b/services/core/java/com/android/server/wm/WindowState.java
index 2398661..f36b692 100644
--- a/services/core/java/com/android/server/wm/WindowState.java
+++ b/services/core/java/com/android/server/wm/WindowState.java
@@ -2610,7 +2610,7 @@
                 setAppOpVisibilityLw(false);
             }
         } else {
-            final int mode = mService.mAppOps.startOpNoThrow(mAppOp, uid, packageName);
+            final int mode = mService.mAppOps.startOpNoThrow(mAppOp, uid, packageName, true);
             if (mode == MODE_ALLOWED || mode == MODE_DEFAULT) {
                 setAppOpVisibilityLw(true);
             }
