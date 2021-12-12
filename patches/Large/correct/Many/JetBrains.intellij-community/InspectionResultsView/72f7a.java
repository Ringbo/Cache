diff --git a/platform/lang-impl/src/com/intellij/codeInspection/ui/InspectionResultsView.java b/platform/lang-impl/src/com/intellij/codeInspection/ui/InspectionResultsView.java
index 88365a7..c8e77bc 100644
--- a/platform/lang-impl/src/com/intellij/codeInspection/ui/InspectionResultsView.java
+++ b/platform/lang-impl/src/com/intellij/codeInspection/ui/InspectionResultsView.java
@@ -627,7 +627,7 @@
         severityGroupNode = ConcurrencyUtil.cacheOrGet(mySeverityGroupNodes, level, newNode);
         if (severityGroupNode == newNode) {
           InspectionTreeNode root = myTree.getRoot();
-          insertByIndex(root, severityGroupNode);
+          insertByIndex(severityGroupNode, root);
         }
       }
       return severityGroupNode;
