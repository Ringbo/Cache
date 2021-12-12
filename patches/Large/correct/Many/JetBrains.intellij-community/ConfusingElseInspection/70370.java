diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/controlflow/ConfusingElseInspection.java b/plugins/InspectionGadgets/src/com/siyeh/ig/controlflow/ConfusingElseInspection.java
index cc96ede..0c85a16 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/controlflow/ConfusingElseInspection.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/controlflow/ConfusingElseInspection.java
@@ -147,7 +147,7 @@
             if (ControlFlowUtils.statementMayCompleteNormally(thenBranch)) {
                 return;
             }
-            if (reportWhenNoStatementFollow) {
+            if (!reportWhenNoStatementFollow) {
                 final PsiStatement nextStatement = getNextStatement(statement);
                 if (nextStatement == null) {
                     return;
