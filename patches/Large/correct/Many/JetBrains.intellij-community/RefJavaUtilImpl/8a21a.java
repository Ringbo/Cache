diff --git a/java/java-analysis-impl/src/com/intellij/codeInspection/reference/RefJavaUtilImpl.java b/java/java-analysis-impl/src/com/intellij/codeInspection/reference/RefJavaUtilImpl.java
index 0a09a49..982cf20 100644
--- a/java/java-analysis-impl/src/com/intellij/codeInspection/reference/RefJavaUtilImpl.java
+++ b/java/java-analysis-impl/src/com/intellij/codeInspection/reference/RefJavaUtilImpl.java
@@ -667,7 +667,7 @@
     UElement parent = skipParenthesises(expression);
     return !(parent instanceof UBinaryExpression) ||
            !(((UBinaryExpression)parent).getOperator() instanceof UastBinaryOperator.AssignOperator) ||
-           UastUtils.isChildOf(((UBinaryExpression)parent).getRightOperand(), expression, false);
+           UastUtils.isUastChildOf(((UBinaryExpression)parent).getRightOperand(), expression, false);
   }
 
   private static boolean isOnAssignmentLeftHand(@NotNull UElement expression) {
@@ -675,7 +675,7 @@
     if (parent == null) return false;
     return parent instanceof UBinaryExpression
            && ((UBinaryExpression)parent).getOperator() instanceof UastBinaryOperator.AssignOperator
-           && UastUtils.isChildOf(expression, ((UBinaryExpression)parent).getLeftOperand(), false);
+           && UastUtils.isUastChildOf(expression, ((UBinaryExpression)parent).getLeftOperand(), false);
   }
 
   private static UElement skipParenthesises(@NotNull UElement expression) {
