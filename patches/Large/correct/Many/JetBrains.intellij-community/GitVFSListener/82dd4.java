diff --git a/plugins/git4idea/src/git4idea/vfs/GitVFSListener.java b/plugins/git4idea/src/git4idea/vfs/GitVFSListener.java
index 779d40b..b6b7963 100644
--- a/plugins/git4idea/src/git4idea/vfs/GitVFSListener.java
+++ b/plugins/git4idea/src/git4idea/vfs/GitVFSListener.java
@@ -180,7 +180,7 @@
       HashSet<File> filesToRefresh = new HashSet<>();
 
       public void execute(@NotNull VirtualFile root, @NotNull List<FilePath> files) throws VcsException {
-        GitFileUtils.delete(myProject, root, files, "--ignore-unmatch");
+        GitFileUtils.delete(myProject, root, files, "--ignore-unmatch", "--cached");
         if (!myProject.isDisposed()) {
           VcsFileUtil.markFilesDirty(myProject, files);
         }
