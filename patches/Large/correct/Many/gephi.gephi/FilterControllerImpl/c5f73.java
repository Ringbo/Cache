diff --git a/DesktopFilters/src/org/gephi/filters/impl/FilterControllerImpl.java b/DesktopFilters/src/org/gephi/filters/impl/FilterControllerImpl.java
index 8c3122b..ad4678c 100644
--- a/DesktopFilters/src/org/gephi/filters/impl/FilterControllerImpl.java
+++ b/DesktopFilters/src/org/gephi/filters/impl/FilterControllerImpl.java
@@ -93,7 +93,7 @@
 
             public void disable() {
                 GraphModel graphModel = Lookup.getDefault().lookup(GraphController.class).getModel();
-                if (model.getCurrentResult() != null) {
+                if (model.getCurrentResult() != null && graphModel != null) {
                     graphModel.destroyView(model.getCurrentResult());
                     model.setCurrentResult(null);
                 }
