diff --git a/android/guava/src/com/google/common/graph/UndirectedGraphConnections.java b/android/guava/src/com/google/common/graph/UndirectedGraphConnections.java
index 9c5187e..bb5ed13 100755
--- a/android/guava/src/com/google/common/graph/UndirectedGraphConnections.java
+++ b/android/guava/src/com/google/common/graph/UndirectedGraphConnections.java
@@ -65,18 +65,18 @@
   }
 
   @Override
-  public V value(Object node) {
+  public V value(N node) {
     return adjacentNodeValues.get(node);
   }
 
   @Override
-  public void removePredecessor(Object node) {
+  public void removePredecessor(N node) {
     @SuppressWarnings("unused")
     V unused = removeSuccessor(node);
   }
 
   @Override
-  public V removeSuccessor(Object node) {
+  public V removeSuccessor(N node) {
     return adjacentNodeValues.remove(node);
   }
 
