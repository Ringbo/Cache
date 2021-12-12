diff --git a/flyway-core/src/test/java/org/flywaydb/core/internal/dbsupport/vertica/VerticaSqlScriptSmallTest.java b/flyway-core/src/test/java/org/flywaydb/core/internal/dbsupport/vertica/VerticaSqlScriptSmallTest.java
index 7e15eae..0715acd 100644
--- a/flyway-core/src/test/java/org/flywaydb/core/internal/dbsupport/vertica/VerticaSqlScriptSmallTest.java
+++ b/flyway-core/src/test/java/org/flywaydb/core/internal/dbsupport/vertica/VerticaSqlScriptSmallTest.java
@@ -35,9 +35,9 @@
 
         SqlScript sqlScript = new SqlScript(source, new VerticaDbSupport(null));
         List<SqlStatement> sqlStatements = sqlScript.getSqlStatements();
-        assertEquals(3, sqlStatements.size());
+        assertEquals(10, sqlStatements.size());
         assertEquals(17, sqlStatements.get(0).getLineNumber());
         assertEquals(19, sqlStatements.get(1).getLineNumber());
-        assertEquals(23, sqlStatements.get(2).getLineNumber());
+        assertEquals(20, sqlStatements.get(2).getLineNumber());
     }
 }
