diff --git a/liquibase-core/src/main/java/liquibase/diff/core/StandardDiffGenerator.java b/liquibase-core/src/main/java/liquibase/diff/core/StandardDiffGenerator.java
index c703540..85a5a4e 100644
--- a/liquibase-core/src/main/java/liquibase/diff/core/StandardDiffGenerator.java
+++ b/liquibase-core/src/main/java/liquibase/diff/core/StandardDiffGenerator.java
@@ -111,7 +111,7 @@
                         String schemaComparisonName2 = StringUtils.trimToEmpty(schemaComparison.getReferenceSchema().standardize(comparisonDatabase).getSchemaName());
 
                         if (comparisonObjectSchemaName.equals("") && !schemaComparisonName1.equals("") && !schemaComparisonName2.equals("")) {
-                            comparisonObjectSchemaName = StringUtils.trimToNull(comparisonObjectSchema.getName());
+                            comparisonObjectSchemaName = StringUtils.trimToEmpty(comparisonObjectSchema.getName());
                         }
                         if (!(comparisonObjectSchemaName.equalsIgnoreCase(schemaComparisonName1) || comparisonObjectSchemaName.equals(schemaComparisonName2))) {
                             continue;
