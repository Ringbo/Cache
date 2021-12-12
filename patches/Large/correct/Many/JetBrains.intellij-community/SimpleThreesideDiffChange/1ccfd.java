diff --git a/platform/diff-impl/src/com/intellij/diff/tools/simple/SimpleThreesideDiffChange.java b/platform/diff-impl/src/com/intellij/diff/tools/simple/SimpleThreesideDiffChange.java
index 7ba78c6..61264c5 100644
--- a/platform/diff-impl/src/com/intellij/diff/tools/simple/SimpleThreesideDiffChange.java
+++ b/platform/diff-impl/src/com/intellij/diff/tools/simple/SimpleThreesideDiffChange.java
@@ -79,7 +79,7 @@
 
     TextRange range = DiffUtil.getLinesRange(editor.getDocument(), startLine, endLine, true);
     int start = range.getStartOffset();
-    int end = range.getStartOffset();
+    int end = range.getEndOffset();
 
     myHighlighters.addAll(DiffDrawUtil.createHighlighter(editor, start, end, type, hasInner));
     myHighlighters.addAll(DiffDrawUtil.createLineMarker(editor, startLine, endLine, type, false));
