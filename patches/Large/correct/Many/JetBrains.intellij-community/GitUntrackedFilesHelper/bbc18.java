diff --git a/plugins/git4idea/src/git4idea/util/GitUntrackedFilesHelper.java b/plugins/git4idea/src/git4idea/util/GitUntrackedFilesHelper.java
index 90f944e..83e5f87 100644
--- a/plugins/git4idea/src/git4idea/util/GitUntrackedFilesHelper.java
+++ b/plugins/git4idea/src/git4idea/util/GitUntrackedFilesHelper.java
@@ -132,7 +132,7 @@
       else {
         long validFiles = untrackedFiles.stream().filter(VirtualFile::isValid).count();
         LOG.debug(String.format("Untracked files: [%s]. Valid: %d (of %d)", untrackedFiles, validFiles, untrackedFiles.size()));
-        filesBrowser = ScrollPaneFactory.createScrollPane(new SelectFilesDialog.VirtualFileList(project, untrackedFiles, false, false));
+        filesBrowser = ScrollPaneFactory.createScrollPane(new SelectFilesDialog.VirtualFileList(project, untrackedFiles, false, true));
       }
       String title = "Could not " + StringUtil.capitalize(operationName);
       String description = StringUtil.stripHtml(createUntrackedFilesOverwrittenDescription(operationName, false), true);
