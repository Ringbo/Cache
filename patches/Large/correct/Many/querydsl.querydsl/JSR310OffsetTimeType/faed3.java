diff --git a/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310OffsetTimeType.java b/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310OffsetTimeType.java
index 40280a6..3398e17 100644
--- a/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310OffsetTimeType.java
+++ b/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310OffsetTimeType.java
@@ -20,7 +20,7 @@
 
     @Override
     public String getLiteral(OffsetTime value) {
-        return dateFormatter.format(value);
+        return timeFormatter.format(value);
     }
 
     @Override
