diff --git a/library/src/com/nhaarman/listviewanimations/itemmanipulation/ExpandableListItemAdapter.java b/library/src/com/nhaarman/listviewanimations/itemmanipulation/ExpandableListItemAdapter.java
index 469ca5e..0ee2db0 100644
--- a/library/src/com/nhaarman/listviewanimations/itemmanipulation/ExpandableListItemAdapter.java
+++ b/library/src/com/nhaarman/listviewanimations/itemmanipulation/ExpandableListItemAdapter.java
@@ -284,7 +284,7 @@
     /**
      * Collapse the view at given position. Will do nothing if the view is already collapsed.
      *
-     * @param position the position to expand.
+     * @param position the position to collapse.
      */
     public void collapse(int position) {
         long itemId = getItemId(position);
@@ -296,7 +296,7 @@
     }
 
     /**
-     * Toggle the view at given position.
+     * Toggle the {@link View} at given position, ignores header or footer Views.
      *
      * @param position the position of the view to toggle.
      */
@@ -307,7 +307,7 @@
         boolean found = false;
         for (int i = 0; i < mAbsListView.getChildCount() && !found; i++) {
             View childView = mAbsListView.getChildAt(i);
-            if (mAbsListView.getPositionForView(childView) == position) {
+            if (mAbsListView.getPositionForView(childView) == position && childView.getTag() instanceof ViewHolder) {
                 found = true;
                 toggle(((ViewHolder) childView.getTag()).contentParent);
             }
