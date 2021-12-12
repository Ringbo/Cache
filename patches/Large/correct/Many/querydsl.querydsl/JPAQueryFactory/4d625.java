diff --git a/querydsl-jpa/src/main/java/com/querydsl/jpa/impl/JPAQueryFactory.java b/querydsl-jpa/src/main/java/com/querydsl/jpa/impl/JPAQueryFactory.java
index 38a80cb..1de0154 100644
--- a/querydsl-jpa/src/main/java/com/querydsl/jpa/impl/JPAQueryFactory.java
+++ b/querydsl-jpa/src/main/java/com/querydsl/jpa/impl/JPAQueryFactory.java
@@ -118,7 +118,7 @@
     }
 
     @Override
-    public JPQLQuery<?> from(EntityPath<?>... from) {
+    public JPAQuery<?> from(EntityPath<?>... from) {
         return query().from(from);
     }
 
