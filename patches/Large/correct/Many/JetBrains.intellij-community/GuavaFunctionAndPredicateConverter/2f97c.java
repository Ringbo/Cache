diff --git a/java/java-impl/src/com/intellij/codeInspection/java18StreamApi/GuavaFunctionAndPredicateConverter.java b/java/java-impl/src/com/intellij/codeInspection/java18StreamApi/GuavaFunctionAndPredicateConverter.java
index 50030a7..f6b14a0 100644
--- a/java/java-impl/src/com/intellij/codeInspection/java18StreamApi/GuavaFunctionAndPredicateConverter.java
+++ b/java/java-impl/src/com/intellij/codeInspection/java18StreamApi/GuavaFunctionAndPredicateConverter.java
@@ -56,7 +56,7 @@
     if (expression instanceof PsiNewExpression) {
       final PsiAnonymousClass anonymousClass = ((PsiNewExpression)expression).getAnonymousClass();
       if (anonymousClass != null && AnonymousCanBeLambdaInspection.canBeConvertedToLambda(anonymousClass, true)) {
-        final PsiExpression lambdaExpression = AnonymousCanBeLambdaInspection.replacePsiElementWithLambda(expression, true, true);
+        final PsiExpression lambdaExpression = AnonymousCanBeLambdaInspection.replacePsiElementWithLambda(expression, true, false);
         LOG.assertTrue(lambdaExpression != null);
         return lambdaExpression.getText();
       }
