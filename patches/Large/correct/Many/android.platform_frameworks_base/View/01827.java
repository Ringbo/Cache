diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 9613149..9f5613e 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -6308,10 +6308,7 @@
         }
     }
 
-    /**
-     * @hide
-     */
-    public boolean canTakeAccessibilityFocusFromHover() {
+    private boolean canTakeAccessibilityFocusFromHover() {
         if (includeForAccessibility() && isActionableForAccessibility()) {
             return true;
         }
