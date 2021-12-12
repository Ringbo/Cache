diff --git a/java/debugger/impl/src/com/intellij/debugger/engine/evaluation/expression/EvaluatorBuilderImpl.java b/java/debugger/impl/src/com/intellij/debugger/engine/evaluation/expression/EvaluatorBuilderImpl.java
index 04ec0eb..45af0e1 100644
--- a/java/debugger/impl/src/com/intellij/debugger/engine/evaluation/expression/EvaluatorBuilderImpl.java
+++ b/java/debugger/impl/src/com/intellij/debugger/engine/evaluation/expression/EvaluatorBuilderImpl.java
@@ -257,7 +257,7 @@
 
     @Nullable
     private Evaluator accept(@Nullable PsiElement element) {
-      if (element == null) {
+      if (element == null || element instanceof PsiEmptyStatement) {
         return null;
       }
       element.accept(this);
