diff --git a/src/main/groovy/sql/Sql.java b/src/main/groovy/sql/Sql.java
index 61d7956..f8d3cb2 100644
--- a/src/main/groovy/sql/Sql.java
+++ b/src/main/groovy/sql/Sql.java
@@ -751,10 +751,10 @@
             log.fine(sql);
 
             // Prepare a statement for the SQL and then execute it.
-            statement = connection.prepareStatement(sql);
+            statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             setParameters(params, statement);
             configure(statement);
-            boolean hasResultSet = statement.execute(sql, Statement.RETURN_GENERATED_KEYS);
+            boolean hasResultSet = statement.execute();
 
             // Prepare a list to contain the auto-generated column
             // values, and then fetch them from the statement.
