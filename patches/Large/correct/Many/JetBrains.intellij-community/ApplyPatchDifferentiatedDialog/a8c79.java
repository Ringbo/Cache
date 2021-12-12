diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/patch/ApplyPatchDifferentiatedDialog.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/patch/ApplyPatchDifferentiatedDialog.java
index 342951fe..a648156 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/patch/ApplyPatchDifferentiatedDialog.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/patch/ApplyPatchDifferentiatedDialog.java
@@ -1226,7 +1226,7 @@
             Change change = myChanges.get(i);
             FilePath filePath = ChangesUtil.getFilePath(change);
             FileStatus fileStatus = change.getFileStatus();
-            nodesData.add(new TreeModelBuilder.GenericNodeData(filePath, fileStatus, myIndex));
+            nodesData.add(new TreeModelBuilder.GenericNodeData(filePath, fileStatus, i));
           }
 
           TreeModelBuilder builder = new TreeModelBuilder(project, showFlatten);
