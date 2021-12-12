diff --git a/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310OffsetDateTimeType.java b/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310OffsetDateTimeType.java
index 868b171..ae05c7c 100644
--- a/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310OffsetDateTimeType.java
+++ b/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310OffsetDateTimeType.java
@@ -21,7 +21,7 @@
 
     @Override
     public String getLiteral(OffsetDateTime value) {
-        return dateFormatter.format(value);
+        return dateTimeFormatter.format(value);
     }
 
     @Override
