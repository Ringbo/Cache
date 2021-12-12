diff --git a/src/main/org/codehaus/groovy/antlr/AntlrParserPlugin.java b/src/main/org/codehaus/groovy/antlr/AntlrParserPlugin.java
index 64996de..31f9ada 100644
--- a/src/main/org/codehaus/groovy/antlr/AntlrParserPlugin.java
+++ b/src/main/org/codehaus/groovy/antlr/AntlrParserPlugin.java
@@ -719,7 +719,7 @@
     protected Statement methodCall(AST code) {
         Expression expression = methodCallExpression(code);
         ExpressionStatement expressionStatement = new ExpressionStatement(expression);
-        configureAST(classNode, code);
+        configureAST(expressionStatement, code);
         return expressionStatement;
     }
 
