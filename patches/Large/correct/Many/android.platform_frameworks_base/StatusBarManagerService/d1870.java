diff --git a/services/core/java/com/android/server/statusbar/StatusBarManagerService.java b/services/core/java/com/android/server/statusbar/StatusBarManagerService.java
index 4a00ebd..dbbaa5e 100644
--- a/services/core/java/com/android/server/statusbar/StatusBarManagerService.java
+++ b/services/core/java/com/android/server/statusbar/StatusBarManagerService.java
@@ -319,7 +319,7 @@
      */
     @Override
     public void disable2(int what, IBinder token, String pkg) {
-        disableForUser(what, token, pkg, mCurrentUserId);
+        disable2ForUser(what, token, pkg, mCurrentUserId);
     }
 
     /**
