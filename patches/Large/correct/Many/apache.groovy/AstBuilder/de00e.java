diff --git a/src/main/org/codehaus/groovy/syntax/parser/ASTBuilder.java b/src/main/org/codehaus/groovy/syntax/parser/ASTBuilder.java
index 4ed670f..116b09d 100644
--- a/src/main/org/codehaus/groovy/syntax/parser/ASTBuilder.java
+++ b/src/main/org/codehaus/groovy/syntax/parser/ASTBuilder.java
@@ -456,7 +456,7 @@
 
     protected BlockStatement statementBlock(CSTNode blockRoot) throws ParserException
     {
-        if (blockRoot.getToken().getType() == Token.LEFT_CURLY_BRACE) 
+        if (blockRoot.getToken() == null || blockRoot.getToken().getType() == Token.LEFT_CURLY_BRACE) 
         {    
             return statementBlock(blockRoot, 0);
         }
