diff --git a/DesktopFilters/src/org/gephi/desktop/filters/query/QueryNode.java b/DesktopFilters/src/org/gephi/desktop/filters/query/QueryNode.java
index a860816..c4807a9 100644
--- a/DesktopFilters/src/org/gephi/desktop/filters/query/QueryNode.java
+++ b/DesktopFilters/src/org/gephi/desktop/filters/query/QueryNode.java
@@ -53,7 +53,7 @@
     }
 
     private boolean isSelected() {
-        return FiltersTopComponent.findInstance().getUiModel().getSelectedQuery() == query;
+        return FiltersTopComponent.findInstance().getUiModel().getSelectedRoot() == query;
     }
 
 
