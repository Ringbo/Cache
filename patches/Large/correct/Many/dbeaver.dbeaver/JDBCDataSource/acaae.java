diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCDataSource.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCDataSource.java
index e41dc5b..18a2c14 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCDataSource.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCDataSource.java
@@ -314,18 +314,18 @@
             try {
                 databaseMajorVersion = metaData.getDatabaseMajorVersion();
                 databaseMinorVersion = metaData.getDatabaseMinorVersion();
-            } catch (SQLException e) {
+            } catch (Throwable e) {
                 log.error("Error determining server version", e);
             }
 
             try {
                 sqlDialect = createSQLDialect(metaData);
-            } catch (Exception e) {
+            } catch (Throwable e) {
                 log.error("Error creating SQL dialect", e);
             }
             try {
                 dataSourceInfo = createDataSourceInfo(metaData);
-            } catch (Exception e) {
+            } catch (Throwable e) {
                 log.error("Error obtaining database info");
             }
         } catch (SQLException ex) {
