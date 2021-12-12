diff --git a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
index 9e268c3..ba0d985 100644
--- a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
+++ b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
@@ -2176,7 +2176,7 @@
 
         // Cancel any pending meta actions if we see any other keys being pressed between the down
         // of the meta key and its corresponding up.
-        if (mPendingMetaAction && KeyEvent.isMetaKey(keyCode)) {
+        if (mPendingMetaAction && !KeyEvent.isMetaKey(keyCode)) {
             mPendingMetaAction = false;
         }
 
