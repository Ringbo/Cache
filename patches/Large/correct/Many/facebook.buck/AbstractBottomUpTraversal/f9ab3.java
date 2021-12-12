diff --git a/src/com/facebook/buck/graph/AbstractBottomUpTraversal.java b/src/com/facebook/buck/graph/AbstractBottomUpTraversal.java
index 825c3fb..e363ab7 100644
--- a/src/com/facebook/buck/graph/AbstractBottomUpTraversal.java
+++ b/src/com/facebook/buck/graph/AbstractBottomUpTraversal.java
@@ -31,7 +31,7 @@
  * Class that performs a "bottom-up" traversal of a DAG. For any given node, every node to which it
  * has an outgoing edge will be visited before the given node.
  */
-public abstract class AbstractBottomUpTraversal<T, V> {
+public abstract class AbstractBottomUpTraversal<T, E extends Throwable> {
 
   private final TraversableGraph<T> graph;
 
@@ -49,7 +49,7 @@
     this.effectiveOutDegreesOfExplorableNodes = Maps.newHashMap();
   }
 
-  public final void traverse() {
+  public final void traverse() throws E {
     Iterables.addAll(nodesToExplore, graph.getNodesWithNoOutgoingEdges());
     while (!nodesToExplore.isEmpty()) {
       T node = nodesToExplore.remove();
@@ -80,6 +80,6 @@
     }
   }
 
-  public abstract void visit(T node);
+  public abstract void visit(T node) throws E;
 
 }
