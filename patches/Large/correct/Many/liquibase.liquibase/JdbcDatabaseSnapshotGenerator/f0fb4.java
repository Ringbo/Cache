diff --git a/liquibase-core-jvm/src/main/java/liquibase/snapshot/core/JdbcDatabaseSnapshotGenerator.java b/liquibase-core-jvm/src/main/java/liquibase/snapshot/core/JdbcDatabaseSnapshotGenerator.java
index 2f6389e..1aef2b3 100644
--- a/liquibase-core-jvm/src/main/java/liquibase/snapshot/core/JdbcDatabaseSnapshotGenerator.java
+++ b/liquibase-core-jvm/src/main/java/liquibase/snapshot/core/JdbcDatabaseSnapshotGenerator.java
@@ -329,7 +329,7 @@
             if (table == null) {
                 View view = snapshot.getView(tempTable.getName());
                 if (view == null) {
-                    LogFactory.getLogger().info("Could not find table or view " + tempTable.getName() + " for column " + column.getName());
+                    LogFactory.getLogger().debug("Could not find table or view " + tempTable.getName() + " for column " + column.getName());
                     continue;
                 } else {
                     column.setView(view);
