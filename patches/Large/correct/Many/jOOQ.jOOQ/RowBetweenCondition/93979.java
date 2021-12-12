diff --git a/jOOQ/src/main/java/org/jooq/impl/RowBetweenCondition.java b/jOOQ/src/main/java/org/jooq/impl/RowBetweenCondition.java
index b239340..33920a3 100644
--- a/jOOQ/src/main/java/org/jooq/impl/RowBetweenCondition.java
+++ b/jOOQ/src/main/java/org/jooq/impl/RowBetweenCondition.java
@@ -701,7 +701,7 @@
 
         // These dialects either don't support row value expressions, or they
         // Can't handle row value expressions with the BETWEEN predicate
-        else if (row.getDegree() > 1 && asList(DERBY, FIREBIRD, ORACLE, SYBASE).contains(configuration.getDialect())) {
+        else if (row.getDegree() > 1 && asList(DERBY, FIREBIRD, ORACLE, SQLSERVER, SYBASE).contains(configuration.getDialect())) {
             Condition result = r.ge(min).and(r.le(max));
 
             if (not) {
