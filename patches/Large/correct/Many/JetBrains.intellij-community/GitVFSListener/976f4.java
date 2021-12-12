diff --git a/plugins/git4idea/src/git4idea/vfs/GitVFSListener.java b/plugins/git4idea/src/git4idea/vfs/GitVFSListener.java
index 964d184..5a3d743 100644
--- a/plugins/git4idea/src/git4idea/vfs/GitVFSListener.java
+++ b/plugins/git4idea/src/git4idea/vfs/GitVFSListener.java
@@ -218,7 +218,7 @@
           try {
             final VirtualFile root = e.getKey();
             indicator.setText(root.getPresentableUrl());
-            GitFileUtils.delete(myProject, root, e.getValue());
+            GitFileUtils.delete(myProject, root, e.getValue(), "--ignore-unmatch");
             GitUtil.markFilesDirty(myProject, e.getValue());
           }
           catch (final VcsException ex) {
