diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/psiutils/IteratorUtils.java b/plugins/InspectionGadgets/src/com/siyeh/ig/psiutils/IteratorUtils.java
index 7ca1cf7..edc1da4 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/psiutils/IteratorUtils.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/psiutils/IteratorUtils.java
@@ -116,7 +116,7 @@
                     final PsiReferenceExpression referenceExpression =
                             (PsiReferenceExpression) qualifier;
                     final PsiElement element = referenceExpression.resolve();
-                    if (!target.equals(element)) {
+                    if (target == null || !target.equals(element)) {
                         return;
                     }
                 }
