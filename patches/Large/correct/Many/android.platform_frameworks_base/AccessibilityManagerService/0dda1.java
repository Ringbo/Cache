diff --git a/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java b/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java
index b4b40ae..51b5862 100644
--- a/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java
+++ b/services/accessibility/java/com/android/server/accessibility/AccessibilityManagerService.java
@@ -4073,7 +4073,7 @@
         }
 
         public boolean isHandlingAccessibilityEvents() {
-            return !mBoundServices.isEmpty() || !mBoundServices.isEmpty();
+            return !mBoundServices.isEmpty() || !mBindingServices.isEmpty();
         }
 
         public void onSwitchToAnotherUser() {
