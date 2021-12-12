diff --git a/compiler/frontend/src/org/jetbrains/kotlin/types/expressions/BasicExpressionTypingVisitor.java b/compiler/frontend/src/org/jetbrains/kotlin/types/expressions/BasicExpressionTypingVisitor.java
index 01c7578..fa96a94 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/types/expressions/BasicExpressionTypingVisitor.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/types/expressions/BasicExpressionTypingVisitor.java
@@ -943,7 +943,7 @@
             @NotNull BindingTrace trace,
             @NotNull ExpressionTypingContext context,
             @NotNull JetExpression expression,
-            @NotNull JetExpression rightHandSide
+            @Nullable JetExpression rightHandSide
     ) {
         return checkLValue(trace, context, expression, rightHandSide, false);
     }
@@ -952,14 +952,14 @@
             @NotNull BindingTrace trace,
             @NotNull ExpressionTypingContext context,
             @NotNull JetExpression expressionWithParenthesis,
-            @NotNull JetExpression rightHandSide,
+            @Nullable JetExpression rightHandSide,
             boolean canBeThis
     ) {
         JetExpression expression = JetPsiUtil.deparenthesize(expressionWithParenthesis);
         if (expression instanceof JetArrayAccessExpression) {
             JetArrayAccessExpression arrayAccessExpression = (JetArrayAccessExpression) expression;
             JetExpression arrayExpression = arrayAccessExpression.getArrayExpression();
-            if (arrayExpression == null) return false;
+            if (arrayExpression == null || rightHandSide == null) return false;
 
             TemporaryBindingTrace ignoreReportsTrace = TemporaryBindingTrace.create(trace, "Trace for checking set function");
             ExpressionTypingContext findSetterContext = context.replaceBindingTrace(ignoreReportsTrace);
