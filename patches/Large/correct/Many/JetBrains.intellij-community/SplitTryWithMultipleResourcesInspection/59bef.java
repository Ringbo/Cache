diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/exceptions/SplitTryWithMultipleResourcesInspection.java b/plugins/InspectionGadgets/src/com/siyeh/ig/exceptions/SplitTryWithMultipleResourcesInspection.java
index 750017f..42fd00d 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/exceptions/SplitTryWithMultipleResourcesInspection.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/exceptions/SplitTryWithMultipleResourcesInspection.java
@@ -60,7 +60,7 @@
   private static void doFixImpl(@NotNull PsiElement element) throws IncorrectOperationException {
     final PsiTryStatement tryStatement = (PsiTryStatement)element.getParent();
     final PsiResourceList resourceList = tryStatement.getResourceList();
-    if (resourceList == null) {
+    if (resourceList == null || resourceList.getResourceVariablesCount() <= 1) {
       return;
     }
     final StringBuilder newTryStatementText = new StringBuilder();
