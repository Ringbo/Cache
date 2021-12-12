diff --git a/src/com/google/javascript/jscomp/lint/CheckForInOverArray.java b/src/com/google/javascript/jscomp/lint/CheckForInOverArray.java
index 52efeb7..9169141 100644
--- a/src/com/google/javascript/jscomp/lint/CheckForInOverArray.java
+++ b/src/com/google/javascript/jscomp/lint/CheckForInOverArray.java
@@ -89,6 +89,6 @@
 
   @Override
   public void hotSwapScript(Node scriptRoot, Node originalRoot) {
-    NodeTraversal.traverseEs6(compiler, originalRoot, this);
+    NodeTraversal.traverseEs6(compiler, scriptRoot, this);
   }
 }
