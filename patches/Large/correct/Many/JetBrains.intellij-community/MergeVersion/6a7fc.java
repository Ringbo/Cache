diff --git a/platform/platform-impl/src/com/intellij/openapi/diff/impl/mergeTool/MergeVersion.java b/platform/platform-impl/src/com/intellij/openapi/diff/impl/mergeTool/MergeVersion.java
index 83685e3..a6c976b 100644
--- a/platform/platform-impl/src/com/intellij/openapi/diff/impl/mergeTool/MergeVersion.java
+++ b/platform/platform-impl/src/com/intellij/openapi/diff/impl/mergeTool/MergeVersion.java
@@ -104,7 +104,7 @@
     }
 
     public static void reportProjectFileChangeIfNeeded(Project project, VirtualFile file) {
-      if (file != null) {
+      if (file != null && ! file.isDirectory()) {
         if (ProjectUtil.isProjectOrWorkspaceFile(file) || isProjectFile(file)) {
           ProjectManagerEx.getInstanceEx().saveChangedProjectFile(file, project);
         }
@@ -115,7 +115,7 @@
     public static Runnable prepareToReportChangedProjectFiles(final Project project, final Collection<VirtualFile> files) {
       final Set<VirtualFile> vfs = new HashSet<VirtualFile>();
       for (VirtualFile vf : files) {
-        if (vf != null) {
+        if (vf != null && ! vf.isDirectory()) {
           if (ProjectUtil.isProjectOrWorkspaceFile(vf) || isProjectFile(vf)) {
             vfs.add(vf);
           }
