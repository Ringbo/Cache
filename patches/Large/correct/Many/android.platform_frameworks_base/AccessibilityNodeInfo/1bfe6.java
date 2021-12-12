diff --git a/core/java/android/view/accessibility/AccessibilityNodeInfo.java b/core/java/android/view/accessibility/AccessibilityNodeInfo.java
index 7671312..fa34ee7 100644
--- a/core/java/android/view/accessibility/AccessibilityNodeInfo.java
+++ b/core/java/android/view/accessibility/AccessibilityNodeInfo.java
@@ -293,7 +293,7 @@
      */
     public AccessibilityNodeInfo getParent() {
         enforceSealed();
-        if (!canPerformRequestOverConnection(mAccessibilityViewId)) {
+        if (!canPerformRequestOverConnection(mParentAccessibilityViewId)) {
             return null;
         }
         AccessibilityInteractionClient client = AccessibilityInteractionClient.getInstance();
