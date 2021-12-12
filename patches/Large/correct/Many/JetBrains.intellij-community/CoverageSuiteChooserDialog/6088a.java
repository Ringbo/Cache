diff --git a/plugins/coverage-common/src/com/intellij/coverage/actions/CoverageSuiteChooserDialog.java b/plugins/coverage-common/src/com/intellij/coverage/actions/CoverageSuiteChooserDialog.java
index 84166aa..487f44a 100644
--- a/plugins/coverage-common/src/com/intellij/coverage/actions/CoverageSuiteChooserDialog.java
+++ b/plugins/coverage-common/src/com/intellij/coverage/actions/CoverageSuiteChooserDialog.java
@@ -274,12 +274,12 @@
     @Override
     public void actionPerformed(AnActionEvent e) {
       final VirtualFile file =
-        FileChooser.chooseFile(myProject, new FileChooserDescriptor(true, false, false, false, false, false) {
+        FileChooser.chooseFile(new FileChooserDescriptor(true, false, false, false, false, false) {
           @Override
           public boolean isFileSelectable(VirtualFile file) {
             return getCoverageRunner(file) != null;
           }
-        });
+        }, myProject, null);
       if (file != null) {
         final CoverageRunner coverageRunner = getCoverageRunner(file);
         LOG.assertTrue(coverageRunner != null);
