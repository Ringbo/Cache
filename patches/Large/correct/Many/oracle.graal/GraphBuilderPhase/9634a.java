diff --git a/graal/com.oracle.graal.java/src/com/oracle/graal/java/GraphBuilderPhase.java b/graal/com.oracle.graal.java/src/com/oracle/graal/java/GraphBuilderPhase.java
index b539597..58c0134 100644
--- a/graal/com.oracle.graal.java/src/com/oracle/graal/java/GraphBuilderPhase.java
+++ b/graal/com.oracle.graal.java/src/com/oracle/graal/java/GraphBuilderPhase.java
@@ -829,7 +829,7 @@
         }
         BlockPlaceholderNode trueSucc = currentGraph.add(new BlockPlaceholderNode());
         BlockPlaceholderNode falseSucc = currentGraph.add(new BlockPlaceholderNode());
-        IfNode ifNode = currentGraph.add(new IfNode(currentGraph.unique(new IsNullNode(receiver)), trueSucc, falseSucc, 0.5));
+        IfNode ifNode = currentGraph.add(new IfNode(currentGraph.unique(new IsNullNode(receiver)), trueSucc, falseSucc, 0.1));
 
         append(ifNode);
         lastInstr = falseSucc;
@@ -855,7 +855,7 @@
     private void emitBoundsCheck(ValueNode index, ValueNode length) {
         BlockPlaceholderNode trueSucc = currentGraph.add(new BlockPlaceholderNode());
         BlockPlaceholderNode falseSucc = currentGraph.add(new BlockPlaceholderNode());
-        IfNode ifNode = currentGraph.add(new IfNode(currentGraph.unique(new IntegerBelowThanNode(index, length)), trueSucc, falseSucc, 0.5));
+        IfNode ifNode = currentGraph.add(new IfNode(currentGraph.unique(new IntegerBelowThanNode(index, length)), trueSucc, falseSucc, 0.9));
 
         append(ifNode);
         lastInstr = trueSucc;
