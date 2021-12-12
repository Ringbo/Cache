diff --git a/compiler/frontend.java/src/org/jetbrains/jet/lang/resolve/java/JavaDescriptorResolver.java b/compiler/frontend.java/src/org/jetbrains/jet/lang/resolve/java/JavaDescriptorResolver.java
index fc59149..67bb062 100644
--- a/compiler/frontend.java/src/org/jetbrains/jet/lang/resolve/java/JavaDescriptorResolver.java
+++ b/compiler/frontend.java/src/org/jetbrains/jet/lang/resolve/java/JavaDescriptorResolver.java
@@ -168,7 +168,7 @@
     private DeclarationDescriptor resolveParentDescriptor(PsiClass psiClass) {
         PsiClass containingClass = psiClass.getContainingClass();
         if (containingClass != null) {
-            return resolveClass(psiClass);
+            return resolveClass(containingClass);
         }
         
         PsiJavaFile containingFile = (PsiJavaFile) psiClass.getContainingFile();
