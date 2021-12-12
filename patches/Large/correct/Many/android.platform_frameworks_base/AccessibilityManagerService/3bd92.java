diff --git a/services/java/com/android/server/accessibility/AccessibilityManagerService.java b/services/java/com/android/server/accessibility/AccessibilityManagerService.java
index 1ad8047..d96369b 100644
--- a/services/java/com/android/server/accessibility/AccessibilityManagerService.java
+++ b/services/java/com/android/server/accessibility/AccessibilityManagerService.java
@@ -642,14 +642,16 @@
     }
 
     /**
-     * Installs or removes the accessibility input filter when accessibility is enabled
-     * or disabled.
+     * Sets the input filter state. If the filter is in enabled it is registered
+     * in the window manager, otherwise the filter is removed from the latter.
+     *
+     * @param enabled Whether the input filter is enabled.
      */
-    private void updateInputFilterLocked() {
+    private void setInputFilterEnabledLocked(boolean enabled) {
         WindowManagerService wm = (WindowManagerService)ServiceManager.getService(
                 Context.WINDOW_SERVICE);
         if (wm != null) {
-            if (mIsEnabled) {
+            if (enabled) {
                 if (mInputFilter == null) {
                     mInputFilter = new AccessibilityInputFilter(mContext);
                 }
@@ -681,7 +683,7 @@
         if (enabledServices.size() > 0
                 && service.mFeedbackType == AccessibilityServiceInfo.FEEDBACK_SPOKEN) {
             updateClientsLocked();
-            updateInputFilterLocked();
+            setInputFilterEnabledLocked(true);
         }
     }
 
@@ -697,7 +699,7 @@
         if (enabledServices.isEmpty()
                 && service.mFeedbackType == AccessibilityServiceInfo.FEEDBACK_SPOKEN) {
             updateClientsLocked();
-            updateInputFilterLocked();
+            setInputFilterEnabledLocked(false);
         }
     }
 
