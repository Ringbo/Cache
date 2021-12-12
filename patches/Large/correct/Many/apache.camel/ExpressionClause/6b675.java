diff --git a/camel-core/src/main/java/org/apache/camel/builder/ExpressionClause.java b/camel-core/src/main/java/org/apache/camel/builder/ExpressionClause.java
index 85edb58..64f3594 100644
--- a/camel-core/src/main/java/org/apache/camel/builder/ExpressionClause.java
+++ b/camel-core/src/main/java/org/apache/camel/builder/ExpressionClause.java
@@ -500,7 +500,7 @@
      * @return the builder to continue processing the DSL
      */
     public T tokenize(String token, boolean regex, int group) {
-        return delegate.tokenize(token, regex);
+        return delegate.tokenize(token, regex, group);
     }
 
     /**
