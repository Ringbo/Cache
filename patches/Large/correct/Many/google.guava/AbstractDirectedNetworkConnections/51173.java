diff --git a/android/guava/src/com/google/common/graph/AbstractDirectedNetworkConnections.java b/android/guava/src/com/google/common/graph/AbstractDirectedNetworkConnections.java
index 2ba48ba..db4d675 100755
--- a/android/guava/src/com/google/common/graph/AbstractDirectedNetworkConnections.java
+++ b/android/guava/src/com/google/common/graph/AbstractDirectedNetworkConnections.java
@@ -96,14 +96,14 @@
   }
 
   @Override
-  public N oppositeNode(Object edge) {
+  public N adjacentNode(E edge) {
     // Since the reference node is defined to be 'source' for directed graphs,
     // we can assume this edge lives in the set of outgoing edges.
     return checkNotNull(outEdgeMap.get(edge));
   }
 
   @Override
-  public N removeInEdge(Object edge, boolean isSelfLoop) {
+  public N removeInEdge(E edge, boolean isSelfLoop) {
     if (isSelfLoop) {
       checkNonNegative(--selfLoopCount);
     }
@@ -112,7 +112,7 @@
   }
 
   @Override
-  public N removeOutEdge(Object edge) {
+  public N removeOutEdge(E edge) {
     N previousNode = outEdgeMap.remove(edge);
     return checkNotNull(previousNode);
   }
