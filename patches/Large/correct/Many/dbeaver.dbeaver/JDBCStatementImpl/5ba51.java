diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCStatementImpl.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCStatementImpl.java
index b98048f..5758ca2 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCStatementImpl.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCStatementImpl.java
@@ -697,7 +697,7 @@
     public void closeOnCompletion() throws SQLException {
         try {
             getOriginal().closeOnCompletion();
-        } catch (AbstractMethodError e) {
+        } catch (LinkageError e) {
             throw new SQLFeatureNotSupportedException(JDBCConstants.ERROR_API_NOT_SUPPORTED_17);
         }
     }
@@ -706,7 +706,7 @@
     public boolean isCloseOnCompletion() throws SQLException {
         try {
             return getOriginal().isCloseOnCompletion();
-        } catch (AbstractMethodError e) {
+        } catch (LinkageError e) {
             throw new SQLFeatureNotSupportedException(JDBCConstants.ERROR_API_NOT_SUPPORTED_17);
         }
     }
