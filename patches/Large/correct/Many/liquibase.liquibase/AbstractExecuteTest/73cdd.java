diff --git a/liquibase-integration-tests/src/test/java/liquibase/statementexecute/AbstractExecuteTest.java b/liquibase-integration-tests/src/test/java/liquibase/statementexecute/AbstractExecuteTest.java
index 0d32bd3..fd8dd01 100644
--- a/liquibase-integration-tests/src/test/java/liquibase/statementexecute/AbstractExecuteTest.java
+++ b/liquibase-integration-tests/src/test/java/liquibase/statementexecute/AbstractExecuteTest.java
@@ -71,7 +71,7 @@
     }
 
     protected void assertCorrect(String[] expectedSql, Class<? extends Database>... includeDatabases) throws Exception {
-        assertNotNull(statementUnderTest);
+        assertNotNull("SqlStatement to test is NOT null.", statementUnderTest);
 
         test(expectedSql, includeDatabases, null);
     }
