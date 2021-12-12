diff --git a/library/src/main/java/com/mikepenz/materialdrawer/adapter/BaseDrawerAdapter.java b/library/src/main/java/com/mikepenz/materialdrawer/adapter/BaseDrawerAdapter.java
index 6244609..232b68d 100644
--- a/library/src/main/java/com/mikepenz/materialdrawer/adapter/BaseDrawerAdapter.java
+++ b/library/src/main/java/com/mikepenz/materialdrawer/adapter/BaseDrawerAdapter.java
@@ -246,13 +246,13 @@
     }
 
     public IDrawerItem getItem(int position) {
-        if (position < 0 || position > getItemCount()) {
+        if (position < 0 || position >= getItemCount()) {
             return null;
         }
 
         if (position < getHeaderItemCount()) {
             return mHeaderDrawerItems.get(position);
-        } else if (position < getHeaderItemCount() + getDrawerItemCount()) {
+        } else if (position < (getHeaderItemCount() + getDrawerItemCount())) {
             return mDrawerItems.get(position - getHeaderItemCount());
         } else {
             return mFooterDrawerItems.get(position - getHeaderItemCount() - getDrawerItemCount());
