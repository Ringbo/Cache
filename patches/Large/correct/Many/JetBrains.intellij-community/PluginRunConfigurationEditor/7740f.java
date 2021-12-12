diff --git a/plugins/devkit/src/run/PluginRunConfigurationEditor.java b/plugins/devkit/src/run/PluginRunConfigurationEditor.java
index b97ceff..52e9157 100644
--- a/plugins/devkit/src/run/PluginRunConfigurationEditor.java
+++ b/plugins/devkit/src/run/PluginRunConfigurationEditor.java
@@ -139,11 +139,11 @@
     JPanel wholePanel = new JPanel(new GridBagLayout());
     myVMParameters.setText(DevKitBundle.message("vm.parameters"));
     myVMParameters.setComponent(new RawCommandLineEditor());
-    myVMParameters.getComponent().setDialodCaption(myVMParameters.getRawText());
+    myVMParameters.getComponent().setDialogCaption(myVMParameters.getRawText());
 
     myProgramParameters.setText(DevKitBundle.message("program.parameters"));
     myProgramParameters.setComponent(new RawCommandLineEditor());
-    myProgramParameters.getComponent().setDialodCaption(myProgramParameters.getRawText());
+    myProgramParameters.getComponent().setDialogCaption(myProgramParameters.getRawText());
 
     GridBagConstraints gc = new GridBagConstraints(0, GridBagConstraints.RELATIVE, 1, 1, 1, 0, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, new Insets(5, 0, 5, 0), 0, 0);
     wholePanel.add(myVMParameters, gc);
