diff --git a/source/com/intellij/ide/projectView/impl/FormMergerTreeStructureProvider.java b/source/com/intellij/ide/projectView/impl/FormMergerTreeStructureProvider.java
index 3e43fbf..8b73db2 100644
--- a/source/com/intellij/ide/projectView/impl/FormMergerTreeStructureProvider.java
+++ b/source/com/intellij/ide/projectView/impl/FormMergerTreeStructureProvider.java
@@ -28,12 +28,12 @@
     if (parent.getValue() instanceof Form) return children;
 
     // Optimization. Check if there are any forms at all.
-    boolean formsFound = true;
+    boolean formsFound = false;
     for (AbstractTreeNode node : children) {
       if (node.getValue() instanceof PsiFile) {
         PsiFile file = (PsiFile)node.getValue();
         if (file.getFileType() == StdFileTypes.GUI_DESIGNER_FORM) {
-          formsFound = false;
+          formsFound = true;
           break;
         }
       }
