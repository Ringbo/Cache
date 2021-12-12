diff --git a/core/java/android/widget/Toolbar.java b/core/java/android/widget/Toolbar.java
index c0d8764..d403bf5 100644
--- a/core/java/android/widget/Toolbar.java
+++ b/core/java/android/widget/Toolbar.java
@@ -1344,7 +1344,7 @@
                     subtitleRight = subtitleRight - mTitleMarginEnd;
                     titleTop = subtitleBottom + lp.bottomMargin;
                 }
-                right = Math.max(titleRight, subtitleRight);
+                right = Math.min(titleRight, subtitleRight);
             } else {
                 final int ld = mTitleMarginStart - collapsingMargins[0];
                 left += Math.max(0, ld);
