diff --git a/source/com/intellij/internal/psiView/PsiViewerDialog.java b/source/com/intellij/internal/psiView/PsiViewerDialog.java
index 6717e8e..125138a 100644
--- a/source/com/intellij/internal/psiView/PsiViewerDialog.java
+++ b/source/com/intellij/internal/psiView/PsiViewerDialog.java
@@ -327,7 +327,7 @@
           }
 
           final int textLength = myEditor.getDocument().getTextLength();
-          if (end < textLength) {
+          if (end <= textLength) {
             myHighlighter = myEditor.getMarkupModel().addRangeHighlighter(start, end, HighlighterLayer.FIRST + 1, myAttributes, HighlighterTargetArea.EXACT_RANGE);
           }
         }
