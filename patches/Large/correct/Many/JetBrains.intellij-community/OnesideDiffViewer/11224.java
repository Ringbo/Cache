diff --git a/platform/diff-impl/src/com/intellij/diff/tools/fragmented/OnesideDiffViewer.java b/platform/diff-impl/src/com/intellij/diff/tools/fragmented/OnesideDiffViewer.java
index b752a01..4d33882 100644
--- a/platform/diff-impl/src/com/intellij/diff/tools/fragmented/OnesideDiffViewer.java
+++ b/platform/diff-impl/src/com/intellij/diff/tools/fragmented/OnesideDiffViewer.java
@@ -215,7 +215,7 @@
                                                                data.getRangeHighlighter(), content.getContentType(),
                                                                convertor.createConvertor1(), null);
 
-        return apply(editorData, blocks, convertor, Collections.<IntPair>emptyList(), false);
+        return apply(editorData, blocks, convertor, Collections.singletonList(new IntPair(0, data.getLines())), false);
       }
 
       if (myActualContent2 == null) {
@@ -241,7 +241,7 @@
                                                                data.getRangeHighlighter(), content.getContentType(),
                                                                convertor.createConvertor2(), null);
 
-        return apply(editorData, blocks, convertor, Collections.<IntPair>emptyList(), false);
+        return apply(editorData, blocks, convertor, Collections.singletonList(new IntPair(0, data.getLines())), false);
       }
 
       final DocumentContent content1 = myActualContent1;
