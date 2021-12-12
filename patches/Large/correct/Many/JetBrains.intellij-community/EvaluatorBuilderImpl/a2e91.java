diff --git a/java/debugger/impl/src/com/intellij/debugger/engine/evaluation/expression/EvaluatorBuilderImpl.java b/java/debugger/impl/src/com/intellij/debugger/engine/evaluation/expression/EvaluatorBuilderImpl.java
index ae6252e..be293f4 100644
--- a/java/debugger/impl/src/com/intellij/debugger/engine/evaluation/expression/EvaluatorBuilderImpl.java
+++ b/java/debugger/impl/src/com/intellij/debugger/engine/evaluation/expression/EvaluatorBuilderImpl.java
@@ -398,7 +398,7 @@
     }
 
     private static boolean isBinaryNumericPromotionApplicable(PsiType lType, PsiType rType, IElementType opType) {
-      if (lType == null && rType == null) {
+      if (lType == null || rType == null) {
         return false;
       }
       if (opType == JavaTokenType.EQEQ || opType == JavaTokenType.NE) {
