diff --git a/src/main/org/codehaus/groovy/ast/expr/ArrayExpression.java b/src/main/org/codehaus/groovy/ast/expr/ArrayExpression.java
index 21418ec..6098502 100644
--- a/src/main/org/codehaus/groovy/ast/expr/ArrayExpression.java
+++ b/src/main/org/codehaus/groovy/ast/expr/ArrayExpression.java
@@ -109,7 +109,7 @@
     }
 
     public String getText() {
-        StringBuffer buffer = new StringBuffer("[");
+        StringBuilder buffer = new StringBuilder("[");
         boolean first = true;
         for (Expression expression : expressions) {
             if (first) {
