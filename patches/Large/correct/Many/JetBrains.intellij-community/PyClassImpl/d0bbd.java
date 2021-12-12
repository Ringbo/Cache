diff --git a/python/src/com/jetbrains/python/psi/impl/PyClassImpl.java b/python/src/com/jetbrains/python/psi/impl/PyClassImpl.java
index 443ae06..7482b90 100644
--- a/python/src/com/jetbrains/python/psi/impl/PyClassImpl.java
+++ b/python/src/com/jetbrains/python/psi/impl/PyClassImpl.java
@@ -231,7 +231,7 @@
   @NotNull
   @Override
   public List<PyClass> getAncestorClasses() {
-    return getAncestorClasses(TypeEvalContext.codeInsightFallback(getProject()));
+    return getAncestorClasses(TypeEvalContext.codeAnalysis(getProject(), getContainingFile()));
   }
 
   @NotNull
@@ -1223,7 +1223,8 @@
     }
     final PyClassStub stub = getStub();
     final List<PyClassLikeType> result = new ArrayList<PyClassLikeType>();
-    if (stub != null) {
+    // In some cases stub may not provide all information, so we use stubs only if AST access id disabled
+    if (!context.maySwitchToAST(this) && stub != null) {
       final PsiFile file = getContainingFile();
       if (file instanceof PyFile) {
         for (QualifiedName name : stub.getSuperClasses()) {
