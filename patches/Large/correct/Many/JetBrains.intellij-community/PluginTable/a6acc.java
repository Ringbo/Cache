diff --git a/plugins-management/src/com/intellij/ide/plugins/PluginTable.java b/plugins-management/src/com/intellij/ide/plugins/PluginTable.java
index 58f9a33..33ac6de 100644
--- a/plugins-management/src/com/intellij/ide/plugins/PluginTable.java
+++ b/plugins-management/src/com/intellij/ide/plugins/PluginTable.java
@@ -50,7 +50,7 @@
   }
 
   private void initializeHeader(final PluginTableModel model) {
-    JTableHeader header = getTableHeader();
+    final JTableHeader header = getTableHeader();
     header.setDefaultRenderer(new PluginTableHeaderRenderer(model));
 
     header.addMouseListener(new MouseAdapter() {
@@ -72,7 +72,7 @@
 
         model.sortByColumn(column);
 
-        getTableHeader().updateUI();
+        header.repaint();
       }
     });
     header.setReorderingAllowed(false);
