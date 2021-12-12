diff --git a/liquibase-core-jvm/src/main/java/liquibase/snapshot/core/SQLiteDatabaseSnapshotGenerator.java b/liquibase-core-jvm/src/main/java/liquibase/snapshot/core/SQLiteDatabaseSnapshotGenerator.java
index f55768a..5f426a7 100644
--- a/liquibase-core-jvm/src/main/java/liquibase/snapshot/core/SQLiteDatabaseSnapshotGenerator.java
+++ b/liquibase-core-jvm/src/main/java/liquibase/snapshot/core/SQLiteDatabaseSnapshotGenerator.java
@@ -244,7 +244,7 @@
         if (table == null) {
             View view = snapshot.getView(tableName);
             if (view == null) {
-                LogFactory.getLogger().info("Could not find table or view " + tableName + " for column " + columnName);
+                LogFactory.getLogger().debug("Could not find table or view " + tableName + " for column " + columnName);
                 return null;
             } else {
                 columnInfo.setView(view);
