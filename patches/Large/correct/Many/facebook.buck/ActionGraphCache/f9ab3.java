diff --git a/src/com/facebook/buck/rules/ActionGraphCache.java b/src/com/facebook/buck/rules/ActionGraphCache.java
index 5562442..24f62d2 100644
--- a/src/com/facebook/buck/rules/ActionGraphCache.java
+++ b/src/com/facebook/buck/rules/ActionGraphCache.java
@@ -143,8 +143,8 @@
     final int numberOfNodes = targetGraph.getNodes().size();
     final AtomicInteger processedNodes = new AtomicInteger(0);
 
-    AbstractBottomUpTraversal<TargetNode<?>, ActionGraph> bottomUpTraversal =
-        new AbstractBottomUpTraversal<TargetNode<?>, ActionGraph>(targetGraph) {
+    AbstractBottomUpTraversal<TargetNode<?>, RuntimeException> bottomUpTraversal =
+        new AbstractBottomUpTraversal<TargetNode<?>, RuntimeException>(targetGraph) {
 
           @Override
           public void visit(TargetNode<?> node) {
