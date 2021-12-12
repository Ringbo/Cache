diff --git a/android/guava/src/com/google/common/graph/NetworkConnections.java b/android/guava/src/com/google/common/graph/NetworkConnections.java
index a9ea9f2..16a68d6 100755
--- a/android/guava/src/com/google/common/graph/NetworkConnections.java
+++ b/android/guava/src/com/google/common/graph/NetworkConnections.java
@@ -48,11 +48,11 @@
   Set<E> edgesConnecting(N node);
 
   /**
-   * Returns the node that is opposite the origin node along {@code edge}.
+   * Returns the node that is adjacent to the origin node along {@code edge}.
    *
    * <p>In the directed case, {@code edge} is assumed to be an outgoing edge.
    */
-  N oppositeNode(Object edge);
+  N adjacentNode(E edge);
 
   /**
    * Remove {@code edge} from the set of incoming edges. Returns the former predecessor node.
@@ -60,11 +60,11 @@
    * <p>In the undirected case, returns {@code null} if {@code isSelfLoop} is true.
    */
   @CanIgnoreReturnValue
-  N removeInEdge(Object edge, boolean isSelfLoop);
+  N removeInEdge(E edge, boolean isSelfLoop);
 
   /** Remove {@code edge} from the set of outgoing edges. Returns the former successor node. */
   @CanIgnoreReturnValue
-  N removeOutEdge(Object edge);
+  N removeOutEdge(E edge);
 
   /**
    * Add {@code edge} to the set of incoming edges. Implicitly adds {@code node} as a predecessor.
