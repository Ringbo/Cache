diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/bugs/ObjectEqualsNullInspection.java b/plugins/InspectionGadgets/src/com/siyeh/ig/bugs/ObjectEqualsNullInspection.java
index 9ddef06..fdbaa82 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/bugs/ObjectEqualsNullInspection.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/bugs/ObjectEqualsNullInspection.java
@@ -61,7 +61,7 @@
             }
             final PsiExpressionList argumentList = call.getArgumentList();
             final PsiExpression[] args = argumentList.getExpressions();
-            if (args.length == 0 || ExpressionUtils.isNullLiteral(args[0])) {
+            if (args.length == 0 || !ExpressionUtils.isNullLiteral(args[0])) {
                 return;
             }
             registerError(args[0]);
