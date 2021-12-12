diff --git a/platform/lang-impl/src/com/intellij/codeInspection/offlineViewer/OfflineInspectionRVContentProvider.java b/platform/lang-impl/src/com/intellij/codeInspection/offlineViewer/OfflineInspectionRVContentProvider.java
index ef66066..00f4ea6 100644
--- a/platform/lang-impl/src/com/intellij/codeInspection/offlineViewer/OfflineInspectionRVContentProvider.java
+++ b/platform/lang-impl/src/com/intellij/codeInspection/offlineViewer/OfflineInspectionRVContentProvider.java
@@ -71,7 +71,7 @@
       TreeUtil.traverseDepth((TreeNode)selectionPath.getLastPathComponent(), node -> {
         if (!((InspectionTreeNode)node).isValid()) return true;
         if (node instanceof OfflineProblemDescriptorNode) {
-          if (!((OfflineProblemDescriptorNode)node).isQuickFixAppliedFromView()) return true;
+          if (((OfflineProblemDescriptorNode)node).isQuickFixAppliedFromView()) return true;
           final OfflineProblemDescriptorNode descriptorNode = (OfflineProblemDescriptorNode)node;
           final RefEntity element = descriptorNode.getElement();
           selectedElements.add(element);
