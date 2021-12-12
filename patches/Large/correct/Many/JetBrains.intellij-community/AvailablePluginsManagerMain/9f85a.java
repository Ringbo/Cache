diff --git a/platform/platform-impl/src/com/intellij/ide/plugins/AvailablePluginsManagerMain.java b/platform/platform-impl/src/com/intellij/ide/plugins/AvailablePluginsManagerMain.java
index 66e951c..aeb87e1 100644
--- a/platform/platform-impl/src/com/intellij/ide/plugins/AvailablePluginsManagerMain.java
+++ b/platform/platform-impl/src/com/intellij/ide/plugins/AvailablePluginsManagerMain.java
@@ -97,7 +97,7 @@
     AvailablePluginsTableModel model = new AvailablePluginsTableModel();
     model.setVendor(myVendorFilter);
     if (PluginManagerUISettings.getInstance().availableSortByStatus) {
-      pluginsModel.setSortByStatus(true);
+      model.setSortByStatus(true);
     }
 
     pluginsModel = model;
