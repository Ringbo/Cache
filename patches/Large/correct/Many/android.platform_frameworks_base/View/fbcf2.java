diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index a0fcf27..ad71b58 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -7240,8 +7240,7 @@
     public void setAccessibilityPaneTitle(CharSequence accessibilityPaneTitle) {
         if (!TextUtils.equals(accessibilityPaneTitle, mAccessibilityPaneTitle)) {
             mAccessibilityPaneTitle = accessibilityPaneTitle;
-            notifyViewAccessibilityStateChangedIfNeeded(
-                    AccessibilityEvent.CONTENT_CHANGE_TYPE_PANE_TITLE);
+            notifyAccessibilityStateChanged(AccessibilityEvent.CONTENT_CHANGE_TYPE_PANE_TITLE);
         }
     }
 
