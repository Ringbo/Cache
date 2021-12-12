diff --git a/java/java-impl/src/com/intellij/psi/impl/JavaPsiImplementationHelperImpl.java b/java/java-impl/src/com/intellij/psi/impl/JavaPsiImplementationHelperImpl.java
index 17ddcf8..a99f11a 100644
--- a/java/java-impl/src/com/intellij/psi/impl/JavaPsiImplementationHelperImpl.java
+++ b/java/java-impl/src/com/intellij/psi/impl/JavaPsiImplementationHelperImpl.java
@@ -67,7 +67,7 @@
   @Override
   public PsiClass getOriginalClass(PsiClass psiClass) {
     PsiCompiledElement cls = psiClass.getUserData(ClsElementImpl.COMPILED_ELEMENT);
-    if (cls != null) return (PsiClass)cls;
+    if (cls != null && cls.isValid()) return (PsiClass)cls;
 
     VirtualFile vFile = psiClass.getContainingFile().getVirtualFile();
     final Project project = psiClass.getProject();
