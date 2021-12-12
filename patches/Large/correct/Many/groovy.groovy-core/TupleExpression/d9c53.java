diff --git a/src/main/org/codehaus/groovy/ast/expr/TupleExpression.java b/src/main/org/codehaus/groovy/ast/expr/TupleExpression.java
index 9834a97..9ecba73 100644
--- a/src/main/org/codehaus/groovy/ast/expr/TupleExpression.java
+++ b/src/main/org/codehaus/groovy/ast/expr/TupleExpression.java
@@ -88,7 +88,7 @@
     }
 
     public String getText() {
-        StringBuffer buffer = new StringBuffer("(");
+        StringBuilder buffer = new StringBuilder("(");
         boolean first = true;
         for (Expression expression : expressions) {
             if (first) {
