diff --git a/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310ZonedDateTimeType.java b/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310ZonedDateTimeType.java
index 29a8bdb..f6266aa 100644
--- a/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310ZonedDateTimeType.java
+++ b/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310ZonedDateTimeType.java
@@ -21,7 +21,7 @@
 
     @Override
     public String getLiteral(ZonedDateTime value) {
-        return dateFormatter.format(value);
+        return dateTimeFormatter.format(value);
     }
 
     @Override
