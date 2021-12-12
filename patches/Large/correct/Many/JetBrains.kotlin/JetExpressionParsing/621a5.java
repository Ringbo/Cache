diff --git a/idea/src/org/jetbrains/jet/lang/parsing/JetExpressionParsing.java b/idea/src/org/jetbrains/jet/lang/parsing/JetExpressionParsing.java
index 6eb3050..25f4ff4 100644
--- a/idea/src/org/jetbrains/jet/lang/parsing/JetExpressionParsing.java
+++ b/idea/src/org/jetbrains/jet/lang/parsing/JetExpressionParsing.java
@@ -416,7 +416,7 @@
         }
 
         expect(DOUBLE_ARROW, "Expecting '=>'", TokenSet.create(RBRACE));
-        myBuilder.enableEols();
+        myBuilder.restoreEolsState();
 
         parseExpression();
 
