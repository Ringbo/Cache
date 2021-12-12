diff --git a/android/guava/src/com/google/common/graph/AbstractUndirectedNetworkConnections.java b/android/guava/src/com/google/common/graph/AbstractUndirectedNetworkConnections.java
index e06c6b4..03279d0 100755
--- a/android/guava/src/com/google/common/graph/AbstractUndirectedNetworkConnections.java
+++ b/android/guava/src/com/google/common/graph/AbstractUndirectedNetworkConnections.java
@@ -64,12 +64,12 @@
   }
 
   @Override
-  public N oppositeNode(Object edge) {
+  public N adjacentNode(E edge) {
     return checkNotNull(incidentEdgeMap.get(edge));
   }
 
   @Override
-  public N removeInEdge(Object edge, boolean isSelfLoop) {
+  public N removeInEdge(E edge, boolean isSelfLoop) {
     if (!isSelfLoop) {
       return removeOutEdge(edge);
     }
@@ -77,7 +77,7 @@
   }
 
   @Override
-  public N removeOutEdge(Object edge) {
+  public N removeOutEdge(E edge) {
     N previousNode = incidentEdgeMap.remove(edge);
     return checkNotNull(previousNode);
   }
