diff --git a/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java b/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java
index 9ce81ed..c810e6c 100644
--- a/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java
+++ b/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java
@@ -4086,7 +4086,7 @@
         }
 
         public boolean isHandlingAccessibilityEvents() {
-            return !mBoundServices.isEmpty() || !mBoundServices.isEmpty();
+            return !mBoundServices.isEmpty() || !mBindingServices.isEmpty();
         }
 
         public void onSwitchToAnotherUser() {
