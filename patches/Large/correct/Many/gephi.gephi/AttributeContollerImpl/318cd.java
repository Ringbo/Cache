diff --git a/AttributesImpl/src/org/gephi/data/attributes/AttributeContollerImpl.java b/AttributesImpl/src/org/gephi/data/attributes/AttributeContollerImpl.java
index fe994e0..bee36ea 100644
--- a/AttributesImpl/src/org/gephi/data/attributes/AttributeContollerImpl.java
+++ b/AttributesImpl/src/org/gephi/data/attributes/AttributeContollerImpl.java
@@ -94,7 +94,7 @@
         }
     }
 
-    public AttributeModel getModel() {
+    public synchronized AttributeModel getModel() {
         Workspace workspace = projectController.getCurrentWorkspace();
         if (workspace != null) {
             AttributeModel model = workspace.getLookup().lookup(AttributeModel.class);
@@ -108,7 +108,7 @@
         return null;
     }
 
-    public AttributeModel getModel(Workspace workspace) {
+    public synchronized AttributeModel getModel(Workspace workspace) {
         AttributeModel model = workspace.getLookup().lookup(AttributeModel.class);
         if (model != null) {
             return model;
