diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 1edcff6..1ef46a9 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -11473,7 +11473,7 @@
                     if (concatMatrix) {
                         // Undo the scroll translation, apply the transformation matrix,
                         // then redo the scroll translate to get the correct result.
-                        if (!hasDisplayList) {
+                        if (!useDisplayListProperties) {
                             canvas.translate(-transX, -transY);
                             canvas.concat(transformToApply.getMatrix());
                             canvas.translate(transX, transY);
