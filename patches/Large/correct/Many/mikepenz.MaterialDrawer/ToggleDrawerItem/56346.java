diff --git a/library/src/main/java/com/mikepenz/materialdrawer/model/ToggleDrawerItem.java b/library/src/main/java/com/mikepenz/materialdrawer/model/ToggleDrawerItem.java
index 03d975c..8d45348 100644
--- a/library/src/main/java/com/mikepenz/materialdrawer/model/ToggleDrawerItem.java
+++ b/library/src/main/java/com/mikepenz/materialdrawer/model/ToggleDrawerItem.java
@@ -132,7 +132,7 @@
         } else {
             iconColor = UIUtils.decideColor(ctx, getDisabledIconColor(), getDisabledIconColorRes(), R.attr.material_drawer_hint_text, R.color.material_drawer_hint_text);
         }
-        int selectedIconColor = UIUtils.decideColor(ctx, getSelectedIconColor(), getSelectedColorRes(), R.attr.material_drawer_selected_text, R.color.material_drawer_selected_text);
+        int selectedIconColor = UIUtils.decideColor(ctx, getSelectedIconColor(), getSelectedIconColorRes(), R.attr.material_drawer_selected_text, R.color.material_drawer_selected_text);
 
         //set the background for the item
         UIUtils.setBackground(viewHolder.view, UIUtils.getDrawerItemBackground(selectedColor));
