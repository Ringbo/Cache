diff --git a/codeInsight/impl/com/intellij/codeInsight/template/macro/ExpectedTypeMacro.java b/codeInsight/impl/com/intellij/codeInsight/template/macro/ExpectedTypeMacro.java
index 7d092d1..91ecba3 100644
--- a/codeInsight/impl/com/intellij/codeInsight/template/macro/ExpectedTypeMacro.java
+++ b/codeInsight/impl/com/intellij/codeInsight/template/macro/ExpectedTypeMacro.java
@@ -75,7 +75,7 @@
     PsiElement element = fileCopy.findElementAt(offset);
 
     if (element instanceof PsiIdentifier && element.getParent() instanceof PsiExpression) {
-      ExpectedTypeInfo[] infos = ExpectedTypesProvider.getInstance(project).getExpectedTypes((PsiExpression)element.getParent(), false);
+      ExpectedTypeInfo[] infos = ExpectedTypesProvider.getInstance(project).getExpectedTypes((PsiExpression)element.getParent(), true);
       if (infos.length > 0){
         types = new PsiType[infos.length];
         for(int i = 0; i < infos.length; i++) {
