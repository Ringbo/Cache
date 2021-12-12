diff --git a/library-extensions-expandable/src/main/java/com/mikepenz/fastadapter/expandable/ExpandableExtension.java b/library-extensions-expandable/src/main/java/com/mikepenz/fastadapter/expandable/ExpandableExtension.java
index 77041b8..6b0ad09 100644
--- a/library-extensions-expandable/src/main/java/com/mikepenz/fastadapter/expandable/ExpandableExtension.java
+++ b/library-extensions-expandable/src/main/java/com/mikepenz/fastadapter/expandable/ExpandableExtension.java
@@ -278,7 +278,7 @@
      */
     public int[] getExpandedItemsRootLevel(int position) {
         int[] expandedItems;
-        ArrayList<Integer> expandedItemsList = new ArrayList<>();
+        ArraySet<Integer> expandedItemsList = new ArraySet<>();
         Item item = mFastAdapter.getItem(position);
 
         for (int i = 0, size = mFastAdapter.getItemCount(); i < size; i++) {
@@ -296,7 +296,7 @@
         int expandedItemsListLength = expandedItemsList.size();
         expandedItems = new int[expandedItemsListLength];
         for (int i = 0; i < expandedItemsListLength; i++) {
-            expandedItems[i] = expandedItemsList.get(i);
+            expandedItems[i] = expandedItemsList.valueAt(i);
         }
         return expandedItems;
     }
