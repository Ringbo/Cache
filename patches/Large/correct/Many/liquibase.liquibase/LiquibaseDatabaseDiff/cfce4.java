diff --git a/liquibase-maven-plugin/src/main/java/org/liquibase/maven/plugins/LiquibaseDatabaseDiff.java b/liquibase-maven-plugin/src/main/java/org/liquibase/maven/plugins/LiquibaseDatabaseDiff.java
index 39445a3..d0a9780 100644
--- a/liquibase-maven-plugin/src/main/java/org/liquibase/maven/plugins/LiquibaseDatabaseDiff.java
+++ b/liquibase-maven-plugin/src/main/java/org/liquibase/maven/plugins/LiquibaseDatabaseDiff.java
@@ -101,7 +101,7 @@
         }
 
         Database db = liquibase.getDatabase();
-        Database referenceDatabase = CommandLineUtils.createDatabaseObject(cl, referenceUrl, referenceUsername, referencePassword, referenceDriver, referenceDefaultSchemaName, null);
+        Database referenceDatabase = CommandLineUtils.createDatabaseObject(cl, referenceUrl, referenceUsername, referencePassword, referenceDriver, referenceDefaultSchemaName, null, null);
 
         getLog().info("Performing Diff on database " + db.toString());
         if (diffChangeLogFile != null) {
