diff --git a/jOOQ/src/main/java/org/jooq/MergeNotMatchedSetStep.java b/jOOQ/src/main/java/org/jooq/MergeNotMatchedSetStep.java
index 541ccf5..613dcbe 100644
--- a/jOOQ/src/main/java/org/jooq/MergeNotMatchedSetStep.java
+++ b/jOOQ/src/main/java/org/jooq/MergeNotMatchedSetStep.java
@@ -84,7 +84,7 @@
      * <code>WHEN NOT MATCHED</INSERT> clause.
      */
     @Support({ CUBRID, DB2, HSQLDB, ORACLE, SQLSERVER, SYBASE })
-    <T> MergeMatchedSetMoreStep<R> set(Field<T> field, Select<? extends Record1<T>> value);
+    <T> MergeNotMatchedSetMoreStep<R> set(Field<T> field, Select<? extends Record1<T>> value);
 
     /**
      * Set multiple values for <code>INSERT</code> in the <code>MERGE</code>
