diff --git a/services/core/java/com/android/server/statusbar/StatusBarManagerService.java b/services/core/java/com/android/server/statusbar/StatusBarManagerService.java
index d24e1af..2c6d504 100644
--- a/services/core/java/com/android/server/statusbar/StatusBarManagerService.java
+++ b/services/core/java/com/android/server/statusbar/StatusBarManagerService.java
@@ -310,7 +310,7 @@
      */
     @Override
     public void disable2(int what, IBinder token, String pkg) {
-        disableForUser(what, token, pkg, mCurrentUserId);
+        disable2ForUser(what, token, pkg, mCurrentUserId);
     }
 
     /**
