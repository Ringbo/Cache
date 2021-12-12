diff --git a/core/java/android/transition/ChangeBounds.java b/core/java/android/transition/ChangeBounds.java
index 0a44ba2..0da5fb6 100644
--- a/core/java/android/transition/ChangeBounds.java
+++ b/core/java/android/transition/ChangeBounds.java
@@ -118,7 +118,7 @@
     private void captureValues(TransitionValues values) {
         View view = values.view;
 
-        if (view.isLaidOut()) {
+        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
             values.values.put(PROPNAME_BOUNDS, new Rect(view.getLeft(), view.getTop(),
                     view.getRight(), view.getBottom()));
             values.values.put(PROPNAME_PARENT, values.view.getParent());
