diff --git a/platform/diff-impl/src/com/intellij/diff/merge/TextMergeChange.java b/platform/diff-impl/src/com/intellij/diff/merge/TextMergeChange.java
index a096ccb..f850bbb 100644
--- a/platform/diff-impl/src/com/intellij/diff/merge/TextMergeChange.java
+++ b/platform/diff-impl/src/com/intellij/diff/merge/TextMergeChange.java
@@ -144,7 +144,7 @@
 
     TextRange range = DiffUtil.getLinesRange(editor.getDocument(), startLine, endLine, true);
     int start = range.getStartOffset();
-    int end = range.getStartOffset();
+    int end = range.getEndOffset();
 
     boolean ignored = !resolved && myInnerFragments != null;
     myHighlighters.addAll(DiffDrawUtil.createHighlighter(editor, start, end, type, ignored, HighlighterTargetArea.EXACT_RANGE, resolved));
