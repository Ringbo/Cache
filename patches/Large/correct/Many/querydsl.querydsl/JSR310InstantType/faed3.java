diff --git a/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310InstantType.java b/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310InstantType.java
index c60157a..356742a 100644
--- a/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310InstantType.java
+++ b/querydsl-sql/src/main/java/com/querydsl/sql/types/JSR310InstantType.java
@@ -20,7 +20,7 @@
 
     @Override
     public String getLiteral(Instant value) {
-        return dateFormatter.format(value);
+        return dateTimeFormatter.format(value);
     }
 
     @Override
