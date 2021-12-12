diff --git a/android/guava/src/com/google/common/graph/GraphConnections.java b/android/guava/src/com/google/common/graph/GraphConnections.java
index 0988f71..252a027 100755
--- a/android/guava/src/com/google/common/graph/GraphConnections.java
+++ b/android/guava/src/com/google/common/graph/GraphConnections.java
@@ -41,17 +41,17 @@
    * if there is no such edge.
    */
   @Nullable
-  V value(Object node);
+  V value(N node);
 
   /** Remove {@code node} from the set of predecessors. */
-  void removePredecessor(Object node);
+  void removePredecessor(N node);
 
   /**
    * Remove {@code node} from the set of successors. Returns the value previously associated with
    * the edge connecting the two nodes.
    */
   @CanIgnoreReturnValue
-  V removeSuccessor(Object node);
+  V removeSuccessor(N node);
 
   /**
    * Add {@code node} as a predecessor to the origin node. In the case of an undirected graph, it
