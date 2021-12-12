diff --git a/liquibase-core/src/main/java/liquibase/database/core/MSSQLDatabase.java b/liquibase-core/src/main/java/liquibase/database/core/MSSQLDatabase.java
index 2830384..33fa103 100644
--- a/liquibase-core/src/main/java/liquibase/database/core/MSSQLDatabase.java
+++ b/liquibase-core/src/main/java/liquibase/database/core/MSSQLDatabase.java
@@ -303,7 +303,7 @@
         if (schemaName== null || (isDefaultSchema(catalogName, schemaName) && !getOutputDefaultSchema())) {
             return escapeObjectName(viewName, View.class);
         } else {
-            return escapeObjectName(schemaName, Schema.class)+"."+ escapeObjectName(viewName, Schema.class);
+            return escapeObjectName(schemaName, Schema.class)+"."+ escapeObjectName(viewName, View.class);
         }
 
     }
