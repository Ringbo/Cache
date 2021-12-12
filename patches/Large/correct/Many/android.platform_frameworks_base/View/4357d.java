diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 2bb1ebc..75411fe 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -8185,8 +8185,10 @@
     * @see #performAccessibilityAction(int, Bundle)
     *
     * Note: Called from the default {@link AccessibilityDelegate}.
+    *
+    * @hide Until we've refactored all accessibility delegation methods.
     */
-    boolean performAccessibilityActionInternal(int action, Bundle arguments) {
+    public boolean performAccessibilityActionInternal(int action, Bundle arguments) {
         switch (action) {
             case AccessibilityNodeInfo.ACTION_CLICK: {
                 if (isClickable()) {
