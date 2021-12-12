diff --git a/liquibase-core/src/main/java/liquibase/database/AbstractDatabase.java b/liquibase-core/src/main/java/liquibase/database/AbstractDatabase.java
index 49d3eaa..786c99b 100644
--- a/liquibase-core/src/main/java/liquibase/database/AbstractDatabase.java
+++ b/liquibase-core/src/main/java/liquibase/database/AbstractDatabase.java
@@ -488,7 +488,7 @@
 
 
             if (snapshot.hasDatabaseChangeLogTable()) {
-                dropChanges.add(new AnonymousChange(new ClearDatabaseChangeLogTableStatement()));
+                dropChanges.add(new AnonymousChange(new ClearDatabaseChangeLogTableStatement(schema)));
             }
 
             for (Change change : dropChanges) {
