diff --git a/jOOQ/src/main/java/org/jooq/InsertOnConflictWhereStep.java b/jOOQ/src/main/java/org/jooq/InsertOnConflictWhereStep.java
index c09688c..57aed2a 100644
--- a/jOOQ/src/main/java/org/jooq/InsertOnConflictWhereStep.java
+++ b/jOOQ/src/main/java/org/jooq/InsertOnConflictWhereStep.java
@@ -57,27 +57,27 @@
  *
  * @author Lukas Eder
  */
-public interface InsertOnConflictWhereStep<R extends Record> extends InsertFinalStep<R> {
+public interface InsertOnConflictWhereStep<R extends Record> extends InsertReturningStep<R> {
 
     /**
      * Add a <code>WHERE</code> clause to the query, connecting them with each
      * other with {@link Operator#AND}.
      */
     @Support({ POSTGRES_9_5 })
-    InsertFinalStep<R> where(Condition... conditions);
+    InsertReturningStep<R> where(Condition... conditions);
 
     /**
      * Add a <code>WHERE</code> clause to the query, connecting them with each
      * other with {@link Operator#AND}.
      */
     @Support({ POSTGRES_9_5 })
-    InsertFinalStep<R> where(Collection<? extends Condition> conditions);
+    InsertReturningStep<R> where(Collection<? extends Condition> conditions);
 
     /**
      * Add a <code>WHERE</code> clause to the query.
      */
     @Support({ POSTGRES_9_5 })
-    InsertFinalStep<R> where(Field<Boolean> field);
+    InsertReturningStep<R> where(Field<Boolean> field);
 
     /**
      * Add a <code>WHERE</code> clause to the query.
@@ -92,7 +92,7 @@
      */
     @Support({ POSTGRES_9_5 })
     @PlainSQL
-    InsertFinalStep<R> where(SQL sql);
+    InsertReturningStep<R> where(SQL sql);
 
     /**
      * Add a <code>WHERE</code> clause to the query.
@@ -107,7 +107,7 @@
      */
     @Support({ POSTGRES_9_5 })
     @PlainSQL
-    InsertFinalStep<R> where(String sql);
+    InsertReturningStep<R> where(String sql);
 
     /**
      * Add a <code>WHERE</code> clause to the query.
@@ -123,7 +123,7 @@
      */
     @Support({ POSTGRES_9_5 })
     @PlainSQL
-    InsertFinalStep<R> where(String sql, Object... bindings);
+    InsertReturningStep<R> where(String sql, Object... bindings);
 
     /**
      * Add a <code>WHERE</code> clause to the query.
@@ -139,17 +139,17 @@
      */
     @Support({ POSTGRES_9_5 })
     @PlainSQL
-    InsertFinalStep<R> where(String sql, QueryPart... parts);
+    InsertReturningStep<R> where(String sql, QueryPart... parts);
 
     /**
      * Add a <code>WHERE EXISTS</code> clause to the query.
      */
     @Support({ POSTGRES_9_5 })
-    InsertFinalStep<R> whereExists(Select<?> select);
+    InsertReturningStep<R> whereExists(Select<?> select);
 
     /**
      * Add a <code>WHERE NOT EXISTS</code> clause to the query.
      */
     @Support({ POSTGRES_9_5 })
-    InsertFinalStep<R> whereNotExists(Select<?> select);
+    InsertReturningStep<R> whereNotExists(Select<?> select);
 }
