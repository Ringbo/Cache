diff --git a/codeInsight/impl/com/intellij/codeInsight/template/impl/TemplateState.java b/codeInsight/impl/com/intellij/codeInsight/template/impl/TemplateState.java
index aa2bf55..65e2058 100644
--- a/codeInsight/impl/com/intellij/codeInsight/template/impl/TemplateState.java
+++ b/codeInsight/impl/com/intellij/codeInsight/template/impl/TemplateState.java
@@ -158,7 +158,7 @@
     int start = mySegments.getSegmentStart(segmentNumber);
     int end = mySegments.getSegmentEnd(segmentNumber);
     int length = myDocument.getTextLength();
-    if (start >= length || end > length) {
+    if (start > length || end > length) {
       return null;
     }
     return new TextResult(text.subSequence(start, end).toString());
