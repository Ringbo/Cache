diff --git a/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310LocalDateTimeType.java b/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310LocalDateTimeType.java
index e0957ed..448c827 100644
--- a/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310LocalDateTimeType.java
+++ b/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310LocalDateTimeType.java
@@ -21,7 +21,7 @@
 
     @Override
     public String getLiteral(LocalDateTime value) {
-        return dateFormatter.format(value);
+        return dateTimeFormatter.format(value);
     }
 
     @Override
