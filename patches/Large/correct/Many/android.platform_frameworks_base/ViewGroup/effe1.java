diff --git a/core/java/android/view/ViewGroup.java b/core/java/android/view/ViewGroup.java
index 697636e..c89e039 100644
--- a/core/java/android/view/ViewGroup.java
+++ b/core/java/android/view/ViewGroup.java
@@ -2162,7 +2162,9 @@
     @Override
     public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
         super.onInitializeAccessibilityNodeInfo(info);
-        if ((mPrivateFlags & IS_ROOT_NAMESPACE) != 0) {
+        // If the view is not the topmost one in the view hierarchy and it is
+        // marked as the logical root of a view hierarchy, do not go any deeper.
+        if ((!(getParent() instanceof ViewRootImpl)) && (mPrivateFlags & IS_ROOT_NAMESPACE) != 0) {
             return;
         }
         for (int i = 0, count = mChildrenCount; i < count; i++) {
