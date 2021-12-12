diff --git a/flyway-core/src/main/java/com/googlecode/flyway/core/dbsupport/DbSupportFactory.java b/flyway-core/src/main/java/com/googlecode/flyway/core/dbsupport/DbSupportFactory.java
index bc0bf66..5448b3c 100644
--- a/flyway-core/src/main/java/com/googlecode/flyway/core/dbsupport/DbSupportFactory.java
+++ b/flyway-core/src/main/java/com/googlecode/flyway/core/dbsupport/DbSupportFactory.java
@@ -74,8 +74,9 @@
         if ("Microsoft SQL Server".equals(databaseProductName)) {
             return new SQLServerDbSupport(connection);
         }
-        if ("MySQL".equals(databaseProductName) ||
-                "Google SQL Service/MySQL".equals(databaseProductName)) {
+        if ("MySQL".equals(databaseProductName)
+                || "Google SQL Service/MySQL".equals(databaseProductName)
+                || "MySQL/Google Cloud SQL".equals(databaseProductName)) {
             return new MySQLDbSupport(connection);
         }
         if ("Oracle".equals(databaseProductName)) {
