diff --git a/src/com/mobeta/android/dslv/DragSortListView.java b/src/com/mobeta/android/dslv/DragSortListView.java
index 75e8bd8..81ce772 100644
--- a/src/com/mobeta/android/dslv/DragSortListView.java
+++ b/src/com/mobeta/android/dslv/DragSortListView.java
@@ -488,7 +488,7 @@
 					visItemTop += mItemHeightCollapsed + divHeight;
 				}
 
-				if (position < mSrcDragPos && position >= mExpDragPos) {
+				if (position <= mSrcDragPos && position > mExpDragPos) {
 					visItemPos = position + 1;
 				} else {
 					visItemPos = position;
