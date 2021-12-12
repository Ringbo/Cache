diff --git a/services/core/java/com/android/server/statusbar/StatusBarManagerService.java b/services/core/java/com/android/server/statusbar/StatusBarManagerService.java
index e9ace29..0e51953 100644
--- a/services/core/java/com/android/server/statusbar/StatusBarManagerService.java
+++ b/services/core/java/com/android/server/statusbar/StatusBarManagerService.java
@@ -249,7 +249,7 @@
      */
     @Override
     public void disable2(int what, IBinder token, String pkg) {
-        disableForUser(what, token, pkg, mCurrentUserId);
+        disable2ForUser(what, token, pkg, mCurrentUserId);
     }
 
     /**
