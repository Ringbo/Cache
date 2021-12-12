diff --git a/source/com/intellij/refactoring/convertToInstanceMethod/ConvertToInstanceMethodHandler.java b/source/com/intellij/refactoring/convertToInstanceMethod/ConvertToInstanceMethodHandler.java
index 3cf4af6..c10853f 100644
--- a/source/com/intellij/refactoring/convertToInstanceMethod/ConvertToInstanceMethodHandler.java
+++ b/source/com/intellij/refactoring/convertToInstanceMethod/ConvertToInstanceMethodHandler.java
@@ -60,10 +60,10 @@
     for (int i = 0; i < parameters.length; i++) {
       final PsiParameter parameter = parameters[i];
       final PsiType type = parameter.getType();
-      if (type instanceof PsiClassType) {
+      if (type instanceof PsiClassType && !((PsiClassType)type).hasParameters()) {
         classTypesFound = true;
         final PsiClass psiClass = ((PsiClassType)type).resolve();
-        if (psiClass != null) {
+        if (psiClass != null && !(psiClass instanceof PsiTypeParameter)) {
           resolvableClassesFound = true;
           final boolean inProject = method.getManager().isInProject(psiClass);
           if (inProject) {
