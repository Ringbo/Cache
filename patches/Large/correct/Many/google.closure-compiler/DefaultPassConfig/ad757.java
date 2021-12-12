diff --git a/src/com/google/javascript/jscomp/DefaultPassConfig.java b/src/com/google/javascript/jscomp/DefaultPassConfig.java
index 8575230..07d45ef 100644
--- a/src/com/google/javascript/jscomp/DefaultPassConfig.java
+++ b/src/com/google/javascript/jscomp/DefaultPassConfig.java
@@ -348,7 +348,7 @@
     // Abstract method removal works best on minimally modified code, and also
     // only needs to run once.
     if (options.closurePass && options.removeAbstractMethods) {
-      passes.add(removeAbstractMethods);
+      passes.add(closureCodeRemoval);
     }
 
     // Collapsing properties can undo constant inlining, so we do this before
@@ -1209,11 +1209,11 @@
   };
 
   /** Remove variables set to goog.abstractMethod. */
-  private final PassFactory removeAbstractMethods =
-      new PassFactory("removeAbstractMethods", true) {
+  private final PassFactory closureCodeRemoval =
+      new PassFactory("closureCodeRemoval", true) {
     @Override
     protected CompilerPass createInternal(final AbstractCompiler compiler) {
-      return new GoogleCodeRemoval(compiler);
+      return new ClosureCodeRemoval(compiler);
     }
   };
 
