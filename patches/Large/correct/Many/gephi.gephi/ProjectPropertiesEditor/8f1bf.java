diff --git a/ProjectUI/src/org/gephi/ui/project/ProjectPropertiesEditor.java b/ProjectUI/src/org/gephi/ui/project/ProjectPropertiesEditor.java
index e1270a8..a9301b4 100644
--- a/ProjectUI/src/org/gephi/ui/project/ProjectPropertiesEditor.java
+++ b/ProjectUI/src/org/gephi/ui/project/ProjectPropertiesEditor.java
@@ -58,14 +58,14 @@
     public void save(Project project) {
         ProjectInformation info = project.getLookup().lookup(ProjectInformation.class);
         if (info != null) {
-            if (!titleTextField.getText().isEmpty() && !titleTextField.getText().equals(info.getName())) {
+            if (!nameTextField.getText().isEmpty() && !nameTextField.getText().equals(info.getName())) {
                 ProjectController pc = Lookup.getDefault().lookup(ProjectController.class);
-                pc.renameProject(project, titleTextField.getText());
+                pc.renameProject(project, nameTextField.getText());
             }
         }
         ProjectMetaData metaData = project.getLookup().lookup(ProjectMetaData.class);
         if (metaData != null) {
-            metaData.setTitle(nameTextField.getText());
+            metaData.setTitle(titleTextField.getText());
 
             metaData.setAuthor(authorTextField.getText());
             metaData.setKeywords(keywordsTextField.getText());
