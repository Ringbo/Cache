diff --git a/services/core/java/com/android/server/InputMethodManagerService.java b/services/core/java/com/android/server/InputMethodManagerService.java
index 8442c11..fe5b3a2 100644
--- a/services/core/java/com/android/server/InputMethodManagerService.java
+++ b/services/core/java/com/android/server/InputMethodManagerService.java
@@ -2046,7 +2046,7 @@
         }
         mWindowManagerInternal.updateInputMethodWindowStatus(token,
                 (vis & InputMethodService.IME_VISIBLE) != 0,
-                token != null ? info.mTargetWindow : null);
+                info != null ? info.mTargetWindow : null);
     }
 
     private void updateSystemUi(IBinder token, int vis, int backDisposition) {
