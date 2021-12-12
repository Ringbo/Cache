diff --git a/querydsl-sql/src/main/java/com/mysema/query/sql/AbstractSQLSubQuery.java b/querydsl-sql/src/main/java/com/mysema/query/sql/AbstractSQLSubQuery.java
index de59587..632b11f 100644
--- a/querydsl-sql/src/main/java/com/mysema/query/sql/AbstractSQLSubQuery.java
+++ b/querydsl-sql/src/main/java/com/mysema/query/sql/AbstractSQLSubQuery.java
@@ -165,11 +165,11 @@
     }
 
     public Q rightJoin(RelationalPath<?> target) {
-        return queryMixin.leftJoin(target);
+        return queryMixin.rightJoin(target);
     }
 
     public Q rightJoin(SubQueryExpression<?> target, Path<?> alias) {
-        return queryMixin.leftJoin(target, alias);
+        return queryMixin.rightJoin(target, alias);
     }
 
     @Override
