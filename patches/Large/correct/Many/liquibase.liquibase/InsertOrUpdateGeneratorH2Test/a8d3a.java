diff --git a/liquibase-core/src/test/java/liquibase/sqlgenerator/core/InsertOrUpdateGeneratorH2Test.java b/liquibase-core/src/test/java/liquibase/sqlgenerator/core/InsertOrUpdateGeneratorH2Test.java
index b6934be..2152122 100644
--- a/liquibase-core/src/test/java/liquibase/sqlgenerator/core/InsertOrUpdateGeneratorH2Test.java
+++ b/liquibase-core/src/test/java/liquibase/sqlgenerator/core/InsertOrUpdateGeneratorH2Test.java
@@ -79,7 +79,7 @@
 		final String whereClause = generator.getWhereClause(insertOrUpdateStatement, database);
 
 		String result = generator.getUpdateStatement(insertOrUpdateStatement, database, whereClause, sqlGeneratorChain);
-		assertEquals(String.format("UPDATE %s.%s SET %s = '%s' WHERE %s = '%s';\n", CATALOG_NAME, TABLE_NAME, "col0", "value0", "pk1", "keyvalue1"), result);
+		assertEquals(String.format("UPDATE %s.%s SET %s = '%s' WHERE %s = '%s';\n", SCHEMA_NAME, TABLE_NAME, "col0", "value0", "pk1", "keyvalue1"), result);
 	}
 
 	/**
@@ -106,7 +106,7 @@
 
 		Sql[] results = generator.generateSql(insertOrUpdateStatement, database, sqlGeneratorChain);
 		assertThat(results, is(arrayWithSize(1)));
-        assertEquals(String.format("INSERT INTO %s.%s (%s, %s) VALUES ('%s', '%s')\nON DUPLICATE KEY UPDATE col0 = 'value0'", CATALOG_NAME, TABLE_NAME, "pk1", "col0", "keyvalue1", "value0"), results[0].toSql());
+        assertEquals(String.format("MERGE INTO %s.%s (%s, %s) KEY(%s) VALUES ('%s', '%s');", SCHEMA_NAME, TABLE_NAME, "pk1", "col0", "pk1", "keyvalue1", "value0"), results[0].toSql());
 	}
 
 }
