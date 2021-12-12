diff --git a/graal/com.oracle.graal.java/src/com/oracle/graal/java/GraphBuilderPhase.java b/graal/com.oracle.graal.java/src/com/oracle/graal/java/GraphBuilderPhase.java
index bdfaf42..6aab464 100644
--- a/graal/com.oracle.graal.java/src/com/oracle/graal/java/GraphBuilderPhase.java
+++ b/graal/com.oracle.graal.java/src/com/oracle/graal/java/GraphBuilderPhase.java
@@ -653,7 +653,7 @@
         } else {
             BlockPlaceholderNode successor = currentGraph.add(new BlockPlaceholderNode());
             DeoptimizeNode deopt = currentGraph.add(new DeoptimizeNode(DeoptimizationAction.InvalidateRecompile, DeoptimizationReason.Unresolved, graphId));
-            IfNode ifNode = currentGraph.add(new IfNode(currentGraph.unique(new IsNullNode(object)), successor, deopt, 0, graphId));
+            IfNode ifNode = currentGraph.add(new IfNode(currentGraph.unique(new IsNullNode(object)), successor, deopt, 1, graphId));
             append(ifNode);
             lastInstr = successor;
             frameState.ipush(appendConstant(Constant.INT_0));
@@ -757,7 +757,7 @@
     private void emitNullCheck(ValueNode receiver) {
         BlockPlaceholderNode trueSucc = currentGraph.add(new BlockPlaceholderNode());
         BlockPlaceholderNode falseSucc = currentGraph.add(new BlockPlaceholderNode());
-        IfNode ifNode = currentGraph.add(new IfNode(currentGraph.unique(new IsNullNode(receiver)), trueSucc, falseSucc, 1, graphId));
+        IfNode ifNode = currentGraph.add(new IfNode(currentGraph.unique(new IsNullNode(receiver)), trueSucc, falseSucc, 0.5, graphId));
 
         append(ifNode);
         lastInstr = falseSucc;
@@ -776,7 +776,7 @@
     private void emitBoundsCheck(ValueNode index, ValueNode length) {
         BlockPlaceholderNode trueSucc = currentGraph.add(new BlockPlaceholderNode());
         BlockPlaceholderNode falseSucc = currentGraph.add(new BlockPlaceholderNode());
-        IfNode ifNode = currentGraph.add(new IfNode(currentGraph.unique(new IntegerBelowThanNode(index, length)), trueSucc, falseSucc, 1, graphId));
+        IfNode ifNode = currentGraph.add(new IfNode(currentGraph.unique(new IntegerBelowThanNode(index, length)), trueSucc, falseSucc, 0.5, graphId));
 
         append(ifNode);
         lastInstr = trueSucc;
