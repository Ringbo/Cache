diff --git a/source/com/intellij/codeInsight/actions/ReformatCodeAction.java b/source/com/intellij/codeInsight/actions/ReformatCodeAction.java
index 986d4db..050a1f9 100644
--- a/source/com/intellij/codeInsight/actions/ReformatCodeAction.java
+++ b/source/com/intellij/codeInsight/actions/ReformatCodeAction.java
@@ -120,7 +120,7 @@
     Editor editor = (Editor)dataContext.getData(DataConstants.EDITOR);
     if (editor != null){
       PsiFile file = PsiDocumentManager.getInstance(project).getPsiFile(editor.getDocument());
-      if (file == null) {
+      if (file == null || file.getVirtualFile() == null) {
         presentation.setEnabled(false);
         return;
       }
@@ -143,7 +143,7 @@
       }
       if (!(element instanceof PsiDirectory)){
         PsiFile file = element.getContainingFile();
-        if (file == null || (!(file instanceof PsiJavaFile) && !(file instanceof XmlFile)) || (file.getVirtualFile() == null)){
+        if (file == null || (!(file instanceof PsiJavaFile) && !(file instanceof XmlFile))){
           presentation.setEnabled(false);
           return;
         }
