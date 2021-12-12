diff --git a/library/src/main/java/com/mikepenz/materialdrawer/holder/ImageHolder.java b/library/src/main/java/com/mikepenz/materialdrawer/holder/ImageHolder.java
index 4c0ea4f..6520faf 100644
--- a/library/src/main/java/com/mikepenz/materialdrawer/holder/ImageHolder.java
+++ b/library/src/main/java/com/mikepenz/materialdrawer/holder/ImageHolder.java
@@ -73,7 +73,7 @@
             imageView.setImageDrawable(mIcon);
         } else if (mBitmap != null) {
             imageView.setImageBitmap(mBitmap);
-        } else if (mIconRes != 0) {
+        } else if (mIconRes != -1) {
             imageView.setImageResource(mIconRes);
         } else if (mIIcon != null) {
             imageView.setImageDrawable(new IconicsDrawable(imageView.getContext(), mIIcon).actionBarSize().paddingDp(1));
@@ -97,7 +97,7 @@
 
         if (mIIcon != null) {
             icon = new IconicsDrawable(ctx, mIIcon).color(iconColor).actionBarSize().paddingDp(paddingDp);
-        } else if (mIconRes > -1) {
+        } else if (mIconRes != -1) {
             icon = UIUtils.getCompatDrawable(ctx, mIconRes);
         } else if (mUri != null) {
             try {
