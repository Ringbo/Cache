diff --git a/src/com/facebook/buck/cxx/toolchain/nativelink/NativeLinkables.java b/src/com/facebook/buck/cxx/toolchain/nativelink/NativeLinkables.java
index 4369e82..027ef5d 100644
--- a/src/com/facebook/buck/cxx/toolchain/nativelink/NativeLinkables.java
+++ b/src/com/facebook/buck/cxx/toolchain/nativelink/NativeLinkables.java
@@ -53,11 +53,10 @@
    */
   static ImmutableMap<BuildTarget, NativeLinkable> getNativeLinkableRoots(
       Iterable<? extends BuildRule> from,
-      final Predicate<Object> traverse,
-      final Predicate<Object> skip) {
+      Predicate<? super BuildRule> traverse,
+      Predicate<? super BuildRule> skip) {
 
-    final ImmutableMap.Builder<BuildTarget, NativeLinkable> nativeLinkables =
-        ImmutableMap.builder();
+    ImmutableMap.Builder<BuildTarget, NativeLinkable> nativeLinkables = ImmutableMap.builder();
     AbstractBreadthFirstTraversal<BuildRule> visitor =
         new AbstractBreadthFirstTraversal<BuildRule>(from) {
           @Override
@@ -93,7 +92,7 @@
    * @return all the roots found as a map from {@link BuildTarget} to {@link NativeLinkable}.
    */
   public static ImmutableMap<BuildTarget, NativeLinkable> getNativeLinkableRoots(
-      Iterable<? extends BuildRule> from, final Predicate<Object> traverse) {
+      Iterable<? extends BuildRule> from, Predicate<? super BuildRule> traverse) {
     return getNativeLinkableRoots(from, traverse, x -> false);
   }
 
@@ -107,17 +106,17 @@
    *     NativeLinkable.Linkage.ANY}.
    */
   public static ImmutableMap<BuildTarget, NativeLinkable> getNativeLinkables(
-      final CxxPlatform cxxPlatform,
+      CxxPlatform cxxPlatform,
       Iterable<? extends NativeLinkable> inputs,
-      final Linker.LinkableDepType linkStyle,
-      final Predicate<? super NativeLinkable> traverse) {
+      Linker.LinkableDepType linkStyle,
+      Predicate<? super NativeLinkable> traverse) {
 
-    final Map<BuildTarget, NativeLinkable> nativeLinkables = new HashMap<>();
+    Map<BuildTarget, NativeLinkable> nativeLinkables = new HashMap<>();
     for (NativeLinkable nativeLinkable : inputs) {
       nativeLinkables.put(nativeLinkable.getBuildTarget(), nativeLinkable);
     }
 
-    final MutableDirectedGraph<BuildTarget> graph = new MutableDirectedGraph<>();
+    MutableDirectedGraph<BuildTarget> graph = new MutableDirectedGraph<>();
     AbstractBreadthFirstTraversal<BuildTarget> visitor =
         new AbstractBreadthFirstTraversal<BuildTarget>(nativeLinkables.keySet()) {
           @Override
@@ -177,9 +176,9 @@
   }
 
   public static ImmutableMap<BuildTarget, NativeLinkable> getNativeLinkables(
-      final CxxPlatform cxxPlatform,
+      CxxPlatform cxxPlatform,
       Iterable<? extends NativeLinkable> inputs,
-      final Linker.LinkableDepType linkStyle) {
+      Linker.LinkableDepType linkStyle) {
     return getNativeLinkables(cxxPlatform, inputs, linkStyle, x -> true);
   }
 
@@ -220,8 +219,8 @@
       CxxPlatform cxxPlatform,
       Iterable<? extends BuildRule> inputs,
       Linker.LinkableDepType depType,
-      Predicate<Object> traverse,
-      Predicate<Object> skip) {
+      Predicate<? super BuildRule> traverse,
+      Predicate<? super BuildRule> skip) {
 
     // Get the topologically sorted native linkables.
     ImmutableMap<BuildTarget, NativeLinkable> roots =
@@ -236,14 +235,14 @@
   }
 
   public static ImmutableMap<BuildTarget, NativeLinkable> getTransitiveNativeLinkables(
-      final CxxPlatform cxxPlatform, Iterable<? extends NativeLinkable> inputs) {
+      CxxPlatform cxxPlatform, Iterable<? extends NativeLinkable> inputs) {
 
-    final Map<BuildTarget, NativeLinkable> nativeLinkables = new HashMap<>();
+    Map<BuildTarget, NativeLinkable> nativeLinkables = new HashMap<>();
     for (NativeLinkable nativeLinkable : inputs) {
       nativeLinkables.put(nativeLinkable.getBuildTarget(), nativeLinkable);
     }
 
-    final MutableDirectedGraph<BuildTarget> graph = new MutableDirectedGraph<>();
+    MutableDirectedGraph<BuildTarget> graph = new MutableDirectedGraph<>();
     AbstractBreadthFirstTraversal<BuildTarget> visitor =
         new AbstractBreadthFirstTraversal<BuildTarget>(nativeLinkables.keySet()) {
           @Override
@@ -277,7 +276,7 @@
       CxxPlatform cxxPlatform,
       Iterable<? extends BuildRule> inputs,
       Linker.LinkableDepType depType,
-      Predicate<Object> traverse) {
+      Predicate<? super BuildRule> traverse) {
     return getTransitiveNativeLinkableInput(cxxPlatform, inputs, depType, traverse, x -> false);
   }
 
@@ -291,8 +290,8 @@
   public static ImmutableSortedMap<String, SourcePath> getTransitiveSharedLibraries(
       CxxPlatform cxxPlatform,
       Iterable<? extends BuildRule> inputs,
-      Predicate<Object> traverse,
-      Predicate<Object> skip) {
+      Predicate<? super BuildRule> traverse,
+      Predicate<? super BuildRule> skip) {
 
     ImmutableMap<BuildTarget, NativeLinkable> roots =
         getNativeLinkableRoots(inputs, traverse, skip);
@@ -336,7 +335,9 @@
    * @return a mapping of library name to the library {@link SourcePath}.
    */
   public static ImmutableSortedMap<String, SourcePath> getTransitiveSharedLibraries(
-      CxxPlatform cxxPlatform, Iterable<? extends BuildRule> inputs, Predicate<Object> traverse) {
+      CxxPlatform cxxPlatform,
+      Iterable<? extends BuildRule> inputs,
+      Predicate<? super BuildRule> traverse) {
     return getTransitiveSharedLibraries(cxxPlatform, inputs, traverse, x -> false);
   }
 
