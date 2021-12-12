diff --git a/querydsl-sql/src/test/java/com/querydsl/sql/postgresql/PostgreSQLQueryTest.java b/querydsl-sql/src/test/java/com/querydsl/sql/postgresql/PostgreSQLQueryTest.java
index 1976f7c..264dfc6 100644
--- a/querydsl-sql/src/test/java/com/querydsl/sql/postgresql/PostgreSQLQueryTest.java
+++ b/querydsl-sql/src/test/java/com/querydsl/sql/postgresql/PostgreSQLQueryTest.java
@@ -26,7 +26,7 @@
     public void Syntax() {
 //        [ WITH [ RECURSIVE ] with_query [, ...] ]
 //        SELECT [ ALL | DISTINCT [ ON ( expression [, ...] ) ] ]
-        query.distinct(survey.name);
+        query.distinctOn(survey.name);
 //            * | expression [ [ AS ] output_name ] [, ...]
 //            [ FROM from_item [, ...] ]
         query.from(survey);
@@ -92,7 +92,7 @@
     @Test
     public void Distinct_On() {
         query.from(employee)
-            .distinct(employee.datefield, employee.timefield)
+            .distinctOn(employee.datefield, employee.timefield)
             .orderBy(employee.datefield.asc(), employee.timefield.asc(), employee.salary.asc())
             .select(employee.id);
 
