diff --git a/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java b/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java
index 4be6833..0b1e138 100644
--- a/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java
+++ b/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java
@@ -1748,14 +1748,14 @@
     private void updateMagnificationLocked(UserState userState) {
         final int userId = userState.mUserId;
         if (userId == mCurrentUserId && mMagnificationController != null) {
-            if (userHasMagnificationServicesLocked(userState)) {
+            if (userState.mIsDisplayMagnificationEnabled ||
+                    userHasMagnificationServicesLocked(userState)) {
                 mMagnificationController.setUserId(userState.mUserId);
             } else {
                 // If the user no longer has any magnification-controlling
                 // services and is not using magnification gestures, then
                 // reset the state to normal.
-                if (!userState.mIsDisplayMagnificationEnabled
-                        && mMagnificationController.resetIfNeeded(true)) {
+                if (mMagnificationController.resetIfNeeded(true)) {
                     // Animations are still running, so wait until we receive a
                     // callback verifying that we've reset magnification.
                     mUnregisterMagnificationOnReset = true;
