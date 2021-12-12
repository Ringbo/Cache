diff --git a/android/guava/src/com/google/common/graph/UndirectedMultiNetworkConnections.java b/android/guava/src/com/google/common/graph/UndirectedMultiNetworkConnections.java
index 5be379e..431e724 100755
--- a/android/guava/src/com/google/common/graph/UndirectedMultiNetworkConnections.java
+++ b/android/guava/src/com/google/common/graph/UndirectedMultiNetworkConnections.java
@@ -83,7 +83,7 @@
   }
 
   @Override
-  public N removeInEdge(Object edge, boolean isSelfLoop) {
+  public N removeInEdge(E edge, boolean isSelfLoop) {
     if (!isSelfLoop) {
       return removeOutEdge(edge);
     }
@@ -91,7 +91,7 @@
   }
 
   @Override
-  public N removeOutEdge(Object edge) {
+  public N removeOutEdge(E edge) {
     N node = super.removeOutEdge(edge);
     Multiset<N> adjacentNodes = getReference(adjacentNodesReference);
     if (adjacentNodes != null) {
