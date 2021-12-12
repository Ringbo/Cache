diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCResultSetImpl.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCResultSetImpl.java
index c29ec75..35f8c6c 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCResultSetImpl.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCResultSetImpl.java
@@ -1609,7 +1609,7 @@
     public <T> T getObject(int columnIndex, Class<T> type) throws SQLException {
         try {
             return original.getObject(columnIndex, type);
-        } catch (AbstractMethodError e) {
+        } catch (LinkageError e) {
             throw new SQLFeatureNotSupportedException(JDBCConstants.ERROR_API_NOT_SUPPORTED_17);
         }
     }
@@ -1618,7 +1618,7 @@
     public <T> T getObject(String columnLabel, Class<T> type) throws SQLException {
         try {
             return original.getObject(columnLabel, type);
-        } catch (AbstractMethodError e) {
+        } catch (LinkageError e) {
             throw new SQLFeatureNotSupportedException(JDBCConstants.ERROR_API_NOT_SUPPORTED_17);
         }
     }
