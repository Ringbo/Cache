diff --git a/carbon/src/main/java/carbon/widget/Chip.java b/carbon/src/main/java/carbon/widget/Chip.java
index a38f048..ded3da7 100644
--- a/carbon/src/main/java/carbon/widget/Chip.java
+++ b/carbon/src/main/java/carbon/widget/Chip.java
@@ -15,7 +15,7 @@
 /**
  * Created by Marcin on 2015-12-19.
  */
-public class Chip extends FrameLayout {
+public class Chip extends LinearLayout {
     private ImageView icon;
     private TextView title;
     private ImageView close;
@@ -123,12 +123,12 @@
     }
 
     public void setIconVisible(boolean visible) {
-        icon.setVisibility(visible ? VISIBLE : GONE);
+        icon.setVisibilityImmediate(visible ? VISIBLE : GONE);
         setPadding(visible ? 0 : (int) getResources().getDimension(R.dimen.carbon_chipPadding), getPaddingTop(), getPaddingRight(), getPaddingBottom());
     }
 
     public void setRemovable(boolean removable) {
-        close.setVisibility(removable ? VISIBLE : GONE);
+        close.setVisibilityImmediate(removable ? VISIBLE : GONE);
         setPadding(getPaddingLeft(), getPaddingTop(), removable ? 0 : (int) getResources().getDimension(R.dimen.carbon_chipPadding), getPaddingBottom());
     }
 
