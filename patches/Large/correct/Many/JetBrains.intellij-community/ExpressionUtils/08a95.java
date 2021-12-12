diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/psiutils/ExpressionUtils.java b/plugins/InspectionGadgets/src/com/siyeh/ig/psiutils/ExpressionUtils.java
index 62f13b7..e8787fa 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/psiutils/ExpressionUtils.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/psiutils/ExpressionUtils.java
@@ -173,7 +173,7 @@
     }
     final PsiTypeCastExpression typeCastExpression = (PsiTypeCastExpression)expression;
     final PsiExpression operand = ParenthesesUtils.stripParentheses(typeCastExpression.getOperand());
-    if (!(operand instanceof PsiTypeCastExpression)) {
+    if (!(operand instanceof PsiLiteralExpression)) {
       return null;
     }
     return (PsiLiteralExpression)operand;
