diff --git a/java/java-impl/src/com/intellij/codeInsight/lookup/VariableLookupItem.java b/java/java-impl/src/com/intellij/codeInsight/lookup/VariableLookupItem.java
index 5cbe750..d1d6691 100644
--- a/java/java-impl/src/com/intellij/codeInsight/lookup/VariableLookupItem.java
+++ b/java/java-impl/src/com/intellij/codeInsight/lookup/VariableLookupItem.java
@@ -57,7 +57,7 @@
 
   private static Color getExpressionColor(@Nullable PsiExpression expression) {
     if (expression instanceof PsiReferenceExpression) {
-      PsiElement target = ((PsiReferenceExpression)expression).resolve();
+      final PsiElement target = ((PsiReferenceExpression)expression).resolve();
       if (target instanceof PsiVariable) {
         return RecursionManager.doPreventingRecursion(expression, true, new Computable<Color>() {
           @Override
