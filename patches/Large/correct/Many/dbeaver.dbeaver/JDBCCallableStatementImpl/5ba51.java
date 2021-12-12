diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCCallableStatementImpl.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCCallableStatementImpl.java
index 28ceb16..5507bfc 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCCallableStatementImpl.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCCallableStatementImpl.java
@@ -836,7 +836,7 @@
     public <T> T getObject(int parameterIndex, Class<T> type) throws SQLException {
         try {
             return getOriginal().getObject(parameterIndex, type);
-        } catch (AbstractMethodError e) {
+        } catch (LinkageError e) {
             throw new SQLFeatureNotSupportedException(JDBCConstants.ERROR_API_NOT_SUPPORTED_17);
         }
     }
@@ -845,7 +845,7 @@
     public <T> T getObject(String parameterName, Class<T> type) throws SQLException {
         try {
             return getOriginal().getObject(parameterName, type);
-        } catch (AbstractMethodError e) {
+        } catch (LinkageError e) {
             throw new SQLFeatureNotSupportedException(JDBCConstants.ERROR_API_NOT_SUPPORTED_17);
         }
     }
