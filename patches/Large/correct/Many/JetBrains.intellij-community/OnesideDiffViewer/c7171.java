diff --git a/platform/diff-impl/src/com/intellij/diff/tools/fragmented/OnesideDiffViewer.java b/platform/diff-impl/src/com/intellij/diff/tools/fragmented/OnesideDiffViewer.java
index 74bd891..bf19d8e 100644
--- a/platform/diff-impl/src/com/intellij/diff/tools/fragmented/OnesideDiffViewer.java
+++ b/platform/diff-impl/src/com/intellij/diff/tools/fragmented/OnesideDiffViewer.java
@@ -214,7 +214,7 @@
         blocks.add(ChangedBlock.createInserted(data.getText().length() + 1, data.getLines()));
 
         indicator.checkCanceled();
-        LineNumberConvertor convertor = LineNumberConvertor.Builder.createLeft(data.getLines());
+        LineNumberConvertor convertor = LineNumberConvertor.Builder.createRight(data.getLines());
 
         CombinedEditorData editorData = new CombinedEditorData(new MergingCharSequence(data.getText(), "\n"), data.getHighlighter(),
                                                                data.getRangeHighlighter(), content.getContentType(),
@@ -240,7 +240,7 @@
         blocks.add(ChangedBlock.createDeleted(data.getText().length() + 1, data.getLines()));
 
         indicator.checkCanceled();
-        LineNumberConvertor convertor = LineNumberConvertor.Builder.createRight(data.getLines());
+        LineNumberConvertor convertor = LineNumberConvertor.Builder.createLeft(data.getLines());
 
         CombinedEditorData editorData = new CombinedEditorData(new MergingCharSequence(data.getText(), "\n"), data.getHighlighter(),
                                                                data.getRangeHighlighter(), content.getContentType(),
