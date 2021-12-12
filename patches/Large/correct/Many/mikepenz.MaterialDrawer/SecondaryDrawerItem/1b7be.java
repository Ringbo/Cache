diff --git a/library/src/main/java/com/mikepenz/materialdrawer/model/SecondaryDrawerItem.java b/library/src/main/java/com/mikepenz/materialdrawer/model/SecondaryDrawerItem.java
index 1388e31..31123c5 100644
--- a/library/src/main/java/com/mikepenz/materialdrawer/model/SecondaryDrawerItem.java
+++ b/library/src/main/java/com/mikepenz/materialdrawer/model/SecondaryDrawerItem.java
@@ -78,7 +78,7 @@
         boolean badgeVisible = StringHolder.applyToOrHide(mBadge, viewHolder.badge);
         //style the badge if it is visible
         if (badgeVisible) {
-            mBadgeStyle.style(viewHolder.badge, getTextColorStateList(getColor(ctx), getSelectedColor(ctx)));
+            mBadgeStyle.style(viewHolder.badge, getTextColorStateList(getColor(ctx), getSelectedTextColor(ctx)));
             viewHolder.badgeContainer.setVisibility(View.VISIBLE);
         } else {
             viewHolder.badgeContainer.setVisibility(View.GONE);
