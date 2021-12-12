diff --git a/liquibase-maven-plugin/src/main/java/org/liquibase/maven/plugins/LiquibaseRollback.java b/liquibase-maven-plugin/src/main/java/org/liquibase/maven/plugins/LiquibaseRollback.java
index d714e93..780072f 100644
--- a/liquibase-maven-plugin/src/main/java/org/liquibase/maven/plugins/LiquibaseRollback.java
+++ b/liquibase-maven-plugin/src/main/java/org/liquibase/maven/plugins/LiquibaseRollback.java
@@ -52,7 +52,7 @@
                                      + "or rollbackDate");
     }
 
-    if (rollbackCount <= 0) {
+    if (rollbackCount!=-1 && rollbackCount <= 0) {
       throw new MojoFailureException("A rollback count of " + rollbackCount + " is meaningless, please "
                                      + "select a value greater than 0");
     }
