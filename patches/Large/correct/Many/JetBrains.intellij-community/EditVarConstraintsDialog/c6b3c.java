diff --git a/platform/structuralsearch/source/com/intellij/structuralsearch/plugin/ui/EditVarConstraintsDialog.java b/platform/structuralsearch/source/com/intellij/structuralsearch/plugin/ui/EditVarConstraintsDialog.java
index e7d9941..a1a9067 100644
--- a/platform/structuralsearch/source/com/intellij/structuralsearch/plugin/ui/EditVarConstraintsDialog.java
+++ b/platform/structuralsearch/source/com/intellij/structuralsearch/plugin/ui/EditVarConstraintsDialog.java
@@ -112,7 +112,7 @@
   private static Project myProject;
 
   EditVarConstraintsDialog(final Project project, Configuration configuration, List<Variable> _variables, final FileType fileType) {
-    super(project, false);
+    super(project, true);
 
     variables = _variables;
     myConfiguration = configuration;
@@ -169,7 +169,7 @@
 
     containedInConstraints.setVisible(false);
 
-    withinTextField.getButton().addActionListener(new ActionListener() {
+    withinTextField.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(@NotNull final ActionEvent e) {
         final SelectTemplateDialog dialog = new SelectTemplateDialog(project, false, false);
