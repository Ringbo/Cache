diff --git a/source/com/intellij/openapi/fileChooser/ex/FileSystemTreeImpl.java b/source/com/intellij/openapi/fileChooser/ex/FileSystemTreeImpl.java
index caa0116..e1323f3 100644
--- a/source/com/intellij/openapi/fileChooser/ex/FileSystemTreeImpl.java
+++ b/source/com/intellij/openapi/fileChooser/ex/FileSystemTreeImpl.java
@@ -176,7 +176,7 @@
   private void addTreeExpansionListener() {
     myTree.addTreeExpansionListener(new TreeExpansionListener() {
       public void treeExpanded(final TreeExpansionEvent event) {
-        if (myTreeBuilder.isNodeBeingBuilt(event.getPath())) return;
+        if (myTreeBuilder == null || myTreeBuilder.isNodeBeingBuilt(event.getPath())) return;
 
         ApplicationManager.getApplication().runWriteAction(new Runnable() {
           public void run() {
