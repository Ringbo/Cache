diff --git a/src/android/support/design/widget/AppBarLayout.java b/src/android/support/design/widget/AppBarLayout.java
index 23cd970..3b078dd 100644
--- a/src/android/support/design/widget/AppBarLayout.java
+++ b/src/android/support/design/widget/AppBarLayout.java
@@ -1243,7 +1243,7 @@
                     return 0;
                 } else {
                     final int availScrollRange = totalScrollRange - preScrollDown;
-                    if (availScrollRange == 0) {
+                    if (availScrollRange != 0) {
                         // Else we'll use a interpolated ratio of the overlap, depending on offset
                         final float percScrolled = offset / (float) availScrollRange;
                         return MathUtils.constrain(
