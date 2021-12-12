diff --git a/services/java/com/android/server/accessibility/AccessibilityManagerService.java b/services/java/com/android/server/accessibility/AccessibilityManagerService.java
index 1f3ac96..7a5f55a 100644
--- a/services/java/com/android/server/accessibility/AccessibilityManagerService.java
+++ b/services/java/com/android/server/accessibility/AccessibilityManagerService.java
@@ -1160,7 +1160,9 @@
         boolean setInputFilter = false;
         AccessibilityInputFilter inputFilter = null;
         synchronized (mLock) {
-            if (userState.mIsAccessibilityEnabled) {
+            // Accessibility enabled means at least one service is enabled.
+            if (userState.mIsAccessibilityEnabled
+                    || userState.mIsDisplayMagnificationEnabled) {
                 if (!mHasInputFilter) {
                     mHasInputFilter = true;
                     if (mInputFilter == null) {
@@ -1174,7 +1176,8 @@
                 if (userState.mIsDisplayMagnificationEnabled) {
                     flags |= AccessibilityInputFilter.FLAG_FEATURE_SCREEN_MAGNIFIER;
                 }
-                if (userState.mIsTouchExplorationEnabled) {
+                // Touch exploration without accessibility makes no sense.
+                if (userState.mIsAccessibilityEnabled && userState.mIsTouchExplorationEnabled) {
                     flags |= AccessibilityInputFilter.FLAG_FEATURE_TOUCH_EXPLORATION;
                 }
                 mInputFilter.setEnabledFeatures(flags);
