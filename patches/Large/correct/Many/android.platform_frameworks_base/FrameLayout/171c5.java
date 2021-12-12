diff --git a/core/java/android/widget/FrameLayout.java b/core/java/android/widget/FrameLayout.java
index 7bae360..2bc6301 100644
--- a/core/java/android/widget/FrameLayout.java
+++ b/core/java/android/widget/FrameLayout.java
@@ -321,7 +321,7 @@
                             mPaddingTop - mPaddingBottom - lp.topMargin - lp.bottomMargin,
                             MeasureSpec.EXACTLY);
                 } else {
-                    childHeightMeasureSpec = getChildMeasureSpec(widthMeasureSpec,
+                    childHeightMeasureSpec = getChildMeasureSpec(heightMeasureSpec,
                             mPaddingTop + mPaddingBottom + lp.topMargin + lp.bottomMargin,
                             lp.height);
                 }
