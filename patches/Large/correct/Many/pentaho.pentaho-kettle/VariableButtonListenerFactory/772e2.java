diff --git a/src/be/ibridge/kettle/trans/step/textfileinput/VariableButtonListenerFactory.java b/src/be/ibridge/kettle/trans/step/textfileinput/VariableButtonListenerFactory.java
index 7ed396a..ab43993 100644
--- a/src/be/ibridge/kettle/trans/step/textfileinput/VariableButtonListenerFactory.java
+++ b/src/be/ibridge/kettle/trans/step/textfileinput/VariableButtonListenerFactory.java
@@ -45,7 +45,7 @@
                 }
                 
                 Props props = Props.getInstance();
-                EnterSelectionDialog esd = new EnterSelectionDialog(composite.getShell(), props, str, Messages.getString("System.Dialog.SelectEnvironmentVar.Title"), Messages.getString("System.Dialog.SelectEnvironmentVar.Message"));
+                EnterSelectionDialog esd = new EnterSelectionDialog(composite.getShell(), str, Messages.getString("System.Dialog.SelectEnvironmentVar.Title"), Messages.getString("System.Dialog.SelectEnvironmentVar.Message"));
                 if (esd.open()!=null)
                 {
                     int nr = esd.getSelectionNr();
