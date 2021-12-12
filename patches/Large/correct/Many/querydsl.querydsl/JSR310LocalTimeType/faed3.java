diff --git a/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310LocalTimeType.java b/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310LocalTimeType.java
index bb4aa1e..78f0e01 100644
--- a/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310LocalTimeType.java
+++ b/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310LocalTimeType.java
@@ -21,7 +21,7 @@
 
     @Override
     public String getLiteral(LocalTime value) {
-        return dateFormatter.format(value);
+        return timeFormatter.format(value);
     }
 
     @Override
