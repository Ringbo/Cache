diff --git a/java/java-psi-impl/src/com/intellij/psi/impl/PsiClassImplUtil.java b/java/java-psi-impl/src/com/intellij/psi/impl/PsiClassImplUtil.java
index af330da..a5cd507 100644
--- a/java/java-psi-impl/src/com/intellij/psi/impl/PsiClassImplUtil.java
+++ b/java/java-psi-impl/src/com/intellij/psi/impl/PsiClassImplUtil.java
@@ -489,7 +489,7 @@
       }
     }
     if (classHint == null || classHint.shouldProcess(ElementClassHint.DeclarationKind.CLASS)) {
-      if (last != null && last.getParent() == aClass) {
+      if (last != null && last.getContext() == aClass) {
         if (last instanceof PsiClass) {
           if (!processor.execute(last, state)) return false;
         }
@@ -632,7 +632,7 @@
     }
 
     if (classHint == null || classHint.shouldProcess(ElementClassHint.DeclarationKind.CLASS)) {
-      if (last != null && last.getParent() == aClass) {
+      if (last != null && last.getContext() == aClass) {
         // Parameters
         final PsiTypeParameterList list = aClass.getTypeParameterList();
         if (list != null && !list.processDeclarations(processor, ResolveState.initial(), last, place)) return false;
