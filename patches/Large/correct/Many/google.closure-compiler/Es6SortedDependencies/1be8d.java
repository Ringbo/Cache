diff --git a/src/com/google/javascript/jscomp/deps/Es6SortedDependencies.java b/src/com/google/javascript/jscomp/deps/Es6SortedDependencies.java
index 913cafb..2a7296c 100644
--- a/src/com/google/javascript/jscomp/deps/Es6SortedDependencies.java
+++ b/src/com/google/javascript/jscomp/deps/Es6SortedDependencies.java
@@ -110,7 +110,7 @@
   }
 
   @Override
-  public List<INPUT> getSortedDependenciesOf(List<INPUT> roots) {
+  public ImmutableList<INPUT> getSortedDependenciesOf(List<INPUT> roots) {
     return getDependenciesOf(roots, true);
   }
 
