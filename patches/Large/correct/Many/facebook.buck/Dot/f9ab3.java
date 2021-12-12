diff --git a/src/com/facebook/buck/graph/Dot.java b/src/com/facebook/buck/graph/Dot.java
index 0a80b58..8f17701 100644
--- a/src/com/facebook/buck/graph/Dot.java
+++ b/src/com/facebook/buck/graph/Dot.java
@@ -45,7 +45,7 @@
   public void writeOutput() throws IOException {
     output.append("digraph " + graphName + " {\n");
 
-    new AbstractBottomUpTraversal<T, Object>(graph) {
+    new AbstractBottomUpTraversal<T, RuntimeException>(graph) {
 
       @Override
       public void visit(T node) {
@@ -75,7 +75,7 @@
     final ImmutableSortedSet.Builder<String> builder = ImmutableSortedSet.naturalOrder();
     output.append("digraph " + graphName + " {\n");
 
-    new AbstractBottomUpTraversal<T, Object>(graph) {
+    new AbstractBottomUpTraversal<T, RuntimeException>(graph) {
 
       @Override
       public void visit(T node) {
