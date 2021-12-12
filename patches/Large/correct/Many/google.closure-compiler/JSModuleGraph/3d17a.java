diff --git a/src/com/google/javascript/jscomp/JSModuleGraph.java b/src/com/google/javascript/jscomp/JSModuleGraph.java
index 1ab5801..bac1570 100644
--- a/src/com/google/javascript/jscomp/JSModuleGraph.java
+++ b/src/com/google/javascript/jscomp/JSModuleGraph.java
@@ -291,7 +291,7 @@
    * @throws MissingProvideException if an entry point was not provided
    *     by any of the inputs.
    */
-  List<CompilerInput> manageDependencies(
+  public List<CompilerInput> manageDependencies(
       List<String> entryPoints,
       List<CompilerInput> inputs)
       throws CircularDependencyException, MissingProvideException {
