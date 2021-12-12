diff --git a/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnRecursiveStatusWalker.java b/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnRecursiveStatusWalker.java
index cc79715..02c00aa 100644
--- a/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnRecursiveStatusWalker.java
+++ b/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnRecursiveStatusWalker.java
@@ -143,7 +143,7 @@
   }
 
   private void handleStatusException(@NotNull MyItem item, @NotNull SvnBindException e) throws SvnBindException {
-    if (e.contains(SVNErrorCode.WC_NOT_DIRECTORY) || e.contains(SVNErrorCode.WC_NOT_FILE)) {
+    if (e.contains(SVNErrorCode.WC_NOT_DIRECTORY) || e.contains(SVNErrorCode.WC_NOT_FILE) || e.contains(SVNErrorCode.WC_PATH_NOT_FOUND)) {
       final VirtualFile virtualFile = item.getPath().getVirtualFile();
       if (virtualFile != null && !isIgnoredByVcs(virtualFile)) {
         // self is unversioned
