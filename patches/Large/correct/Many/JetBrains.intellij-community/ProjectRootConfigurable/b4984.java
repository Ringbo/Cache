diff --git a/source/com/intellij/openapi/roots/ui/configuration/projectRoot/ProjectRootConfigurable.java b/source/com/intellij/openapi/roots/ui/configuration/projectRoot/ProjectRootConfigurable.java
index 17901ed..41ce4e9 100644
--- a/source/com/intellij/openapi/roots/ui/configuration/projectRoot/ProjectRootConfigurable.java
+++ b/source/com/intellij/openapi/roots/ui/configuration/projectRoot/ProjectRootConfigurable.java
@@ -544,18 +544,18 @@
     DefaultActionGroup group = new DefaultActionGroup();
     group.add(new AnAction(ProjectBundle.message("add.new.global.library.text")) {
       public void actionPerformed(AnActionEvent e) {
-        LibraryTableEditor.editLibraryTable(getGlobalLibrariesProvider()).createAddLibraryAction(true, myWholePanel).actionPerformed(null);
+        LibraryTableEditor.editLibraryTable(getGlobalLibrariesProvider(), myProject).createAddLibraryAction(true, myWholePanel).actionPerformed(null);
       }
     });
     group.add(new AnAction(ProjectBundle.message("add.new.application.server.library.text")) {
       public void actionPerformed(AnActionEvent e) {
-        LibraryTableEditor.editLibraryTable(getApplicationServerLibrariesProvider()).createAddLibraryAction(true, myWholePanel)
+        LibraryTableEditor.editLibraryTable(getApplicationServerLibrariesProvider(), myProject).createAddLibraryAction(true, myWholePanel)
           .actionPerformed(null);
       }
     });
     group.add(new AnAction(ProjectBundle.message("add.new.project.library.text")) {
       public void actionPerformed(AnActionEvent e) {
-        LibraryTableEditor.editLibraryTable(getProjectLibrariesProvider()).createAddLibraryAction(true, myWholePanel).actionPerformed(null);
+        LibraryTableEditor.editLibraryTable(getProjectLibrariesProvider(), myProject).createAddLibraryAction(true, myWholePanel).actionPerformed(null);
       }
     });
     final JBPopupFactory popupFactory = JBPopupFactory.getInstance();
