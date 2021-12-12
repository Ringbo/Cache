diff --git a/flyway-core/src/test/java/org/flywaydb/core/internal/dbsupport/enterprisedb/EnterpriseDBSqlScriptSmallTest.java b/flyway-core/src/test/java/org/flywaydb/core/internal/dbsupport/enterprisedb/EnterpriseDBSqlScriptSmallTest.java
index 751e24d..ae6b503 100644
--- a/flyway-core/src/test/java/org/flywaydb/core/internal/dbsupport/enterprisedb/EnterpriseDBSqlScriptSmallTest.java
+++ b/flyway-core/src/test/java/org/flywaydb/core/internal/dbsupport/enterprisedb/EnterpriseDBSqlScriptSmallTest.java
@@ -80,7 +80,7 @@
         List<SqlStatement> sqlStatements = sqlScript.getSqlStatements();
         assertEquals(3, sqlStatements.size());
         assertEquals(16, sqlStatements.get(0).getLineNumber());
-        assertEquals(27, sqlStatements.get(1).getLineNumber());
+        assertEquals(26, sqlStatements.get(1).getLineNumber());
     }
 
     @Test
