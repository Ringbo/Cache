diff --git a/querydsl-sql/src/main/java/com/querydsl/sql/dml/SQLInsertClause.java b/querydsl-sql/src/main/java/com/querydsl/sql/dml/SQLInsertClause.java
index 8e0ff91..98ee502 100644
--- a/querydsl-sql/src/main/java/com/querydsl/sql/dml/SQLInsertClause.java
+++ b/querydsl-sql/src/main/java/com/querydsl/sql/dml/SQLInsertClause.java
@@ -333,7 +333,7 @@
 
                 listeners.preExecute(context);
                 stmt.executeUpdate();
-                listeners.preExecute(context);
+                listeners.executed(context);
             } else {
                 Collection<PreparedStatement> stmts = createStatements(true);
                 if (stmts != null && stmts.size() > 1) {
