diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCExecutionContext.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCExecutionContext.java
index 189e0d1..ce4b995 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCExecutionContext.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCExecutionContext.java
@@ -415,6 +415,6 @@
 
     public void reconnect(DBRProgressMonitor monitor) throws DBCException {
         close();
-        connect(monitor, null, null, false, false);
+        connect(monitor, null, null, false, true);
     }
 }
