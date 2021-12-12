diff --git a/library/src/com/haarman/listviewanimations/itemmanipulation/contextualundo/ContextualUndoAdapter.java b/library/src/com/haarman/listviewanimations/itemmanipulation/contextualundo/ContextualUndoAdapter.java
index 8eb3472..f9bae17 100644
--- a/library/src/com/haarman/listviewanimations/itemmanipulation/contextualundo/ContextualUndoAdapter.java
+++ b/library/src/com/haarman/listviewanimations/itemmanipulation/contextualundo/ContextualUndoAdapter.java
@@ -137,7 +137,7 @@
 			contextualUndoView.findViewById(mUndoActionId).setOnClickListener(new UndoListener(contextualUndoView));
 		}
 
-		View contentView = super.getView(position, contextualUndoView.getContentView(), parent);
+		View contentView = super.getView(position, contextualUndoView.getContentView(), contextualUndoView);
 		contextualUndoView.updateContentView(contentView);
 
 		long itemId = getItemId(position);
