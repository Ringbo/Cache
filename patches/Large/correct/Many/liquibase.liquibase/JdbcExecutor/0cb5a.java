diff --git a/liquibase-core/src/main/java/liquibase/executor/jvm/JdbcExecutor.java b/liquibase-core/src/main/java/liquibase/executor/jvm/JdbcExecutor.java
index 27a27a7..1a928be 100644
--- a/liquibase-core/src/main/java/liquibase/executor/jvm/JdbcExecutor.java
+++ b/liquibase-core/src/main/java/liquibase/executor/jvm/JdbcExecutor.java
@@ -91,7 +91,7 @@
                     try {
                         stmt.execute(statement);
                     } catch (SQLException e) {
-                        log.severe("Error executing SQL "+statement);
+                        log.severe("Error executing SQL "+statement, e);
                         throw e;
                     }
                 }
