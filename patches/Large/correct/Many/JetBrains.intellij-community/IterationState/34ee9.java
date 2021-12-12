diff --git a/source/com/intellij/openapi/editor/impl/IterationState.java b/source/com/intellij/openapi/editor/impl/IterationState.java
index 57a2ebc..41f44e8 100644
--- a/source/com/intellij/openapi/editor/impl/IterationState.java
+++ b/source/com/intellij/openapi/editor/impl/IterationState.java
@@ -501,7 +501,8 @@
         return caret;
       }
 
-      if (highlighter.getTargetArea() != HighlighterTargetArea.LINES_IN_RANGE) continue;
+      if (highlighter.getTargetArea() != HighlighterTargetArea.LINES_IN_RANGE
+        || myDocument.getLineNumber(highlighter.getEndOffset()) < myDocument.getLineCount() - 1) continue;
 
       TextAttributes textAttributes = highlighter.getTextAttributes();
       if (textAttributes != null) {
