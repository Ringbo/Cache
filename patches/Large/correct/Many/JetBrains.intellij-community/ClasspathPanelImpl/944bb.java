diff --git a/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/classpath/ClasspathPanelImpl.java b/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/classpath/ClasspathPanelImpl.java
index e335653..2936d24 100644
--- a/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/classpath/ClasspathPanelImpl.java
+++ b/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/classpath/ClasspathPanelImpl.java
@@ -819,7 +819,7 @@
           for (DependenciesBuilder builder : builders) {
             for (Set<PsiFile> files : builder.getDependencies().values()) {
               if (!files.isEmpty()) {
-                Messages.showInfoMessage(myEntryTable,
+                Messages.showInfoMessage(myProject,
                                          "Dependencies were successfully collected in \"" +
                                          ToolWindowId.DEPENDENCIES + "\" toolwindow",
                                          FindBundle.message("find.pointcut.applications.not.found.title"));
@@ -827,7 +827,7 @@
               }
             }
           }
-          if (Messages.showOkCancelDialog(myEntryTable,
+          if (Messages.showOkCancelDialog(myProject,
                                           "No code dependencies were found. Would you like to remove the dependency?",
                                           CommonBundle.getWarningTitle(), Messages.getWarningIcon()) == Messages.OK) {
             removeSelectedItems(TableUtil.removeSelectedItems(myEntryTable));
