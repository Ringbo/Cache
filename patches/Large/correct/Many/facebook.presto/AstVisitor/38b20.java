diff --git a/presto-parser/src/main/java/com/facebook/presto/sql/tree/AstVisitor.java b/presto-parser/src/main/java/com/facebook/presto/sql/tree/AstVisitor.java
index dfd7d87..88c596d 100644
--- a/presto-parser/src/main/java/com/facebook/presto/sql/tree/AstVisitor.java
+++ b/presto-parser/src/main/java/com/facebook/presto/sql/tree/AstVisitor.java
@@ -389,11 +389,11 @@
 
     protected R visitCreateTable(CreateTable node, C context)
     {
-        return visitNode(node, context);
+        return visitStatement(node, context);
     }
 
     protected R visitDropTable(DropTable node, C context)
     {
-        return visitNode(node, context);
+        return visitStatement(node, context);
     }
 }
