diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/controlflow/UnnecessaryDefaultInspection.java b/plugins/InspectionGadgets/src/com/siyeh/ig/controlflow/UnnecessaryDefaultInspection.java
index 028ed7d..756e545 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/controlflow/UnnecessaryDefaultInspection.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/controlflow/UnnecessaryDefaultInspection.java
@@ -58,7 +58,8 @@
             while (nextStatement != null &&
                     !(nextStatement instanceof PsiBreakStatement) &&
                     !(nextStatement instanceof PsiSwitchLabelStatement)) {
-                if (isStatementNeededForInitializationOfVariable(statement,
+                if (nextStatement instanceof PsiThrowStatement ||
+                        isStatementNeededForInitializationOfVariable(statement,
                         nextStatement)) {
                     return;
                 }
