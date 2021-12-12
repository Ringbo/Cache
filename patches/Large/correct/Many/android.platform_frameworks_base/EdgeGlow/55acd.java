diff --git a/core/java/android/widget/EdgeGlow.java b/core/java/android/widget/EdgeGlow.java
index c2cb0a0..75cef38 100644
--- a/core/java/android/widget/EdgeGlow.java
+++ b/core/java/android/widget/EdgeGlow.java
@@ -260,7 +260,7 @@
                 glowHeight * MAX_GLOW_HEIGHT);
         if (mWidth < mMinWidth) {
             // Center the glow and clip it.
-            int glowLeft = (mWidth - glowWidth)/2;
+            int glowLeft = (mWidth - mMinWidth)/2;
             mGlow.setBounds(glowLeft, 0, mWidth - glowLeft, glowBottom);
         } else {
             // Stretch the glow to fit.
@@ -274,7 +274,7 @@
         int edgeBottom = (int) (edgeHeight * mEdgeScaleY);
         if (mWidth < mMinWidth) {
             // Center the edge and clip it.
-            int edgeLeft = (mWidth - edgeWidth)/2;
+            int edgeLeft = (mWidth - mMinWidth)/2;
             mEdge.setBounds(edgeLeft, 0, mWidth - edgeLeft, edgeBottom);
         } else {
             // Stretch the edge to fit.
