diff --git a/presto-main/src/main/java/com/facebook/presto/sql/planner/planPrinter/PlanPrinter.java b/presto-main/src/main/java/com/facebook/presto/sql/planner/planPrinter/PlanPrinter.java
index 1e1223d..3aad8bc 100644
--- a/presto-main/src/main/java/com/facebook/presto/sql/planner/planPrinter/PlanPrinter.java
+++ b/presto-main/src/main/java/com/facebook/presto/sql/planner/planPrinter/PlanPrinter.java
@@ -727,7 +727,13 @@
                     .map(PlanNode::getId)
                     .collect(toList());
 
-            NodeRepresentation nodeOutput = addNode(node, operatorName, format(formatString, arguments.toArray(new Object[0])), allNodes, ImmutableList.of(), ImmutableList.of());
+            NodeRepresentation nodeOutput = addNode(
+                    node,
+                    operatorName,
+                    format(formatString, arguments.toArray(new Object[0])),
+                    allNodes,
+                    ImmutableList.of(sourceNode),
+                    ImmutableList.of());
 
             if (projectNode.isPresent()) {
                 printAssignments(nodeOutput, projectNode.get().getAssignments());
