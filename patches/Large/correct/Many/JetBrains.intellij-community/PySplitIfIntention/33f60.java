diff --git a/python/src/com/jetbrains/python/codeInsight/intentions/PySplitIfIntention.java b/python/src/com/jetbrains/python/codeInsight/intentions/PySplitIfIntention.java
index ed9b7ce..f5437e0 100644
--- a/python/src/com/jetbrains/python/codeInsight/intentions/PySplitIfIntention.java
+++ b/python/src/com/jetbrains/python/codeInsight/intentions/PySplitIfIntention.java
@@ -27,7 +27,7 @@
 
   public boolean isAvailable(@NotNull Project project, Editor editor, PsiFile file) {
     PsiElement elementAtOffset = file.findElementAt(editor.getCaretModel().getOffset());
-    if (elementAtOffset == null) {
+    if (elementAtOffset == null || elementAtOffset.getNode() == null) {
       return false;
     }
 
