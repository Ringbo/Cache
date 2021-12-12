diff --git a/presto-main/src/main/java/com/facebook/presto/sql/analyzer/ExpressionAnalyzer.java b/presto-main/src/main/java/com/facebook/presto/sql/analyzer/ExpressionAnalyzer.java
index 72bc913..d2e24c0 100644
--- a/presto-main/src/main/java/com/facebook/presto/sql/analyzer/ExpressionAnalyzer.java
+++ b/presto-main/src/main/java/com/facebook/presto/sql/analyzer/ExpressionAnalyzer.java
@@ -869,7 +869,7 @@
                 operatorSignature = functionRegistry.resolveOperator(operatorType, argumentTypes.build());
             }
             catch (OperatorNotFoundException e) {
-                throw new SemanticException(TYPE_MISMATCH, node, e.getMessage());
+                throw new SemanticException(TYPE_MISMATCH, node, "%s", e.getMessage());
             }
 
             for (int i = 0; i < arguments.length; i++) {
