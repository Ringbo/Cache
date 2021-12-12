diff --git a/src/main/org/codehaus/groovy/ast/expr/ListExpression.java b/src/main/org/codehaus/groovy/ast/expr/ListExpression.java
index c138ec5..ec8dc95 100644
--- a/src/main/org/codehaus/groovy/ast/expr/ListExpression.java
+++ b/src/main/org/codehaus/groovy/ast/expr/ListExpression.java
@@ -74,7 +74,7 @@
     }
 
     public String getText() {
-        StringBuffer buffer = new StringBuffer("[");
+        StringBuilder buffer = new StringBuilder("[");
         boolean first = true;
         for (Expression expression : expressions) {
             if (first) {
