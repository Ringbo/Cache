diff --git a/source/com/intellij/refactoring/move/moveInstanceMethod/MoveInstanceMethodHandler.java b/source/com/intellij/refactoring/move/moveInstanceMethod/MoveInstanceMethodHandler.java
index caa3ca5..2fadbb2 100644
--- a/source/com/intellij/refactoring/move/moveInstanceMethod/MoveInstanceMethodHandler.java
+++ b/source/com/intellij/refactoring/move/moveInstanceMethod/MoveInstanceMethodHandler.java
@@ -77,10 +77,10 @@
     for (Iterator<PsiVariable> iterator = allVariables.iterator(); iterator.hasNext();) {
       PsiVariable variable = iterator.next();
       final PsiType type = variable.getType();
-      if (type instanceof PsiClassType) {
+      if (type instanceof PsiClassType && !((PsiClassType)type).hasParameters()) {
         classTypesFound = true;
         final PsiClass psiClass = ((PsiClassType)type).resolve();
-        if (psiClass != null) {
+        if (psiClass != null && !(psiClass instanceof PsiTypeParameter)) {
           resolvableClassesFound = true;
           final boolean inProject = method.getManager().isInProject(psiClass);
           if (inProject) {
