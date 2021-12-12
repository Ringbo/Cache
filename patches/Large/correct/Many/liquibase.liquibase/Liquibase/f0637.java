diff --git a/liquibase-core/src/main/java/liquibase/Liquibase.java b/liquibase-core/src/main/java/liquibase/Liquibase.java
index a77f518..815bd7c 100644
--- a/liquibase-core/src/main/java/liquibase/Liquibase.java
+++ b/liquibase-core/src/main/java/liquibase/Liquibase.java
@@ -804,7 +804,7 @@
                 logIterator.run(createRollbackVisitor(),
                     new RuntimeEnvironment(database, contexts, labelExpression));
             } else {
-                executeRollbackScript(rollbackScript);
+                executeRollbackScript(rollbackScript, contexts, labelExpression);
                 removeRunStatus(logIterator, contexts, labelExpression);
             }
         } finally {
