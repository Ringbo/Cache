diff --git a/python/src/com/jetbrains/python/inspections/quickfix/StatementEffectFunctionCallQuickFix.java b/python/src/com/jetbrains/python/inspections/quickfix/StatementEffectFunctionCallQuickFix.java
index 85ba704..512d809 100644
--- a/python/src/com/jetbrains/python/inspections/quickfix/StatementEffectFunctionCallQuickFix.java
+++ b/python/src/com/jetbrains/python/inspections/quickfix/StatementEffectFunctionCallQuickFix.java
@@ -42,7 +42,7 @@
   private static void replacePrint(PsiElement expression, PyElementGenerator elementGenerator) {
     StringBuilder stringBuilder = new StringBuilder("print (");
 
-    PsiElement whiteSpace = expression.getParent().getNextSibling();
+    PsiElement whiteSpace = expression.getContainingFile().findElementAt(expression.getTextOffset() + expression.getTextLength());
     PsiElement next = null;
     if (whiteSpace instanceof PsiWhiteSpace) {
       if (!whiteSpace.getText().contains("\n"))
