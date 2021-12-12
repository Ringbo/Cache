diff --git a/src/android/support/design/widget/CollapsingToolbarLayout.java b/src/android/support/design/widget/CollapsingToolbarLayout.java
index 0a2cb97..6f6b976 100644
--- a/src/android/support/design/widget/CollapsingToolbarLayout.java
+++ b/src/android/support/design/widget/CollapsingToolbarLayout.java
@@ -200,7 +200,7 @@
                             R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
         }
 
-        mScrimVisibleHeightTrigger = a.getInt(
+        mScrimVisibleHeightTrigger = a.getDimensionPixelSize(
                 R.styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
 
         mScrimAnimationDuration = a.getInt(
