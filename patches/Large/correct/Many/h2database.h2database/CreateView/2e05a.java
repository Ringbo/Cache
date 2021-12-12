diff --git a/h2/src/main/org/h2/command/ddl/CreateView.java b/h2/src/main/org/h2/command/ddl/CreateView.java
index 5a2463f..2c50495 100644
--- a/h2/src/main/org/h2/command/ddl/CreateView.java
+++ b/h2/src/main/org/h2/command/ddl/CreateView.java
@@ -175,7 +175,7 @@
         String createSql;
         String createForceSql;
 
-        private DependentView(TableView view) {
+        DependentView(TableView view) {
             this.viewName = view.getName();
             this.createSql = view.getCreateSQL(true, false);
             this.createForceSql = view.getCreateSQL(true, true);
