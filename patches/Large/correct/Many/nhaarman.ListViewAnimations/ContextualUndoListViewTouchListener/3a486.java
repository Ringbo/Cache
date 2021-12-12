diff --git a/library/src/com/haarman/listviewanimations/itemmanipulation/contextualundo/ContextualUndoListViewTouchListener.java b/library/src/com/haarman/listviewanimations/itemmanipulation/contextualundo/ContextualUndoListViewTouchListener.java
index e0ee08c..1f7b0a6 100644
--- a/library/src/com/haarman/listviewanimations/itemmanipulation/contextualundo/ContextualUndoListViewTouchListener.java
+++ b/library/src/com/haarman/listviewanimations/itemmanipulation/contextualundo/ContextualUndoListViewTouchListener.java
@@ -124,7 +124,7 @@
                     }
                 }
 
-                if (mDownView != null) {
+                if (mDownView != null && mDownView instanceof ContextualUndoView) {
                     mDownX = motionEvent.getRawX();
                     mDownPosition = mListView.getPositionForView(mDownView);
 
