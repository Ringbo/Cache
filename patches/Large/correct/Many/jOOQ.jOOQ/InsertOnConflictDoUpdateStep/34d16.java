diff --git a/jOOQ/src/main/java/org/jooq/InsertOnConflictDoUpdateStep.java b/jOOQ/src/main/java/org/jooq/InsertOnConflictDoUpdateStep.java
index 9452290..1b32f51 100644
--- a/jOOQ/src/main/java/org/jooq/InsertOnConflictDoUpdateStep.java
+++ b/jOOQ/src/main/java/org/jooq/InsertOnConflictDoUpdateStep.java
@@ -66,5 +66,5 @@
      * Add the <code>DO IGNORE</code> clause.
      */
     @Support({ POSTGRES_9_5 })
-    InsertFinalStep<R> doNothing();
+    InsertReturningStep<R> doNothing();
 }
