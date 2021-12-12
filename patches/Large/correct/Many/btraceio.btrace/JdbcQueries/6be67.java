diff --git a/samples/JdbcQueries.java b/samples/JdbcQueries.java
index 9374dac..f5acab6 100644
--- a/samples/JdbcQueries.java
+++ b/samples/JdbcQueries.java
@@ -120,7 +120,7 @@
     // Otherwise the SQL is in the first argument.
 
     @OnMethod(clazz = "+java.sql.Statement", method = "/execute.*/")
-    public static void onExecute(@Self Statement currentStatement, AnyType[] args) {
+    public static void onExecute(@Self Object currentStatement, AnyType[] args) {
         if (args.length == 0) {
             // No SQL argument; lookup the SQL from the prepared statement
             executingStatement = Collections.get(preparedStatementDescriptions, currentStatement);
