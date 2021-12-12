diff --git a/jOOQ/src/main/java/org/jooq/impl/RowCondition.java b/jOOQ/src/main/java/org/jooq/impl/RowCondition.java
index 42fde86..08158ab 100644
--- a/jOOQ/src/main/java/org/jooq/impl/RowCondition.java
+++ b/jOOQ/src/main/java/org/jooq/impl/RowCondition.java
@@ -124,7 +124,7 @@
 
         // Ordering comparison predicate simulation
         else if (asList(GREATER, GREATER_OR_EQUAL, LESS, LESS_OR_EQUAL).contains(comparator) &&
-                 asList(DERBY, CUBRID, FIREBIRD, ORACLE, SQLSERVER, SQLITE).contains(dialect)) {
+                 asList(DERBY, CUBRID, FIREBIRD, ORACLE, SQLSERVER, SQLITE, SYBASE).contains(dialect)) {
 
             // The order component of the comparator (stripping the equal component)
             Comparator order
