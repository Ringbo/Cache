diff --git a/src/main/org/codehaus/groovy/antlr/AntlrParserPlugin.java b/src/main/org/codehaus/groovy/antlr/AntlrParserPlugin.java
index 70c01f0..be2a31d 100644
--- a/src/main/org/codehaus/groovy/antlr/AntlrParserPlugin.java
+++ b/src/main/org/codehaus/groovy/antlr/AntlrParserPlugin.java
@@ -2037,14 +2037,14 @@
         Expression leftExpression = expression(leftNode);
 
         AST rightNode = leftNode.getNextSibling();
-        ClassNode type = buildName(rightNode);
+        ClassNode type = makeTypeWithArguments(rightNode);
 
         return CastExpression.asExpression(type, leftExpression);
     }
 
     protected Expression castExpression(AST castNode) {
         AST node = castNode.getFirstChild();
-        ClassNode type = buildName(node);
+        ClassNode type = makeTypeWithArguments(node);
         assertTypeNotNull(type, node);
 
         AST expressionNode = node.getNextSibling();
