diff --git a/querydsl-core/src/main/java/com/mysema/query/types/expr/NumberExpression.java b/querydsl-core/src/main/java/com/mysema/query/types/expr/NumberExpression.java
index 3c7e88e..720bc8c 100644
--- a/querydsl-core/src/main/java/com/mysema/query/types/expr/NumberExpression.java
+++ b/querydsl-core/src/main/java/com/mysema/query/types/expr/NumberExpression.java
@@ -151,7 +151,7 @@
     @SuppressWarnings("unchecked")
     private T cast(Number number) {
         Class<T> type = (Class<T>) getType();
-        if (type.equals(number.getClass())) {
+        if (type.isAssignableFrom(number.getClass())) {
             return (T) number;
         } else if (Byte.class.equals(type)) {
             return (T) Byte.valueOf(number.byteValue());
