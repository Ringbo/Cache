diff --git a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
index 558cf56..12ff4f6 100644
--- a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
+++ b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
@@ -5730,7 +5730,8 @@
     private int updateSystemUiVisibilityLw() {
         // If there is no window focused, there will be nobody to handle the events
         // anyway, so just hang on in whatever state we're in until things settle down.
-        WindowState win = mFocusedWindow != null ? mFocusedWindow : mTopFullscreenOpaqueWindowState;
+        final WindowState win = mFocusedWindow != null ? mFocusedWindow
+                : mTopFullscreenOpaqueWindowState;
         if (win == null) {
             return 0;
         }
@@ -5766,7 +5767,7 @@
                     try {
                         IStatusBarService statusbar = getStatusBarService();
                         if (statusbar != null) {
-                            statusbar.setSystemUiVisibility(visibility, 0xffffffff);
+                            statusbar.setSystemUiVisibility(visibility, 0xffffffff, win.toString());
                             statusbar.topAppWindowChanged(needsMenu);
                         }
                     } catch (RemoteException e) {
