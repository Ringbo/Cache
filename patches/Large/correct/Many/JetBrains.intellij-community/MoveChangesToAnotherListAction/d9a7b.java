diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/actions/MoveChangesToAnotherListAction.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/actions/MoveChangesToAnotherListAction.java
index c275657..34622a6 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/actions/MoveChangesToAnotherListAction.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/actions/MoveChangesToAnotherListAction.java
@@ -137,7 +137,7 @@
     List<VirtualFile> unversionedFiles = ContainerUtil.newArrayList();
     final List<VirtualFile> changedFiles = ContainerUtil.newArrayList();
     VirtualFile[] files = e.getData(CommonDataKeys.VIRTUAL_FILE_ARRAY);
-    if (files != null) {
+    if (files != null && changesList.isEmpty()) {
       changesList.addAll(getChangesForSelectedFiles(project, files, unversionedFiles, changedFiles));
     }
 
