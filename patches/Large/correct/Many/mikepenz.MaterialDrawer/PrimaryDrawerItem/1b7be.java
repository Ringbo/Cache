diff --git a/library/src/main/java/com/mikepenz/materialdrawer/model/PrimaryDrawerItem.java b/library/src/main/java/com/mikepenz/materialdrawer/model/PrimaryDrawerItem.java
index aa2d362..b02e5ee 100644
--- a/library/src/main/java/com/mikepenz/materialdrawer/model/PrimaryDrawerItem.java
+++ b/library/src/main/java/com/mikepenz/materialdrawer/model/PrimaryDrawerItem.java
@@ -77,7 +77,7 @@
         boolean badgeVisible = StringHolder.applyToOrHide(mBadge, viewHolder.badge);
         //style the badge if it is visible
         if (badgeVisible) {
-            mBadgeStyle.style(viewHolder.badge, getTextColorStateList(getColor(ctx), getSelectedColor(ctx)));
+            mBadgeStyle.style(viewHolder.badge, getTextColorStateList(getColor(ctx), getSelectedTextColor(ctx)));
             viewHolder.badgeContainer.setVisibility(View.VISIBLE);
         } else {
             viewHolder.badgeContainer.setVisibility(View.GONE);
