diff --git a/modules/DesktopBranding/src/main/java/org/gephi/branding/desktop/Installer.java b/modules/DesktopBranding/src/main/java/org/gephi/branding/desktop/Installer.java
index a7bdf3b..e46af77 100644
--- a/modules/DesktopBranding/src/main/java/org/gephi/branding/desktop/Installer.java
+++ b/modules/DesktopBranding/src/main/java/org/gephi/branding/desktop/Installer.java
@@ -129,7 +129,7 @@
         int option = JOptionPane.showConfirmDialog(WindowManager.getDefault().getMainWindow(), NbBundle.getMessage(Installer.class, "CloseConfirmation.message"), NbBundle.getMessage(Installer.class, "CloseConfirmation.message"), JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
         if (option == JOptionPane.YES_OPTION) {
             Lookup.getDefault().lookup(ProjectControllerUI.class).saveProject();
-        } else if (option == JOptionPane.CANCEL_OPTION) {
+        } else if (option == JOptionPane.CANCEL_OPTION || option == JOptionPane.CLOSED_OPTION) {
             return false;//Exit canceled
         }
         Lookup.getDefault().lookup(ProjectController.class).closeCurrentProject();
