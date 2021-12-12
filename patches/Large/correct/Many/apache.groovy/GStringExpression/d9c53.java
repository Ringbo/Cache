diff --git a/src/main/org/codehaus/groovy/ast/expr/GStringExpression.java b/src/main/org/codehaus/groovy/ast/expr/GStringExpression.java
index 31f53e3..a382f9c 100644
--- a/src/main/org/codehaus/groovy/ast/expr/GStringExpression.java
+++ b/src/main/org/codehaus/groovy/ast/expr/GStringExpression.java
@@ -100,7 +100,7 @@
     }
 
     public Expression asConstantString() {
-        StringBuffer buffer = new StringBuffer();
+        StringBuilder buffer = new StringBuilder();
         for (ConstantExpression expression : strings) {
             Object value = expression.getValue();
             if (value != null) {
