diff --git a/plugins/org.jkiss.dbeaver.db2/src/org/jkiss/dbeaver/ext/db2/model/DB2Schema.java b/plugins/org.jkiss.dbeaver.db2/src/org/jkiss/dbeaver/ext/db2/model/DB2Schema.java
index c8f5541..c20d251 100644
--- a/plugins/org.jkiss.dbeaver.db2/src/org/jkiss/dbeaver/ext/db2/model/DB2Schema.java
+++ b/plugins/org.jkiss.dbeaver.db2/src/org/jkiss/dbeaver/ext/db2/model/DB2Schema.java
@@ -237,7 +237,7 @@
 
     public DB2View getView(DBRProgressMonitor monitor, String name) throws DBException
     {
-        return tableCache.getObject(monitor, this, name, DB2View.class);
+        return viewCache.getObject(monitor, this, name, DB2View.class);
     }
 
     @Association
