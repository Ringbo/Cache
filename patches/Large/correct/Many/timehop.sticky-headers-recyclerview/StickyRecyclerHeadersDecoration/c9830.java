diff --git a/library/src/main/java/com/timehop/stickyheadersrecyclerview/StickyRecyclerHeadersDecoration.java b/library/src/main/java/com/timehop/stickyheadersrecyclerview/StickyRecyclerHeadersDecoration.java
index cbebff2..c43e851 100644
--- a/library/src/main/java/com/timehop/stickyheadersrecyclerview/StickyRecyclerHeadersDecoration.java
+++ b/library/src/main/java/com/timehop/stickyheadersrecyclerview/StickyRecyclerHeadersDecoration.java
@@ -39,7 +39,7 @@
     int orientation = getOrientation(parent);
     mHeaderRects.clear();
 
-    if (parent.getChildCount() > 0) {
+    if (parent.getChildCount() > 0 && mAdapter.getItemCount() > 0) {
       View firstView = parent.getChildAt(0);
       // draw the first visible child's header at the top of the view
       int firstPosition = parent.getChildPosition(firstView);
