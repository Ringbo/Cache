diff --git a/flyway-core/src/main/java/org/flywaydb/core/internal/dbsupport/DbSupportFactory.java b/flyway-core/src/main/java/org/flywaydb/core/internal/dbsupport/DbSupportFactory.java
index 0a889b9..53059a7 100644
--- a/flyway-core/src/main/java/org/flywaydb/core/internal/dbsupport/DbSupportFactory.java
+++ b/flyway-core/src/main/java/org/flywaydb/core/internal/dbsupport/DbSupportFactory.java
@@ -131,7 +131,7 @@
         }
 
 		//Sybase ASE support
-        if (databaseProductName.startsWith("ASE")) {
+        if (databaseProductName.startsWith("ASE") || databaseProductName.startsWith("Adaptive")) {
         	return new SybaseASEDbSupport(connection);
         }
         if (databaseProductName.startsWith("HDB")) {
