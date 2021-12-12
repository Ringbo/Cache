diff --git a/app/src/processing/app/contrib/ContributionPanel.java b/app/src/processing/app/contrib/ContributionPanel.java
index 09ba24f..6a6a5e9 100644
--- a/app/src/processing/app/contrib/ContributionPanel.java
+++ b/app/src/processing/app/contrib/ContributionPanel.java
@@ -484,7 +484,7 @@
 
   protected void resetInstallProgressBarState() {
     installProgressBar.setString("Starting");
-    installProgressBar.setIndeterminate(true);
+    installProgressBar.setIndeterminate(false);
     installProgressBar.setValue(0);
     installProgressBar.setVisible(false);
   }
