diff --git a/core/src/java/liquibase/migrator/parser/ValidateChangeLogHandler.java b/core/src/java/liquibase/migrator/parser/ValidateChangeLogHandler.java
index cebb52c..7ed6b3f 100644
--- a/core/src/java/liquibase/migrator/parser/ValidateChangeLogHandler.java
+++ b/core/src/java/liquibase/migrator/parser/ValidateChangeLogHandler.java
@@ -39,7 +39,7 @@
             duplicateChangeSets = new HashSet<ChangeSet>();
         }
 
-        if (setupExceptions != null) {
+        if (setupExceptions == null) {
             setupExceptions = new ArrayList<SetupException>();
         }
     }
