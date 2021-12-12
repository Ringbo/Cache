diff --git a/src/android/support/design/widget/CollapsingToolbarLayout.java b/src/android/support/design/widget/CollapsingToolbarLayout.java
index 8131663..984ff44 100644
--- a/src/android/support/design/widget/CollapsingToolbarLayout.java
+++ b/src/android/support/design/widget/CollapsingToolbarLayout.java
@@ -689,7 +689,7 @@
      * @attr ref android.support.design.R.styleable#CollapsingToolbarLayout_collapsedTitleGravity
      */
     public void setCollapsedTitleGravity(int gravity) {
-        mCollapsingTextHelper.setExpandedTextGravity(gravity);
+        mCollapsingTextHelper.setCollapsedTextGravity(gravity);
     }
 
     /**
