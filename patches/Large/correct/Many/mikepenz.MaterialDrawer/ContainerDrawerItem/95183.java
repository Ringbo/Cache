diff --git a/library/src/main/java/com/mikepenz/materialdrawer/model/ContainerDrawerItem.java b/library/src/main/java/com/mikepenz/materialdrawer/model/ContainerDrawerItem.java
index 56a04ea..46b6583 100644
--- a/library/src/main/java/com/mikepenz/materialdrawer/model/ContainerDrawerItem.java
+++ b/library/src/main/java/com/mikepenz/materialdrawer/model/ContainerDrawerItem.java
@@ -85,7 +85,7 @@
             ((ViewGroup) viewHolder.view).addView(mView, 0);
             layoutParams.bottomMargin = ctx.getResources().getDimensionPixelSize(R.dimen.material_drawer_padding);
         } else if (mViewPosition == Position.BOTTOM) {
-            ((ViewGroup) viewHolder.view).addView(mView, 1);
+            ((ViewGroup) viewHolder.view).addView(mView);
             layoutParams.topMargin = ctx.getResources().getDimensionPixelSize(R.dimen.material_drawer_padding);
         } else {
             viewHolder.divider.setVisibility(View.GONE);
