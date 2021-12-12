diff --git a/source/com/intellij/openapi/fileChooser/ex/FileChooserDialogImpl.java b/source/com/intellij/openapi/fileChooser/ex/FileChooserDialogImpl.java
index 474524b..f5d1a24 100644
--- a/source/com/intellij/openapi/fileChooser/ex/FileChooserDialogImpl.java
+++ b/source/com/intellij/openapi/fileChooser/ex/FileChooserDialogImpl.java
@@ -322,7 +322,7 @@
         Object userObject = node.getUserObject();
         if (userObject instanceof FileNodeDescriptor) {
           final VirtualFile file = ((FileNodeDescriptor)userObject).getElement().getFile();
-          if (file != null) {
+          if (file != null && file.isDirectory()) {
             final String rootPath = file.getPath();
             if (myRequests.get(rootPath) == null) {
               toAdd.add(rootPath);
