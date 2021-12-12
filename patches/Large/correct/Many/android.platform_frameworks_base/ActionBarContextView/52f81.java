diff --git a/core/java/com/android/internal/widget/ActionBarContextView.java b/core/java/com/android/internal/widget/ActionBarContextView.java
index 062a9b1..7c671e8 100644
--- a/core/java/com/android/internal/widget/ActionBarContextView.java
+++ b/core/java/com/android/internal/widget/ActionBarContextView.java
@@ -241,7 +241,7 @@
         if (!mSplitActionBar) {
             menu.addMenuPresenter(mActionMenuPresenter, mPopupContext);
             mMenuView = (ActionMenuView) mActionMenuPresenter.getMenuView(this);
-            mMenuView.setBackgroundDrawable(null);
+            mMenuView.setBackground(null);
             addView(mMenuView, layoutParams);
         } else {
             // Allow full screen width in split mode.
