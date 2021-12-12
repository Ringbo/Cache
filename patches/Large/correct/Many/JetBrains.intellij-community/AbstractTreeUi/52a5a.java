diff --git a/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java b/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java
index ab2f242..1dbcc78 100644
--- a/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java
+++ b/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java
@@ -1027,7 +1027,7 @@
 
     if (currentElements.size() > 0 && elements.length == currentElements.size()) {
       boolean runSelection = false;
-      for (Object eachToSelect : currentElements) {
+      for (Object eachToSelect : elements) {
         if (!currentElements.contains(eachToSelect)) {
           runSelection = true;
           break;
