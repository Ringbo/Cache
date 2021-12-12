diff --git a/library/src/main/java/com/mikepenz/materialdrawer/model/ExpandableDrawerItem.java b/library/src/main/java/com/mikepenz/materialdrawer/model/ExpandableDrawerItem.java
index 46fd7a5..3f813e9 100644
--- a/library/src/main/java/com/mikepenz/materialdrawer/model/ExpandableDrawerItem.java
+++ b/library/src/main/java/com/mikepenz/materialdrawer/model/ExpandableDrawerItem.java
@@ -52,7 +52,7 @@
         public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
             if (drawerItem instanceof AbstractDrawerItem && drawerItem.isEnabled()) {
                 if (((AbstractDrawerItem) drawerItem).getSubItems() != null) {
-                    if (((AbstractDrawerItem) drawerItem).isExpanded()) {
+                    if (!((AbstractDrawerItem) drawerItem).isExpanded()) {
                         ViewCompat.animate(view.findViewById(R.id.material_drawer_arrow)).rotation(180).start();
                     } else {
                         ViewCompat.animate(view.findViewById(R.id.material_drawer_arrow)).rotation(0).start();
@@ -73,7 +73,7 @@
         //make sure all animations are stopped
         viewHolder.arrow.setColor(getIconColor(ctx));
         viewHolder.arrow.clearAnimation();
-        if (isExpanded()) {
+        if (!isExpanded()) {
             ViewCompat.setRotation(viewHolder.arrow, 0);
         } else {
             ViewCompat.setRotation(viewHolder.arrow, 180);
