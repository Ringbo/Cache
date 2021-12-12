diff --git a/liquibase-core/src/main/java/liquibase/sqlgenerator/core/DropPrimaryKeyGenerator.java b/liquibase-core/src/main/java/liquibase/sqlgenerator/core/DropPrimaryKeyGenerator.java
index 1f06ebe..090a56d 100644
--- a/liquibase-core/src/main/java/liquibase/sqlgenerator/core/DropPrimaryKeyGenerator.java
+++ b/liquibase-core/src/main/java/liquibase/sqlgenerator/core/DropPrimaryKeyGenerator.java
@@ -61,9 +61,10 @@
 						+ "    FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS tc\n"
 						+ "    WHERE CONSTRAINT_TYPE = 'PRIMARY KEY'\n"
 						+ "      AND TABLE_NAME = '%2$s' AND TABLE_SCHEMA = '%1$s';\n"
-						+ "    EXECUTE 'alter table %1$s.%2$s drop constraint ' || constraint_name;\n"
+						+ "    EXECUTE 'alter table %3$s.%4$s drop constraint ' || constraint_name;\n"
 						+ "END $$;"
-						, schemaName, tableName);
+						, schemaName, tableName
+						, database.escapeObjectName(schemaName, Schema.class), database.escapeObjectName(tableName, Table.class));
 			} else {
 				sql = "ALTER TABLE " + database.escapeTableName(statement.getCatalogName(), statement.getSchemaName(), statement.getTableName()) + " DROP CONSTRAINT " + database.escapeConstraintName(statement.getConstraintName());
 			}
