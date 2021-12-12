diff --git a/jOOQ/src/main/java/org/jooq/impl/RowBetweenCondition.java b/jOOQ/src/main/java/org/jooq/impl/RowBetweenCondition.java
index 8031fc5..15c4c62 100644
--- a/jOOQ/src/main/java/org/jooq/impl/RowBetweenCondition.java
+++ b/jOOQ/src/main/java/org/jooq/impl/RowBetweenCondition.java
@@ -701,7 +701,7 @@
 
         // These dialects either don't support row value expressions, or they
         // Can't handle row value expressions with the BETWEEN predicate
-        else if (row.getDegree() > 1 && asList(CUBRID, DERBY, FIREBIRD, ORACLE, SQLITE, SQLSERVER, SYBASE).contains(configuration.getDialect())) {
+        else if (row.getDegree() > 1 && asList(CUBRID, DERBY, FIREBIRD, MYSQL, ORACLE, SQLITE, SQLSERVER, SYBASE).contains(configuration.getDialect())) {
             Condition result = r.ge(min).and(r.le(max));
 
             if (not) {
