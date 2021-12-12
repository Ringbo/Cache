diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCExecutionContext.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCExecutionContext.java
index dbcc3be..189e0d1 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCExecutionContext.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCExecutionContext.java
@@ -415,6 +415,6 @@
 
     public void reconnect(DBRProgressMonitor monitor) throws DBCException {
         close();
-        connect(monitor);
+        connect(monitor, null, null, false, false);
     }
 }
