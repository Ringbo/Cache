diff --git a/platform/lang-impl/src/com/intellij/codeInspection/ui/ProblemDescriptionNode.java b/platform/lang-impl/src/com/intellij/codeInspection/ui/ProblemDescriptionNode.java
index 5271650..24ee057 100644
--- a/platform/lang-impl/src/com/intellij/codeInspection/ui/ProblemDescriptionNode.java
+++ b/platform/lang-impl/src/com/intellij/codeInspection/ui/ProblemDescriptionNode.java
@@ -132,7 +132,7 @@
       final TextRange elementRange = psiElement.getTextRange();
       if (textRange!=null && elementRange!=null) {
         textRange = textRange.shiftRight(-elementRange.getStartOffset());
-        if(textRange.getStartOffset() >= 0 && textRange.getEndOffset() < ref.length())
+        if(textRange.getStartOffset() >= 0 && textRange.getEndOffset() <= ref.length())
           ref = textRange.substring(ref);
       }
     }
