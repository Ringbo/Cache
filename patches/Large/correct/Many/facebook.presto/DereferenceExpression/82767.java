diff --git a/presto-parser/src/main/java/com/facebook/presto/sql/tree/DereferenceExpression.java b/presto-parser/src/main/java/com/facebook/presto/sql/tree/DereferenceExpression.java
index 351759b..d0624f7 100644
--- a/presto-parser/src/main/java/com/facebook/presto/sql/tree/DereferenceExpression.java
+++ b/presto-parser/src/main/java/com/facebook/presto/sql/tree/DereferenceExpression.java
@@ -56,7 +56,7 @@
     @Override
     public List<Node> getChildren()
     {
-        return ImmutableList.of();
+        return ImmutableList.of(base);
     }
 
     public Expression getBase()
