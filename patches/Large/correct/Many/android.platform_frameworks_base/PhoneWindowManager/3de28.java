diff --git a/services/core/java/com/android/server/policy/PhoneWindowManager.java b/services/core/java/com/android/server/policy/PhoneWindowManager.java
index bd4210c..1d5b1a3 100644
--- a/services/core/java/com/android/server/policy/PhoneWindowManager.java
+++ b/services/core/java/com/android/server/policy/PhoneWindowManager.java
@@ -6094,7 +6094,7 @@
         // Cancel any pending remote recents animations before handling the button itself. In the
         // case where we are going home and the recents animation has already started, just cancel
         // the recents animation, leaving the home stack in place for the pending start activity
-        if (isNavBarVirtKey && !down) {
+        if (isNavBarVirtKey && !down && !canceled) {
             boolean isHomeKey = keyCode == KeyEvent.KEYCODE_HOME;
             mActivityManagerInternal.cancelRecentsAnimation(!isHomeKey);
         }
