diff --git a/src/com/google/javascript/jscomp/CrossModuleCodeMotion.java b/src/com/google/javascript/jscomp/CrossModuleCodeMotion.java
index 12551f8..2512d12 100755
--- a/src/com/google/javascript/jscomp/CrossModuleCodeMotion.java
+++ b/src/com/google/javascript/jscomp/CrossModuleCodeMotion.java
@@ -71,7 +71,7 @@
 
   @Override
   public void process(Node externs, Node root) {
-    logger.info("Moving functions + variable into deeper modules");
+    logger.fine("Moving functions + variable into deeper modules");
 
     // If there are <2 modules, then we will never move anything, so we're done
     if (graph != null && graph.getModuleCount() > 1) {
