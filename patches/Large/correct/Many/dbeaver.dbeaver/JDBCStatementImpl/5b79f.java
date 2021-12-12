diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCStatementImpl.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCStatementImpl.java
index 0de069c..da4d029 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCStatementImpl.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCStatementImpl.java
@@ -268,7 +268,7 @@
             JDBCUtils.scrollResultSet(resultSet, rsOffset, !getConnection().getDataSource().getInfo().supportsResultSetScroll());
         }
 
-        if (rsMaxRows > 0) {
+        if (rsMaxRows > 0 && connection.getDataSource().getInfo().supportsResultSetLimit()) {
             dbResult.setMaxRows(rsMaxRows);
         }
         return dbResult;
