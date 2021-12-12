diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/ui/ChangesBrowserChangeNode.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/ui/ChangesBrowserChangeNode.java
index 734fcc6..ccd89ed 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/ui/ChangesBrowserChangeNode.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/ui/ChangesBrowserChangeNode.java
@@ -106,7 +106,7 @@
 
   private void appendSwitched(final ChangesBrowserNodeRenderer renderer) {
     final VirtualFile virtualFile = ChangesUtil.getFilePath(getUserObject()).getVirtualFile();
-    if (virtualFile != null) {
+    if (virtualFile != null && ! myProject.isDefault()) {
       String branch = ChangeListManager.getInstance(myProject).getSwitchedBranch(virtualFile);
       if (branch != null) {
         renderer.append(" [switched to " + branch + "]", SimpleTextAttributes.REGULAR_ATTRIBUTES);
