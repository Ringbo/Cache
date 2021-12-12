diff --git a/core/java/android/widget/TextView.java b/core/java/android/widget/TextView.java
index 34b3a72..765d196 100644
--- a/core/java/android/widget/TextView.java
+++ b/core/java/android/widget/TextView.java
@@ -8475,8 +8475,14 @@
         }
     }
 
+    /**
+     * Performs an accessibility action after it has been offered to the
+     * delegate.
+     *
+     * @hide
+     */
     @Override
-    public boolean performAccessibilityAction(int action, Bundle arguments) {
+    public boolean performAccessibilityActionInternal(int action, Bundle arguments) {
         switch (action) {
             case AccessibilityNodeInfo.ACTION_CLICK: {
                 boolean handled = false;
@@ -8557,10 +8563,10 @@
             case AccessibilityNodeInfo.ACTION_NEXT_AT_MOVEMENT_GRANULARITY:
             case AccessibilityNodeInfo.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY: {
                 ensureIterableTextForAccessibilitySelectable();
-                return super.performAccessibilityAction(action, arguments);
+                return super.performAccessibilityActionInternal(action, arguments);
             }
             default: {
-                return super.performAccessibilityAction(action, arguments);
+                return super.performAccessibilityActionInternal(action, arguments);
             }
         }
     }
