diff --git a/jOOQ/src/main/java/org/jooq/impl/DSL.java b/jOOQ/src/main/java/org/jooq/impl/DSL.java
index 29ccc68..a7952b6 100644
--- a/jOOQ/src/main/java/org/jooq/impl/DSL.java
+++ b/jOOQ/src/main/java/org/jooq/impl/DSL.java
@@ -7642,7 +7642,7 @@
      */
     @Support
     public static <T> Field<T> cast(Object value, DataType<T> type) {
-        return Utils.field(value, type).cast(type);
+        return Utils.field(value).cast(type);
     }
 
     /**
