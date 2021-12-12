diff --git a/jOOQ/src/main/java/org/jooq/impl/Pivot.java b/jOOQ/src/main/java/org/jooq/impl/Pivot.java
index f819051..2b317c3 100644
--- a/jOOQ/src/main/java/org/jooq/impl/Pivot.java
+++ b/jOOQ/src/main/java/org/jooq/impl/Pivot.java
@@ -221,7 +221,7 @@
             // Bind variables are not allowed inside of PIVOT clause
             boolean inline = context.inline();
             boolean declareFields = context.declareFields();
-            boolean declareTables = context.declareFields();
+            boolean declareTables = context.declareTables();
 
             context.declareTables(true)
                    .sql(table)
