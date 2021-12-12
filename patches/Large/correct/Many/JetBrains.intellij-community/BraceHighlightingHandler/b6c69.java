diff --git a/platform/lang-impl/src/com/intellij/codeInsight/highlighting/BraceHighlightingHandler.java b/platform/lang-impl/src/com/intellij/codeInsight/highlighting/BraceHighlightingHandler.java
index f9e18cc..043c0a7 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/highlighting/BraceHighlightingHandler.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/highlighting/BraceHighlightingHandler.java
@@ -472,7 +472,7 @@
     if (lBrace != null && rBrace !=null) {
       final int startLine = myEditor.offsetToLogicalPosition(lBrace.getStartOffset()).line;
       final int endLine = myEditor.offsetToLogicalPosition(rBrace.getEndOffset()).line;
-      if (endLine - startLine > 0) {
+      if (endLine - startLine >= 0) {
         final Runnable runnable = () -> {
           if (myProject.isDisposed() || myEditor.isDisposed()) return;
           Color color = attributes.getBackgroundColor();
