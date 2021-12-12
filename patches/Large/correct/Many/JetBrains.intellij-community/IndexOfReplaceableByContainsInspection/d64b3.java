diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/jdk15/IndexOfReplaceableByContainsInspection.java b/plugins/InspectionGadgets/src/com/siyeh/ig/jdk15/IndexOfReplaceableByContainsInspection.java
index 37e87e0..2dbad89 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/jdk15/IndexOfReplaceableByContainsInspection.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/jdk15/IndexOfReplaceableByContainsInspection.java
@@ -160,12 +160,12 @@
             if (lhs instanceof PsiMethodCallExpression) {
                 final PsiJavaToken sign = expression.getOperationSign();
                 if (canBeReplacedByContains(lhs, sign, rhs, false)) {
-                    registerError(expression);
+                    registerError(expression, expression);
                 }
             } else if (rhs instanceof PsiMethodCallExpression) {
                 final PsiJavaToken sign = expression.getOperationSign();
                 if (canBeReplacedByContains(rhs, sign, lhs, true)) {
-                    registerError(expression);
+                    registerError(expression, expression);
                 }
             }
         }
