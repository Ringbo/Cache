diff --git a/modules/FiltersImpl/src/main/java/org/gephi/filters/FilterControllerImpl.java b/modules/FiltersImpl/src/main/java/org/gephi/filters/FilterControllerImpl.java
index 1a1038b..00e1caa 100644
--- a/modules/FiltersImpl/src/main/java/org/gephi/filters/FilterControllerImpl.java
+++ b/modules/FiltersImpl/src/main/java/org/gephi/filters/FilterControllerImpl.java
@@ -273,7 +273,7 @@
         HierarchicalGraph result;
         if (model.getCurrentQuery() == query) {
             GraphView view = model.getCurrentResult();
-            if (view != null) {
+            if (view == null) {
                 return;
             }
             result = model.getGraphModel().getHierarchicalGraph(view);
