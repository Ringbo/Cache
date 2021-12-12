diff --git a/source/com/intellij/ide/structureView/newStructureView/StructureViewComponent.java b/source/com/intellij/ide/structureView/newStructureView/StructureViewComponent.java
index fb73ae2..ea31b9f 100644
--- a/source/com/intellij/ide/structureView/newStructureView/StructureViewComponent.java
+++ b/source/com/intellij/ide/structureView/newStructureView/StructureViewComponent.java
@@ -208,7 +208,7 @@
       myStructureViewState = null;
     }
     else {
-      TreeUtil.expand(getTree(), 3);
+      TreeUtil.expand(getTree(), 2);
     }
   }
 
@@ -316,7 +316,7 @@
     pathToElement.remove(0);
     DefaultMutableTreeNode result = null;
     while (currentTreeNode != null) {
-      AbstractTreeNode topPathElement = null;
+      AbstractTreeNode topPathElement;
       if (!pathToElement.isEmpty()) {
         topPathElement = pathToElement.get(0);
         pathToElement.remove(0);
