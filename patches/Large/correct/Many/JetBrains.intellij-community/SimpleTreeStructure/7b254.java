diff --git a/treeStructure/src/com/intellij/ui/treeStructure/SimpleTreeStructure.java b/treeStructure/src/com/intellij/ui/treeStructure/SimpleTreeStructure.java
index 0e1b324..b61defe 100644
--- a/treeStructure/src/com/intellij/ui/treeStructure/SimpleTreeStructure.java
+++ b/treeStructure/src/com/intellij/ui/treeStructure/SimpleTreeStructure.java
@@ -26,7 +26,7 @@
   public void commit() {
   }
 
-  public final boolean hasSomethingToCommit() {
+  public boolean hasSomethingToCommit() {
     return false;
   }
 
