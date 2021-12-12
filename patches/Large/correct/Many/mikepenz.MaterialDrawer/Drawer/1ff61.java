diff --git a/library/src/main/java/com/mikepenz/materialdrawer/Drawer.java b/library/src/main/java/com/mikepenz/materialdrawer/Drawer.java
index 5fd0da5..2b63da3 100644
--- a/library/src/main/java/com/mikepenz/materialdrawer/Drawer.java
+++ b/library/src/main/java/com/mikepenz/materialdrawer/Drawer.java
@@ -538,7 +538,7 @@
         if (mDrawerBuilder.mRecyclerView != null) {
             mDrawerBuilder.mAdapter.deselect();
             mDrawerBuilder.mAdapter.select(position, false);
-            if (mDrawerBuilder.mOnDrawerItemClickListener != null && fireOnClick && position < 0) {
+            if (mDrawerBuilder.mOnDrawerItemClickListener != null && fireOnClick && position >= 0) {
                 mDrawerBuilder.mOnDrawerItemClickListener.onItemClick(null, position, mDrawerBuilder.mAdapter.getItem(position));
             }
         }
