diff --git a/querydsl-core/src/main/java/com/querydsl/core/support/FetchableSubQueryBase.java b/querydsl-core/src/main/java/com/querydsl/core/support/FetchableSubQueryBase.java
index ed4baba..d42b4ad 100644
--- a/querydsl-core/src/main/java/com/querydsl/core/support/FetchableSubQueryBase.java
+++ b/querydsl-core/src/main/java/com/querydsl/core/support/FetchableSubQueryBase.java
@@ -76,7 +76,7 @@
 
     @Override
     public BooleanExpression ne(T constant) {
-        return eq(Expressions.constant(constant));
+        return ne(Expressions.constant(constant));
     }
 
 
