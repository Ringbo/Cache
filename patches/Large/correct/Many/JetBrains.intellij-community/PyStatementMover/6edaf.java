diff --git a/python/src/com/jetbrains/python/codeInsight/editorActions/moveUpDown/PyStatementMover.java b/python/src/com/jetbrains/python/codeInsight/editorActions/moveUpDown/PyStatementMover.java
index d24a294..b3264a6 100644
--- a/python/src/com/jetbrains/python/codeInsight/editorActions/moveUpDown/PyStatementMover.java
+++ b/python/src/com/jetbrains/python/codeInsight/editorActions/moveUpDown/PyStatementMover.java
@@ -501,7 +501,7 @@
       }
     }
     else {
-      if (startElement != endElement) {
+      if (startElement != endElement && nextSibling != null) {
         scope.addRangeAfter(nextSibling, endElement, anchor);
       }
       addedElement = scope.addAfter(startElement, anchor);
