diff --git a/codeInsight/impl/com/intellij/codeInsight/generation/surroundWith/JavaWithRunnableSurrounder.java b/codeInsight/impl/com/intellij/codeInsight/generation/surroundWith/JavaWithRunnableSurrounder.java
index c765711..d630d7c 100644
--- a/codeInsight/impl/com/intellij/codeInsight/generation/surroundWith/JavaWithRunnableSurrounder.java
+++ b/codeInsight/impl/com/intellij/codeInsight/generation/surroundWith/JavaWithRunnableSurrounder.java
@@ -17,7 +17,7 @@
 
 import java.util.Collection;
 
-class JavaWithRunnableSurrounder extends JavaStatementsSurrounder{
+public class JavaWithRunnableSurrounder extends JavaStatementsSurrounder{
   public String getTemplateDescription() {
     return CodeInsightBundle.message("surround.with.runnable.template");
   }
@@ -92,7 +92,7 @@
       return false;
     }
     final Collection<PsiReference> references = ReferencesSearch.search(variable, new LocalSearchScope(scope)).findAll();
-    boolean foundOnce = (variable.getInitializer() != null);
+    boolean foundOnce = (variable instanceof PsiParameter) || (variable.getInitializer() != null);
     for (PsiReference reference : references) {
       if (reference instanceof PsiReferenceExpression) {
         if (PsiUtil.isAccessedForWriting((PsiReferenceExpression) reference)) {
