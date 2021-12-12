diff --git a/src/com/goide/psi/impl/GoVarProcessor.java b/src/com/goide/psi/impl/GoVarProcessor.java
index 52fd540..9f3559e 100644
--- a/src/com/goide/psi/impl/GoVarProcessor.java
+++ b/src/com/goide/psi/impl/GoVarProcessor.java
@@ -26,7 +26,7 @@
 
   @Override
   public boolean execute(@NotNull PsiElement psiElement, ResolveState resolveState) {
-    if (psiElement instanceof GoFunctionDeclaration) return false;
+    if (psiElement instanceof GoFunctionOrMethodDeclaration) return false;
     if (!(psiElement instanceof GoNamedElement)) return true;
     if (!(psiElement instanceof GoVarDefinition) &&
         !(psiElement instanceof GoParamDefinition) &&
