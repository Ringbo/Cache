diff --git a/modules/DesktopAppearance/src/main/java/org/gephi/desktop/appearance/AppearanceUIController.java b/modules/DesktopAppearance/src/main/java/org/gephi/desktop/appearance/AppearanceUIController.java
index 1af0f26..ead44e3 100644
--- a/modules/DesktopAppearance/src/main/java/org/gephi/desktop/appearance/AppearanceUIController.java
+++ b/modules/DesktopAppearance/src/main/java/org/gephi/desktop/appearance/AppearanceUIController.java
@@ -383,7 +383,7 @@
         public GraphChangeObserver(Graph graph, Column column) {
             timer = new Timer("GraphChangeObserver", true);
             graphObserver = graph.getModel().createGraphObserver(graph, false);
-            columnObserver = column != null ? column.createColumnObserver() : null;
+            columnObserver = column != null ? column.createColumnObserver(false) : null;
         }
 
         @Override
