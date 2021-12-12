diff --git a/platform/lang-impl/src/com/intellij/webcore/packaging/ManagePackagesDialog.java b/platform/lang-impl/src/com/intellij/webcore/packaging/ManagePackagesDialog.java
index 68bb7ef..07f5477 100644
--- a/platform/lang-impl/src/com/intellij/webcore/packaging/ManagePackagesDialog.java
+++ b/platform/lang-impl/src/com/intellij/webcore/packaging/ManagePackagesDialog.java
@@ -100,7 +100,7 @@
                 @Override
                 public void run() {
                   //noinspection DialogTitleCapitalization
-                  Messages.showErrorDialog("Error updating package list: " + e.getMessage(), "Reload List of Packages");
+                  Messages.showErrorDialog(myMainPanel, "Error updating package list: " + e.getMessage(), "Reload List of Packages");
                   myPackages.setPaintBusy(false);
                 }
               }, ModalityState.any());
@@ -309,7 +309,7 @@
           application.invokeLater(new Runnable() {
             @Override
             public void run() {
-              Messages.showErrorDialog("Error loading package list:" + e.getMessage(), "Packages");
+              Messages.showErrorDialog(myMainPanel, "Error loading package list:" + e.getMessage(), "Packages");
               setDownloadStatus(false);
             }
           }, ModalityState.any());
@@ -545,7 +545,7 @@
         final Color fg = orig.getForeground();
         myNameLabel.setForeground(myInstalledPackages.contains(name) ? PlatformColors.BLUE : fg);
       }
-      myRepositoryLabel.setForeground(Color.GRAY);
+      myRepositoryLabel.setForeground(JBColor.GRAY);
 
       final Color bg;
       if (isSelected) {
