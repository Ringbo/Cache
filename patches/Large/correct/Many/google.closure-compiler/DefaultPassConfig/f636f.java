diff --git a/src/com/google/javascript/jscomp/DefaultPassConfig.java b/src/com/google/javascript/jscomp/DefaultPassConfig.java
index 360d6dd..671e66b 100644
--- a/src/com/google/javascript/jscomp/DefaultPassConfig.java
+++ b/src/com/google/javascript/jscomp/DefaultPassConfig.java
@@ -510,7 +510,7 @@
 
       // After inlining some of the variable uses, some variables are unused.
       // Re-run remove unused vars to clean it up.
-      if (options.removeUnusedVars) {
+      if (options.removeUnusedVars || options.removeUnusedLocalVars) {
         passes.add(removeUnusedVars);
       }
     }
