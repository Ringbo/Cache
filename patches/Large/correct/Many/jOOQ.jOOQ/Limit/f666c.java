diff --git a/jOOQ/src/main/java/org/jooq/impl/Limit.java b/jOOQ/src/main/java/org/jooq/impl/Limit.java
index 7204ba3..34b227b 100644
--- a/jOOQ/src/main/java/org/jooq/impl/Limit.java
+++ b/jOOQ/src/main/java/org/jooq/impl/Limit.java
@@ -342,7 +342,7 @@
      * The upper bound, such that ROW_NUMBER() &lt;= getUpperRownum()
      */
     final Field<Integer> getUpperRownum() {
-        return offsetOrZero.add(numberOfRows);
+        return offsetOrZero.add(numberOfRowsOrMax);
     }
 
     /**
