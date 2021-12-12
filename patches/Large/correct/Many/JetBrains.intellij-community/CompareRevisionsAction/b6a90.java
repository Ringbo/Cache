diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/history/actions/CompareRevisionsAction.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/history/actions/CompareRevisionsAction.java
index f2a1bbb..a59f725 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/history/actions/CompareRevisionsAction.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/history/actions/CompareRevisionsAction.java
@@ -35,7 +35,7 @@
     DiffFromHistoryHandler diffHandler = customDiffHandler == null ? new StandardDiffFromHistoryHandler() : customDiffHandler;
 
     if (revisions.length == 2) {
-      diffHandler.showDiffForTwo(e.getRequiredData(CommonDataKeys.PROJECT), filePath, revisions[0], revisions[1]);
+      diffHandler.showDiffForTwo(e.getRequiredData(CommonDataKeys.PROJECT), filePath, revisions[1], revisions[0]);
     }
     else if (revisions.length == 1) {
       VcsFileRevision previousRevision = e.getRequiredData(FileHistoryPanelImpl.PREVIOUS_REVISION_FOR_DIFF);
