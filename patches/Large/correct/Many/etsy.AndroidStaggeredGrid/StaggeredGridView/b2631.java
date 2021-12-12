diff --git a/library/src/main/java/com/etsy/android/grid/StaggeredGridView.java b/library/src/main/java/com/etsy/android/grid/StaggeredGridView.java
index 4794988..000826b 100644
--- a/library/src/main/java/com/etsy/android/grid/StaggeredGridView.java
+++ b/library/src/main/java/com/etsy/android/grid/StaggeredGridView.java
@@ -777,7 +777,8 @@
             final View child = getChildAt(i);
             if (child != null) {
                 final LayoutParams childParams = (LayoutParams) child.getLayoutParams();
-                if (childParams.viewType != ITEM_VIEW_TYPE_HEADER_OR_FOOTER) {
+                if (childParams.viewType != ITEM_VIEW_TYPE_HEADER_OR_FOOTER &&
+                        childParams instanceof GridLayoutParams) {
                     GridLayoutParams layoutParams = (GridLayoutParams) childParams;
                     int column = layoutParams.column;
                     int position = layoutParams.position;
