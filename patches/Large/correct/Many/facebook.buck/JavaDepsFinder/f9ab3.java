diff --git a/src/com/facebook/buck/jvm/java/autodeps/JavaDepsFinder.java b/src/com/facebook/buck/jvm/java/autodeps/JavaDepsFinder.java
index ffb9399..b7bc5ee 100644
--- a/src/com/facebook/buck/jvm/java/autodeps/JavaDepsFinder.java
+++ b/src/com/facebook/buck/jvm/java/autodeps/JavaDepsFinder.java
@@ -208,7 +208,7 @@
     // Currently, we traverse the entire target graph using a single thread. However, the work to
     // visit each node could be done in parallel, so long as the updates to the above collections
     // were thread-safe.
-    new AbstractBottomUpTraversal<TargetNode<?>, Void>(graph) {
+    new AbstractBottomUpTraversal<TargetNode<?>, RuntimeException>(graph) {
       @Override
       public void visit(TargetNode<?> node) {
         BuildRuleType buildRuleType = node.getDescription().getBuildRuleType();
