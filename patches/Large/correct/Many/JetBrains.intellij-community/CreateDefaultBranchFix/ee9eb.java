diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/fixes/CreateDefaultBranchFix.java b/plugins/InspectionGadgets/src/com/siyeh/ig/fixes/CreateDefaultBranchFix.java
index f8ef26b..574a277 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/fixes/CreateDefaultBranchFix.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/fixes/CreateDefaultBranchFix.java
@@ -104,7 +104,7 @@
       throw new IncorrectOperationException("Incorrect file template", (Throwable)e);
     }
     PsiStatement stripped = ControlFlowUtils.stripBraces(statement);
-    if (!isRuleBasedFormat || stripped instanceof PsiThrowStatement) {
+    if (!isRuleBasedFormat || stripped instanceof PsiThrowStatement || stripped instanceof PsiExpressionStatement) {
       statement = stripped;
     }
     if (isRuleBasedFormat) {
