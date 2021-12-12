diff --git a/java/debugger/impl/src/com/intellij/debugger/engine/PositionManagerImpl.java b/java/debugger/impl/src/com/intellij/debugger/engine/PositionManagerImpl.java
index 1042389..c827fea 100644
--- a/java/debugger/impl/src/com/intellij/debugger/engine/PositionManagerImpl.java
+++ b/java/debugger/impl/src/com/intellij/debugger/engine/PositionManagerImpl.java
@@ -261,7 +261,7 @@
           PsiFile file = original.getFile();
           int line = original.getLine();
           if (LambdaMethodFilter.isLambdaName(myExpectedMethodName) && myLambdaOrdinal > -1) {
-            List<PsiLambdaExpression> lambdas = DebuggerUtilsEx.collectLambdas(original, false);
+            List<PsiLambdaExpression> lambdas = DebuggerUtilsEx.collectLambdas(original, true);
 
             Document document = PsiDocumentManager.getInstance(file.getProject()).getDocument(file);
             if (document == null || line >= document.getLineCount()) {
