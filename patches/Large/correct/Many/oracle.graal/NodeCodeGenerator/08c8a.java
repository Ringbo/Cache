diff --git a/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/node/NodeCodeGenerator.java b/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/node/NodeCodeGenerator.java
index 61346fd..20337ac 100644
--- a/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/node/NodeCodeGenerator.java
+++ b/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/node/NodeCodeGenerator.java
@@ -2134,7 +2134,7 @@
 
             CodeTree expression;
             if (sourceType == null) {
-                ExecutableTypeData targetExecutable = resolveExecutableType(child, targetType);
+                ExecutableTypeData targetExecutable = resolveExecutableType(child, castSourceType);
                 expression = createExecuteChildExpression(parent, child, targetParameter, targetExecutable, unexpectedParameter);
                 sourceType = targetExecutable.getType();
             } else {
