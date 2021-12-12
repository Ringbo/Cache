diff --git a/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/com/siyeh/ig/psiutils/ExpectedTypeUtils.java b/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/com/siyeh/ig/psiutils/ExpectedTypeUtils.java
index 3ceca68..ad5ecc2 100644
--- a/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/com/siyeh/ig/psiutils/ExpectedTypeUtils.java
+++ b/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/com/siyeh/ig/psiutils/ExpectedTypeUtils.java
@@ -196,7 +196,7 @@
         }
       }
       else if (ComparisonUtils.isComparisonOperation(tokenType)) {
-        if (operands.length > 2) {
+        if (operands.length != 2) {
           expectedType = null;
           return;
         }
