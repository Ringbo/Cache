diff --git a/src/main/java/com/chrisrm/idea/wizard/steps/MTWizardAccentPanel.java b/src/main/java/com/chrisrm/idea/wizard/steps/MTWizardAccentPanel.java
index 1198dbd..05d1d71 100644
--- a/src/main/java/com/chrisrm/idea/wizard/steps/MTWizardAccentPanel.java
+++ b/src/main/java/com/chrisrm/idea/wizard/steps/MTWizardAccentPanel.java
@@ -84,7 +84,7 @@
   private void initComponents() {
     // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
     // Generated using JFormDesigner non-commercial license
-    ResourceBundle bundle = ResourceBundle.getBundle("messages.MTWizardBundle");
+    final ResourceBundle bundle = ResourceBundle.getBundle("messages.MTWizardBundle");
     scrollPane = new JBScrollPane();
     content = new JPanel();
     accentColorPanel = new JPanel();
