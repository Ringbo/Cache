diff --git a/python/pluginSrc/com/jetbrains/python/run/PyPluginCommonOptionsForm.java b/python/pluginSrc/com/jetbrains/python/run/PyPluginCommonOptionsForm.java
index 083e3ec..e2771b4 100644
--- a/python/pluginSrc/com/jetbrains/python/run/PyPluginCommonOptionsForm.java
+++ b/python/pluginSrc/com/jetbrains/python/run/PyPluginCommonOptionsForm.java
@@ -53,7 +53,7 @@
       }
     });
 
-    myInterpreterComboBox.setRenderer(new SdkListCellRenderer("<Project Default>"));
+    myInterpreterComboBox.setRenderer(new SdkListCellRenderer("<Project Default>", myInterpreterComboBox.getRenderer()));
     myWorkingDirectoryTextField.addBrowseFolderListener("Select Working Directory", "", configuration.getProject(),
                                                   new FileChooserDescriptor(false, true, false, false, false, false));
 
