diff --git a/plugins/org.jkiss.dbeaver.ext.mssql/src/org/jkiss/dbeaver/ext/mssql/model/SQLServerView.java b/plugins/org.jkiss.dbeaver.ext.mssql/src/org/jkiss/dbeaver/ext/mssql/model/SQLServerView.java
index d8a9420..e2460a7 100644
--- a/plugins/org.jkiss.dbeaver.ext.mssql/src/org/jkiss/dbeaver/ext/mssql/model/SQLServerView.java
+++ b/plugins/org.jkiss.dbeaver.ext.mssql/src/org/jkiss/dbeaver/ext/mssql/model/SQLServerView.java
@@ -154,7 +154,7 @@
             if (isPersisted()) {
                 ddl = SQLServerUtils.extractSource(monitor, getDatabase(), getSchema(), getName());
             } else {
-                ddl = "CREATE VIEW " + DBUtils.getQuotedIdentifier(this) + " AS\n";
+                ddl = "CREATE VIEW " + this.getFullyQualifiedName(DBPEvaluationContext.DDL) + " AS\n";
             }
         }
         return ddl;
