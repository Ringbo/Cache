diff --git a/core/java/android/widget/TabWidget.java b/core/java/android/widget/TabWidget.java
index a26bfa2..47f5c6c 100644
--- a/core/java/android/widget/TabWidget.java
+++ b/core/java/android/widget/TabWidget.java
@@ -277,7 +277,7 @@
         if (child.getLayoutParams() == null) {
             final LinearLayout.LayoutParams lp = new LayoutParams(
                     0,
-                    ViewGroup.LayoutParams.WRAP_CONTENT, 1);
+                    ViewGroup.LayoutParams.FILL_PARENT, 1.0f);
             lp.setMargins(0, 0, 0, 0);
             child.setLayoutParams(lp);
         }
@@ -289,10 +289,10 @@
         // If we have dividers between the tabs and we already have at least one
         // tab, then add a divider before adding the next tab.
         if (mDividerDrawable != null && getTabCount() > 0) {
-            View divider = new View(mContext);
+            ImageView divider = new ImageView(mContext);
             final LinearLayout.LayoutParams lp = new LayoutParams(
                     mDividerDrawable.getIntrinsicWidth(),
-                    mDividerDrawable.getIntrinsicHeight());
+                    LayoutParams.FILL_PARENT);
             lp.setMargins(0, 0, 0, 0);
             divider.setLayoutParams(lp);
             divider.setBackgroundDrawable(mDividerDrawable);
