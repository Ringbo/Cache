diff --git a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
index 448925b..689e3bf 100644
--- a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
+++ b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
@@ -4274,7 +4274,7 @@
 
     private void waitForKeyguardWindowDrawn(IBinder windowToken,
             final ScreenOnListener screenOnListener) {
-        if (windowToken != null) {
+        if (windowToken != null && !mHideLockScreen) {
             try {
                 if (mWindowManager.waitForWindowDrawn(
                         windowToken, new IRemoteCallback.Stub() {
