diff --git a/library/src/main/java/com/mikepenz/materialdrawer/DrawerBuilder.java b/library/src/main/java/com/mikepenz/materialdrawer/DrawerBuilder.java
index fea7cd3..75f9186 100644
--- a/library/src/main/java/com/mikepenz/materialdrawer/DrawerBuilder.java
+++ b/library/src/main/java/com/mikepenz/materialdrawer/DrawerBuilder.java
@@ -1601,7 +1601,7 @@
         } else if (mSliderBackgroundDrawable != null) {
             UIUtils.setBackground(mSliderLayout, mSliderBackgroundDrawable);
         } else if (mSliderBackgroundDrawableRes != -1) {
-            UIUtils.setBackground(mSliderLayout, mSliderBackgroundColorRes);
+            UIUtils.setBackground(mSliderLayout, mSliderBackgroundDrawableRes);
         }
 
         //handle the header
