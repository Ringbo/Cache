diff --git a/platform/lang-impl/src/com/intellij/codeInspection/ui/InspectionResultsView.java b/platform/lang-impl/src/com/intellij/codeInspection/ui/InspectionResultsView.java
index 9b294a7..a49be38 100644
--- a/platform/lang-impl/src/com/intellij/codeInspection/ui/InspectionResultsView.java
+++ b/platform/lang-impl/src/com/intellij/codeInspection/ui/InspectionResultsView.java
@@ -398,10 +398,10 @@
           final ProblemDescriptionNode problemNode = (ProblemDescriptionNode)node;
           showInRightPanel(problemNode.getElement());
         }
-        else if (node instanceof InspectionNode) {
+        else if (node instanceof InspectionNode || node instanceof InspectionPackageNode || node instanceof InspectionModuleNode) {
           showInRightPanel(null);
         }
-        else if (node instanceof InspectionRootNode || node instanceof InspectionGroupNode) {
+        else if (node instanceof InspectionRootNode || node instanceof InspectionGroupNode || node instanceof InspectionSeverityGroupNode) {
           mySplitter.setSecondComponent(new InspectionViewNavigationPanel(node, myTree));
         }
         else {
