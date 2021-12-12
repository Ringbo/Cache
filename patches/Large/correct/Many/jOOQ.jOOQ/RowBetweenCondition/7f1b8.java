diff --git a/jOOQ/src/main/java/org/jooq/impl/RowBetweenCondition.java b/jOOQ/src/main/java/org/jooq/impl/RowBetweenCondition.java
index 6a56e66..3609a58 100644
--- a/jOOQ/src/main/java/org/jooq/impl/RowBetweenCondition.java
+++ b/jOOQ/src/main/java/org/jooq/impl/RowBetweenCondition.java
@@ -690,7 +690,7 @@
         RowN max = (RowN) maxValue;
 
         // These dialects don't support the SYMMETRIC keyword at all
-        if (symmetric && asList(ASE, CUBRID, DB2, DERBY, FIREBIRD, H2, MYSQL, ORACLE, SQLSERVER, SQLITE, SYBASE).contains(configuration.getDialect())) {
+        if (symmetric && asList(ASE, CUBRID, DB2, DERBY, FIREBIRD, H2, MYSQL, ORACLE, SQLITE, SQLSERVER, SYBASE).contains(configuration.getDialect())) {
             if (not) {
                 return (QueryPartInternal) r.notBetween(min, max).and(r.notBetween(max, min));
             }
@@ -701,7 +701,7 @@
 
         // These dialects either don't support row value expressions, or they
         // Can't handle row value expressions with the BETWEEN predicate
-        else if (row.getDegree() > 1 && asList(CUBRID, DERBY, FIREBIRD, ORACLE, SQLSERVER, SYBASE).contains(configuration.getDialect())) {
+        else if (row.getDegree() > 1 && asList(CUBRID, DERBY, FIREBIRD, ORACLE, SQLITE, SQLSERVER, SYBASE).contains(configuration.getDialect())) {
             Condition result = r.ge(min).and(r.le(max));
 
             if (not) {
