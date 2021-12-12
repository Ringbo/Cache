diff --git a/java/java-impl/src/com/intellij/refactoring/util/LambdaRefactoringUtil.java b/java/java-impl/src/com/intellij/refactoring/util/LambdaRefactoringUtil.java
index 21437d9..a1e84d3 100644
--- a/java/java-impl/src/com/intellij/refactoring/util/LambdaRefactoringUtil.java
+++ b/java/java-impl/src/com/intellij/refactoring/util/LambdaRefactoringUtil.java
@@ -315,7 +315,7 @@
     for (int i = 0; i < parameters.length; i++) {
       PsiType psiType = substitutor.substitute(parameters[i].getType());
       if (psiType == null) return null;
-      if (!PsiTypesUtil.isDenotableType(psiType, interfaceMethod)) {
+      if (!PsiTypesUtil.isDenotableType(psiType, lambdaExpression)) {
         return null;
       }
 
