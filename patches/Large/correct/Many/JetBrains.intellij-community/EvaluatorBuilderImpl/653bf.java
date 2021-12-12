diff --git a/java/debugger/impl/src/com/intellij/debugger/engine/evaluation/expression/EvaluatorBuilderImpl.java b/java/debugger/impl/src/com/intellij/debugger/engine/evaluation/expression/EvaluatorBuilderImpl.java
index a515089..dcb5b39 100644
--- a/java/debugger/impl/src/com/intellij/debugger/engine/evaluation/expression/EvaluatorBuilderImpl.java
+++ b/java/debugger/impl/src/com/intellij/debugger/engine/evaluation/expression/EvaluatorBuilderImpl.java
@@ -1553,7 +1553,8 @@
           break;
         }
         final PsiType actualArgType = actualArgumentExpressions[idx].getType();
-        if (TypeConversionUtil.boxingConversionApplicable(declaredParamType, actualArgType)) {
+        if (TypeConversionUtil.boxingConversionApplicable(declaredParamType, actualArgType) ||
+            (declaredParamType != null && actualArgType == null)) {
           final Evaluator argEval = argumentEvaluators[idx];
           argumentEvaluators[idx] = declaredParamType instanceof PsiPrimitiveType ? new UnBoxingEvaluator(argEval) : new BoxingEvaluator(argEval);
         }
