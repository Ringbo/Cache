diff --git a/source/com/intellij/codeInsight/highlighting/BraceHighlighter.java b/source/com/intellij/codeInsight/highlighting/BraceHighlighter.java
index 87e6df2..3d645ad 100644
--- a/source/com/intellij/codeInsight/highlighting/BraceHighlighter.java
+++ b/source/com/intellij/codeInsight/highlighting/BraceHighlighter.java
@@ -103,7 +103,7 @@
   private void updateBraces(final Editor editor) {
     ApplicationManager.getApplication().invokeLater(new Runnable() {
         public void run() {
-          if (!myIsDisposed && editor.getComponent().isShowing()) {
+          if (!myIsDisposed && editor.getComponent().isShowing() && !editor.isViewer()) {
             new BraceHighlightingHandler(myProject, editor, myAlarm).updateBraces();
           }
         }
