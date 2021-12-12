diff --git a/platform/lang-impl/src/com/intellij/ide/favoritesTreeView/FavoritesPanel.java b/platform/lang-impl/src/com/intellij/ide/favoritesTreeView/FavoritesPanel.java
index ced0a9c..76fff16 100644
--- a/platform/lang-impl/src/com/intellij/ide/favoritesTreeView/FavoritesPanel.java
+++ b/platform/lang-impl/src/com/intellij/ide/favoritesTreeView/FavoritesPanel.java
@@ -72,7 +72,7 @@
   }
 
   private void setupDnD() {
-    DnDSupport.createBuilder(myTree)
+    DnDSupport.createBuilder(myViewPanel)
       .setBeanProvider(new Function<DnDActionInfo, DnDDragStartBean>() {
         @Override
         public DnDDragStartBean fun(DnDActionInfo dnDActionInfo) {
@@ -82,11 +82,10 @@
       .setTargetChecker(new DnDTargetChecker() {
         @Override
         public boolean update(DnDEvent event) {
-          final Point p = event.getPoint();
-
+          final Point p = SwingUtilities.convertPoint(myViewPanel, event.getPoint(), myTree);
           FavoritesListNode node = findFavoritesListNode(p);
           if (node != null) {
-            TreePath pathToList = myTree.getPathForLocation(p.x, p.y);
+            TreePath pathToList = myTree.getPath(node);
             while (pathToList != null) {
               final Object pathObj = pathToList.getLastPathComponent();
               if (pathObj instanceof DefaultMutableTreeNode) {
@@ -144,6 +143,6 @@
         }
       }
     }
-    return null;
+    return (FavoritesListNode)((FavoritesRootNode)myTreeStructure.getRootElement()).getChildren().iterator().next();
   }
 }
