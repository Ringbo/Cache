diff --git a/jOOQ/src/main/java/org/jooq/InsertOnDuplicateStep.java b/jOOQ/src/main/java/org/jooq/InsertOnDuplicateStep.java
index e208fe7..6690479 100644
--- a/jOOQ/src/main/java/org/jooq/InsertOnDuplicateStep.java
+++ b/jOOQ/src/main/java/org/jooq/InsertOnDuplicateStep.java
@@ -82,7 +82,7 @@
      * Add an <code>ON CONFLICT DO NOTHING</code> clause to this insert query.
      */
     @Support({ POSTGRES_9_5 })
-    InsertFinalStep<R> onConflictDoNothing();
+    InsertReturningStep<R> onConflictDoNothing();
 
     /**
      * Add an <code>ON DUPLICATE KEY UPDATE</code> clause to this insert query.
@@ -160,5 +160,5 @@
      * </table>
      */
     @Support
-    InsertFinalStep<R> onDuplicateKeyIgnore();
+    InsertReturningStep<R> onDuplicateKeyIgnore();
 }
