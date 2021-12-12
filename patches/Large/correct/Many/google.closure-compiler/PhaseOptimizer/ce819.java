diff --git a/src/com/google/javascript/jscomp/PhaseOptimizer.java b/src/com/google/javascript/jscomp/PhaseOptimizer.java
index 1b8e973..c797b6a 100644
--- a/src/com/google/javascript/jscomp/PhaseOptimizer.java
+++ b/src/com/google/javascript/jscomp/PhaseOptimizer.java
@@ -245,7 +245,7 @@
 
     @Override
     public void process(Node externs, Node root) {
-      logger.info(name);
+      logger.fine(name);
       startPass(name);
       processInternal(externs, root);
       endPass(externs, root);
