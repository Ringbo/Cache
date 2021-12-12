diff --git a/core/java/android/view/FocusFinder.java b/core/java/android/view/FocusFinder.java
index ae1ee42..d25e5f0 100644
--- a/core/java/android/view/FocusFinder.java
+++ b/core/java/android/view/FocusFinder.java
@@ -118,7 +118,7 @@
      * @return the "effective" root of {@param focused}
      */
     private ViewGroup getEffectiveRoot(ViewGroup root, View focused) {
-        if (focused == null) {
+        if (focused == null || focused == root) {
             return root;
         }
         ViewParent effective = focused.getParent();
