diff --git a/src/java/liquibase/migrator/Migrator.java b/src/java/liquibase/migrator/Migrator.java
index 2d2b108..9b8b9f8 100644
--- a/src/java/liquibase/migrator/Migrator.java
+++ b/src/java/liquibase/migrator/Migrator.java
@@ -510,7 +510,7 @@
             return ChangeSet.RunStatus.NOT_RAN;
         } else {
             if (foundRan.getMd5sum() == null) {
-                log.info("Updating NULL md5sum for " + this.toString());
+                log.info("Updating NULL md5sum for " + changeSet.toString());
                 Migrator migrator = changeSet.getDatabaseChangeLog().getMigrator();
                 Connection connection = migrator.getDatabase().getConnection();
                 PreparedStatement updatePstmt = connection.prepareStatement("update DatabaseChangeLog set md5sum=? where id=? AND author=? AND filename=?".toUpperCase());
@@ -531,7 +531,7 @@
                     if (changeSet.shouldRunOnChange()) {
                         return ChangeSet.RunStatus.RUN_AGAIN;
                     } else {
-                        throw new DatabaseHistoryException("MD5 Check for " + toString() + " failed");
+                        throw new DatabaseHistoryException("MD5 Check for " + changeSet.toString() + " failed");
                     }
                 }
             }
