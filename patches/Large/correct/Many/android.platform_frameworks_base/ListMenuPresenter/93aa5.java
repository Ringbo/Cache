diff --git a/core/java/com/android/internal/view/menu/ListMenuPresenter.java b/core/java/com/android/internal/view/menu/ListMenuPresenter.java
index cc09927..27e4191 100644
--- a/core/java/com/android/internal/view/menu/ListMenuPresenter.java
+++ b/core/java/com/android/internal/view/menu/ListMenuPresenter.java
@@ -184,12 +184,12 @@
 
     private class MenuAdapter extends BaseAdapter {
         public int getCount() {
-            ArrayList<MenuItemImpl> items = mMenu.getVisibleItems();
+            ArrayList<MenuItemImpl> items = mMenu.getNonActionItems();
             return items.size() - mItemIndexOffset;
         }
 
         public MenuItemImpl getItem(int position) {
-            ArrayList<MenuItemImpl> items = mMenu.getVisibleItems();
+            ArrayList<MenuItemImpl> items = mMenu.getNonActionItems();
             return items.get(position + mItemIndexOffset);
         }
 
