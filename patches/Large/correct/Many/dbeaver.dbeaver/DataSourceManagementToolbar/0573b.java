diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DataSourceManagementToolbar.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DataSourceManagementToolbar.java
index 99e36e2..f2ba29b 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DataSourceManagementToolbar.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DataSourceManagementToolbar.java
@@ -100,7 +100,7 @@
 
     private final List<DBPDataSourceRegistry> handledRegistries = new ArrayList<>();
     private final List<DatabaseListReader> dbListReads = new ArrayList<>();
-    private IFile activeFile;
+    private volatile IFile activeFile;
 
     private static class DatabaseListReader extends DataSourceJob {
         private final List<DBNDatabaseNode> nodeList = new ArrayList<>();
@@ -831,7 +831,7 @@
                 @Override
                 public void run() {
                     final int selConnection = connectionCombo.getSelectionIndex();
-                    if (selConnection > 0) {
+                    if (selConnection > 0 && activeFile != null) {
                         DBPDataSourceContainer visibleContainer = connectionCombo.getItem(selConnection);
                         DBPDataSourceContainer newContainer = EditorUtils.getFileDataSource(activeFile);
                         if (newContainer != visibleContainer) {
