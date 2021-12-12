diff --git a/android/guava/src/com/google/common/graph/DirectedMultiNetworkConnections.java b/android/guava/src/com/google/common/graph/DirectedMultiNetworkConnections.java
index e204a71..d882f30 100755
--- a/android/guava/src/com/google/common/graph/DirectedMultiNetworkConnections.java
+++ b/android/guava/src/com/google/common/graph/DirectedMultiNetworkConnections.java
@@ -104,7 +104,7 @@
   }
 
   @Override
-  public N removeInEdge(Object edge, boolean isSelfLoop) {
+  public N removeInEdge(E edge, boolean isSelfLoop) {
     N node = super.removeInEdge(edge, isSelfLoop);
     Multiset<N> predecessors = getReference(predecessorsReference);
     if (predecessors != null) {
@@ -114,7 +114,7 @@
   }
 
   @Override
-  public N removeOutEdge(Object edge) {
+  public N removeOutEdge(E edge) {
     N node = super.removeOutEdge(edge);
     Multiset<N> successors = getReference(successorsReference);
     if (successors != null) {
