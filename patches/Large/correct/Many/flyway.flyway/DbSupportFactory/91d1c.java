diff --git a/flyway-core/src/main/java/org/flywaydb/core/internal/dbsupport/DbSupportFactory.java b/flyway-core/src/main/java/org/flywaydb/core/internal/dbsupport/DbSupportFactory.java
index 53059a7..998ed2d 100644
--- a/flyway-core/src/main/java/org/flywaydb/core/internal/dbsupport/DbSupportFactory.java
+++ b/flyway-core/src/main/java/org/flywaydb/core/internal/dbsupport/DbSupportFactory.java
@@ -130,8 +130,9 @@
             return new PhoenixDbSupport(connection);
         }
 
-		//Sybase ASE support
-        if (databaseProductName.startsWith("ASE") || databaseProductName.startsWith("Adaptive")) {
+        if (databaseProductName.startsWith("ASE") || databaseProductName.startsWith("Adaptive") //Newer Sybase ASE versions
+                || databaseProductName.startsWith("sql server") // Older Sybase ASE 12.5 installations
+                ) {
         	return new SybaseASEDbSupport(connection);
         }
         if (databaseProductName.startsWith("HDB")) {
