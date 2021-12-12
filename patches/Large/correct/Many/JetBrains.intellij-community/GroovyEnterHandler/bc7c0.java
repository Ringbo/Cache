diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/editor/actions/GroovyEnterHandler.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/editor/actions/GroovyEnterHandler.java
index a420bec..55ca6e2 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/editor/actions/GroovyEnterHandler.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/editor/actions/GroovyEnterHandler.java
@@ -101,7 +101,7 @@
     if (text == null || text.length() == 0)
       return false;
     final EditorHighlighter highlighter = ((EditorEx) editor).getHighlighter();
-    if (caret < 1 || caret > text.length() - 2) {
+    if (caret < 1 || caret > text.length() - 1) {
       return false;
     }
     HighlighterIterator iterator = highlighter.createIterator(caret - 1);
