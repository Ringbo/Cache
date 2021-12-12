diff --git a/library/src/com/squareup/timessquare/CalendarCellView.java b/library/src/com/squareup/timessquare/CalendarCellView.java
index 6373cdc..f49dc85 100644
--- a/library/src/com/squareup/timessquare/CalendarCellView.java
+++ b/library/src/com/squareup/timessquare/CalendarCellView.java
@@ -77,7 +77,7 @@
   }
 
   @Override protected int[] onCreateDrawableState(int extraSpace) {
-    final int[] drawableState = super.onCreateDrawableState(extraSpace + 4);
+    final int[] drawableState = super.onCreateDrawableState(extraSpace + 6);
 
     if (isSelectable) {
       mergeDrawableStates(drawableState, STATE_SELECTABLE);
