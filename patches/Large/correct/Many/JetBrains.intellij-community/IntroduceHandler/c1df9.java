diff --git a/python/src/com/jetbrains/python/refactoring/introduce/IntroduceHandler.java b/python/src/com/jetbrains/python/refactoring/introduce/IntroduceHandler.java
index b27ffc5..10d007b 100644
--- a/python/src/com/jetbrains/python/refactoring/introduce/IntroduceHandler.java
+++ b/python/src/com/jetbrains/python/refactoring/introduce/IntroduceHandler.java
@@ -181,7 +181,7 @@
           addDeclaration(data.first, declaration, occurrences, replaceAll, initInConstructor);
         }
 
-        PyExpressionStatement newExpression = createExpression(project, name, declaration);
+        PyExpression newExpression = createExpression(project, name, declaration).getExpression();
 
         if (replaceAll) {
           for (PsiElement occurrence : occurrences) {
