diff --git a/flyway-core/src/main/java/org/flywaydb/core/internal/dbsupport/postgresql/PostgreSQLDbSupport.java b/flyway-core/src/main/java/org/flywaydb/core/internal/dbsupport/postgresql/PostgreSQLDbSupport.java
index f06f37a..1e79d8f 100644
--- a/flyway-core/src/main/java/org/flywaydb/core/internal/dbsupport/postgresql/PostgreSQLDbSupport.java
+++ b/flyway-core/src/main/java/org/flywaydb/core/internal/dbsupport/postgresql/PostgreSQLDbSupport.java
@@ -107,7 +107,7 @@
         String statement = sql.substring(0, split);
         String data = sql.substring(split + 1).trim();
 
-        CopyManager copyManager = new CopyManager((BaseConnection) connection.unwrap(Connection.class));
+        CopyManager copyManager = new CopyManager((BaseConnection) connection.unwrap(BaseConnection.class));
         try {
             copyManager.copyIn(statement, new StringReader(data));
         } catch (IOException e) {
