diff --git a/src/com/google/javascript/jscomp/ExpandJqueryAliases.java b/src/com/google/javascript/jscomp/ExpandJqueryAliases.java
index ef09ce8..51f9fac 100644
--- a/src/com/google/javascript/jscomp/ExpandJqueryAliases.java
+++ b/src/com/google/javascript/jscomp/ExpandJqueryAliases.java
@@ -77,7 +77,7 @@
 
   @Override
   public void process(Node externs, Node root) {
-    logger.info("Expanding Jquery Aliases");
+    logger.fine("Expanding Jquery Aliases");
 
     // Traverse the tree and collect strings
     NodeTraversal.traverse(compiler, root, this);
