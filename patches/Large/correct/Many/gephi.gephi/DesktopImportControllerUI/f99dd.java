diff --git a/DesktopImport/src/org/gephi/desktop/importer/DesktopImportControllerUI.java b/DesktopImport/src/org/gephi/desktop/importer/DesktopImportControllerUI.java
index de825a4..09e7a9c 100644
--- a/DesktopImport/src/org/gephi/desktop/importer/DesktopImportControllerUI.java
+++ b/DesktopImport/src/org/gephi/desktop/importer/DesktopImportControllerUI.java
@@ -327,7 +327,7 @@
             ImporterUI ui = controller.getUI(importer);
             if (ui != null) {
                 ui.setup(importer);
-                String title = NbBundle.getMessage(DesktopImportControllerUI.class, "DesktopImportControllerUI.spigot.ui.dialog.title");
+                String title = NbBundle.getMessage(DesktopImportControllerUI.class, "DesktopImportControllerUI.spigot.ui.dialog.title", ui.getDisplayName());
                 JPanel panel = ui.getPanel();
                 final DialogDescriptor dd = new DialogDescriptor(panel, title);
                 if (panel instanceof ValidationPanel) {
