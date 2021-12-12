diff --git a/core/src/java/liquibase/database/AbstractDatabase.java b/core/src/java/liquibase/database/AbstractDatabase.java
index 3eb3caa..464f133 100644
--- a/core/src/java/liquibase/database/AbstractDatabase.java
+++ b/core/src/java/liquibase/database/AbstractDatabase.java
@@ -758,7 +758,7 @@
     }
 
     public String getViewDefinition(String schemaName, String viewName) throws JDBCException {
-        if (schemaName == null) {
+        if (schemaName != null) {
             schemaName = convertRequestedSchemaToSchema(schemaName);
         }
         String definition = (String) this.getJdbcTemplate().queryForObject(getViewDefinitionSql(schemaName, viewName), String.class);
