diff --git a/src/main/org/codehaus/groovy/ast/expr/ClosureListExpression.java b/src/main/org/codehaus/groovy/ast/expr/ClosureListExpression.java
index 8a6f64a..82d687a 100644
--- a/src/main/org/codehaus/groovy/ast/expr/ClosureListExpression.java
+++ b/src/main/org/codehaus/groovy/ast/expr/ClosureListExpression.java
@@ -69,7 +69,7 @@
     }
     
     public String getText() {
-        StringBuffer buffer = new StringBuffer("(");
+        StringBuilder buffer = new StringBuilder("(");
         boolean first = true;
         for (Expression expression : getExpressions()) {
             if (first) {
