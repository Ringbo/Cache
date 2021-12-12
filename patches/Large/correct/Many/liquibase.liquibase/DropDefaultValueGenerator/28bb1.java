diff --git a/liquibase-core/src/main/java/liquibase/sqlgenerator/core/DropDefaultValueGenerator.java b/liquibase-core/src/main/java/liquibase/sqlgenerator/core/DropDefaultValueGenerator.java
index 799ab45..fbc58f4 100644
--- a/liquibase-core/src/main/java/liquibase/sqlgenerator/core/DropDefaultValueGenerator.java
+++ b/liquibase-core/src/main/java/liquibase/sqlgenerator/core/DropDefaultValueGenerator.java
@@ -40,7 +40,7 @@
              } catch (DatabaseException e) {
                  throw new UnexpectedLiquibaseException(e);
              }
-             if(productVersion.startsWith("9") || productVersion.startsWith("10")) { // SQL Server 2005/2008
+             if(productVersion.startsWith("9") || productVersion.startsWith("10") || productVersion.startsWith("11")) { // SQL Server 2005/2008/2012
 			      // SQL Server 2005 does not often work with the simpler query shown below
         			String query = "DECLARE @default sysname\n";
         			query += "SELECT @default = object_name(default_object_id) FROM sys.columns WHERE object_id=object_id('" + statement.getSchemaName() + "." + statement.getTableName() + "') AND name='" + statement.getColumnName() + "'\n";
