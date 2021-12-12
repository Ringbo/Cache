diff --git a/android/guava/src/com/google/common/graph/DirectedGraphConnections.java b/android/guava/src/com/google/common/graph/DirectedGraphConnections.java
index 809046b..668b569 100755
--- a/android/guava/src/com/google/common/graph/DirectedGraphConnections.java
+++ b/android/guava/src/com/google/common/graph/DirectedGraphConnections.java
@@ -166,7 +166,7 @@
 
   @SuppressWarnings("unchecked")
   @Override
-  public V value(Object node) {
+  public V value(N node) {
     Object value = adjacentNodeValues.get(node);
     if (value == PRED) {
       return null;
@@ -179,7 +179,7 @@
 
   @SuppressWarnings("unchecked")
   @Override
-  public void removePredecessor(Object node) {
+  public void removePredecessor(N node) {
     Object previousValue = adjacentNodeValues.get(node);
     if (previousValue == PRED) {
       adjacentNodeValues.remove(node);
