diff --git a/src/com/facebook/buck/cli/AuditInputCommand.java b/src/com/facebook/buck/cli/AuditInputCommand.java
index 34f9afe..e3f3cbf 100644
--- a/src/com/facebook/buck/cli/AuditInputCommand.java
+++ b/src/com/facebook/buck/cli/AuditInputCommand.java
@@ -139,7 +139,7 @@
     final SortedMap<String, ImmutableSortedSet<Path>> targetToInputs =
         new TreeMap<>();
 
-    new AbstractBottomUpTraversal<TargetNode<?>, Void>(graph) {
+    new AbstractBottomUpTraversal<TargetNode<?>, RuntimeException>(graph) {
 
       @Override
       public void visit(TargetNode<?> node) {
@@ -181,7 +181,7 @@
     // Traverse the TargetGraph and print out all of the inputs used to produce each TargetNode.
     // Keep track of the inputs that have been displayed to ensure that they are not displayed more
     // than once.
-    new AbstractBottomUpTraversal<TargetNode<?>, Void>(graph) {
+    new AbstractBottomUpTraversal<TargetNode<?>, RuntimeException>(graph) {
 
       final Set<Path> inputs = Sets.newHashSet();
 
