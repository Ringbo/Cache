diff --git a/querydsl-sql/src/main/java/com/mysema/query/sql/JDBCTypeMapping.java b/querydsl-sql/src/main/java/com/mysema/query/sql/JDBCTypeMapping.java
index bb655ea..80b7ebe 100644
--- a/querydsl-sql/src/main/java/com/mysema/query/sql/JDBCTypeMapping.java
+++ b/querydsl-sql/src/main/java/com/mysema/query/sql/JDBCTypeMapping.java
@@ -132,7 +132,7 @@
     
     @Nullable
     public Class<?> get(int sqlType, int size, int digits) {
-        if (sqlType == Types.NUMERIC) {
+        if (sqlType == Types.NUMERIC || sqlType == Types.DECIMAL) {
             return getNumericClass(size, digits);        
         } else if (types.containsKey(sqlType)) {
             return types.get(sqlType);
