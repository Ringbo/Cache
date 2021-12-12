diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCDatabaseMetaDataImpl.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCDatabaseMetaDataImpl.java
index b450827..7b01a74 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCDatabaseMetaDataImpl.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCDatabaseMetaDataImpl.java
@@ -243,7 +243,7 @@
             return makeResultSet(
                 getOriginal().getPseudoColumns(catalog, schemaPattern, tableNamePattern, columnNamePattern),
                 "Load pseudo columns", catalog, schemaPattern, tableNamePattern, columnNamePattern);
-        } catch (AbstractMethodError e) {
+        } catch (LinkageError e) {
             throw new SQLFeatureNotSupportedException(JDBCConstants.ERROR_API_NOT_SUPPORTED_17);
         }
     }
@@ -252,7 +252,7 @@
     public boolean generatedKeyAlwaysReturned() throws SQLException {
         try {
             return getOriginal().generatedKeyAlwaysReturned();
-        } catch (AbstractMethodError e) {
+        } catch (LinkageError e) {
             throw new SQLFeatureNotSupportedException(JDBCConstants.ERROR_API_NOT_SUPPORTED_17);
         }
     }
