diff --git a/liquibase-core/src/main/java/liquibase/executor/LoggingExecutor.java b/liquibase-core/src/main/java/liquibase/executor/LoggingExecutor.java
index 0fd5841..3cf11e9 100644
--- a/liquibase-core/src/main/java/liquibase/executor/LoggingExecutor.java
+++ b/liquibase-core/src/main/java/liquibase/executor/LoggingExecutor.java
@@ -125,7 +125,7 @@
             return delegatedReadExecutor.queryForInt(sql);
         } catch (DatabaseException e) {
             if (sql instanceof GetNextChangeSetSequenceValueStatement) { //table probably does not exist
-                return 1;
+                return 0;
             }
             throw e;
         }
