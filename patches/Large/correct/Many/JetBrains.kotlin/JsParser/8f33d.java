diff --git a/js/js.parser/src/com/google/gwt/dev/js/JsParser.java b/js/js.parser/src/com/google/gwt/dev/js/JsParser.java
index 7e38c48..e18a238 100644
--- a/js/js.parser/src/com/google/gwt/dev/js/JsParser.java
+++ b/js/js.parser/src/com/google/gwt/dev/js/JsParser.java
@@ -120,7 +120,7 @@
                 return null;
 
             case TokenStream.EXPRSTMT:
-                return mapExprStmt(node);
+                return mapExpressionStatement(node);
 
             case TokenStream.REGEXP:
                 return mapRegExp(node);
@@ -513,7 +513,7 @@
         }
     }
 
-    private JsExprStmt mapExprStmt(Node node) throws JsParserException {
+    private JsStatement mapExpressionStatement(Node node) throws JsParserException {
         JsExpression expr = mapExpression(node.getFirstChild());
         return expr.makeStmt();
     }
