diff --git a/ide/che-core-ide-ui/src/main/java/org/eclipse/che/ide/ui/smartTree/Tree.java b/ide/che-core-ide-ui/src/main/java/org/eclipse/che/ide/ui/smartTree/Tree.java
index 51d4904..52768c2 100644
--- a/ide/che-core-ide-ui/src/main/java/org/eclipse/che/ide/ui/smartTree/Tree.java
+++ b/ide/che-core-ide-ui/src/main/java/org/eclipse/che/ide/ui/smartTree/Tree.java
@@ -1000,7 +1000,7 @@
 
   /** Enable searching @see {@link SpeedSearch#SpeedSearch(Tree, String, NodeConverter, boolean)} */
   public void enableSpeedSearch(boolean filterElements) {
-    speedSearch = new SpeedSearch(this, treeStyles.styles().searchMatch(), null, filterElements);
+    speedSearch = new SpeedSearch(this, treeStyles.treeStylesCss().searchMatch(), null, filterElements);
   }
 
   /** Close searching pop-up enabled by {@link #enableSpeedSearch(boolean)}. */
