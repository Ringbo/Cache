diff --git a/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/NodeGenFactory.java b/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/NodeGenFactory.java
index 7bc58c3..eacf47d 100644
--- a/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/NodeGenFactory.java
+++ b/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/NodeGenFactory.java
@@ -2125,8 +2125,7 @@
         return new CodeTree[]{expressionBuilder.build(), assertionBuilder.build()};
     }
 
-    private Map<Variable, CodeTree> castBoundTypes(Map<Variable, LocalVariable> bindings) {
-
+    private static Map<Variable, CodeTree> castBoundTypes(Map<Variable, LocalVariable> bindings) {
         Map<Variable, CodeTree> resolvedBindings = new HashMap<>();
         for (Variable variable : bindings.keySet()) {
             LocalVariable localVariable = bindings.get(variable);
