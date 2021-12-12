diff --git a/LayoutAPI/src/org/gephi/layout/LayoutControllerImpl.java b/LayoutAPI/src/org/gephi/layout/LayoutControllerImpl.java
index 0e6a444..1e79af1 100644
--- a/LayoutAPI/src/org/gephi/layout/LayoutControllerImpl.java
+++ b/LayoutAPI/src/org/gephi/layout/LayoutControllerImpl.java
@@ -60,7 +60,7 @@
             }
 
             public void unselect(Workspace workspace) {
-                if (model.getSelectedLayout() != null) {
+                if (model != null && model.getSelectedLayout() != null) {
                     model.saveProperties(model.getSelectedLayout());
                 }
             }
