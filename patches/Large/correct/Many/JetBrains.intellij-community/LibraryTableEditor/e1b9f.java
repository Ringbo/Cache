diff --git a/source/com/intellij/openapi/roots/ui/configuration/libraryEditor/LibraryTableEditor.java b/source/com/intellij/openapi/roots/ui/configuration/libraryEditor/LibraryTableEditor.java
index e01431b..a8e682f 100644
--- a/source/com/intellij/openapi/roots/ui/configuration/libraryEditor/LibraryTableEditor.java
+++ b/source/com/intellij/openapi/roots/ui/configuration/libraryEditor/LibraryTableEditor.java
@@ -207,7 +207,7 @@
 
   public void selectLibrary(Library library, boolean expand) {
     LibraryTableTreeContentElement element = new LibraryElement(library, this, false);
-    myTreeBuilder.buildNodeForElement(element);
+    myTreeBuilder.updateFromRoot();
     DefaultMutableTreeNode node = myTreeBuilder.getNodeForElement(element);
     if (node == null) {
       return;
