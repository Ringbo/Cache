diff --git a/java/java-psi-impl/src/com/intellij/codeInsight/folding/impl/JavaFoldingBuilderBase.java b/java/java-psi-impl/src/com/intellij/codeInsight/folding/impl/JavaFoldingBuilderBase.java
index ad9b385..a157f08 100644
--- a/java/java-psi-impl/src/com/intellij/codeInsight/folding/impl/JavaFoldingBuilderBase.java
+++ b/java/java-psi-impl/src/com/intellij/codeInsight/folding/impl/JavaFoldingBuilderBase.java
@@ -690,12 +690,12 @@
       }
 
       @Override
-      public void visitLocalVariable(PsiLocalVariable variable) {
+      public void visitVariable(PsiVariable variable) {
         if (!dumb && JavaCodeFoldingSettings.getInstance().isReplaceVarWithInferredType()) {
           addLocalVariableTypeFolding(list, variable, quick);
         }
 
-        super.visitLocalVariable(variable);
+        super.visitVariable(variable);
       }
 
       @Override
