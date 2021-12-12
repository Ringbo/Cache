diff --git a/jOOQ/src/main/java/org/jooq/impl/Val.java b/jOOQ/src/main/java/org/jooq/impl/Val.java
index 0644668..6290fc3 100644
--- a/jOOQ/src/main/java/org/jooq/impl/Val.java
+++ b/jOOQ/src/main/java/org/jooq/impl/Val.java
@@ -170,8 +170,9 @@
 
         // [#1029] Postgres generally doesn't need the casting. Only in the
         // above case where the type is OTHER
-        // [#1125] TODO Also with temporal data types, casting is needed some times
-        else if (context.getDialect() == POSTGRES /* && !type.isTemporal() */) {
+        // [#1125] Also with temporal data types, casting is needed some times
+        // [#1130] TODO type can be null for ARRAY types, etc.
+        else if (context.getDialect() == POSTGRES && (type == null || !type.isTemporal())) {
             toSQL(context, getValue(), getType());
         }
 
