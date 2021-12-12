diff --git a/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/com/siyeh/ig/psiutils/SwitchUtils.java b/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/com/siyeh/ig/psiutils/SwitchUtils.java
index d9e06ed..d268d54 100644
--- a/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/com/siyeh/ig/psiutils/SwitchUtils.java
+++ b/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/com/siyeh/ig/psiutils/SwitchUtils.java
@@ -144,7 +144,7 @@
    * If switch body has no labels yet and language level permits, rule-based format is assumed.
    */
   public static boolean isRuleFormatSwitch(@NotNull PsiSwitchBlock block) {
-    if (HighlightUtil.Feature.ENHANCED_SWITCH.isAvailable(block)) {
+    if (!HighlightUtil.Feature.ENHANCED_SWITCH.isAvailable(block)) {
       return false;
     }
     PsiSwitchLabelStatementBase label = PsiTreeUtil.getChildOfType(block.getBody(), PsiSwitchLabelStatementBase.class);
