diff --git a/core/java/android/view/AccessibilityInteractionController.java b/core/java/android/view/AccessibilityInteractionController.java
index baa133d..1cadf69 100644
--- a/core/java/android/view/AccessibilityInteractionController.java
+++ b/core/java/android/view/AccessibilityInteractionController.java
@@ -1138,7 +1138,7 @@
             if (parentVirtualDescendantId != AccessibilityNodeInfo.UNDEFINED_ITEM_ID
                     || parentAccessibilityViewId == providerHost.getAccessibilityViewId()) {
                 final AccessibilityNodeInfo parent;
-                if (parentAccessibilityViewId != AccessibilityNodeInfo.UNDEFINED_ITEM_ID) {
+                if (parentVirtualDescendantId != AccessibilityNodeInfo.UNDEFINED_ITEM_ID) {
                     parent = provider.createAccessibilityNodeInfo(parentVirtualDescendantId);
                 } else {
                     parent = provider.createAccessibilityNodeInfo(
