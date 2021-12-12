diff --git a/src/com/facebook/buck/apple/project_generator/ProjectGenerator.java b/src/com/facebook/buck/apple/project_generator/ProjectGenerator.java
index 4e61990..0f85b75 100644
--- a/src/com/facebook/buck/apple/project_generator/ProjectGenerator.java
+++ b/src/com/facebook/buck/apple/project_generator/ProjectGenerator.java
@@ -1183,12 +1183,10 @@
         ImmutableSet.Builder<FrameworkPath> frameworksBuilder = ImmutableSet.builder();
         frameworksBuilder.addAll(targetNode.getConstructorArg().frameworks);
         frameworksBuilder.addAll(targetNode.getConstructorArg().libraries);
-        frameworksBuilder.addAll(
-            collectRecursiveFrameworkDependencies(ImmutableList.of(targetNode)));
+        frameworksBuilder.addAll(collectRecursiveFrameworkDependencies(targetNode));
         mutator.setFrameworks(frameworksBuilder.build());
 
-        mutator.setArchives(
-            collectRecursiveLibraryDependencies(ImmutableList.of(targetNode)));
+        mutator.setArchives(collectRecursiveLibraryDependencies(targetNode));
       }
 
       // TODO(Task #3772930): Go through all dependencies of the rule
@@ -1367,30 +1365,26 @@
                 Joiner.on(' ').join(Iterables.concat(recursiveHeaderSearchPaths, headerMapBases)))
             .put(
                 "LIBRARY_SEARCH_PATHS",
-                Joiner.on(' ').join(
-                    collectRecursiveLibrarySearchPaths(ImmutableSet.of(targetNode))))
+                Joiner.on(' ').join(collectRecursiveLibrarySearchPaths(targetNode)))
             .put(
                 "FRAMEWORK_SEARCH_PATHS",
-                Joiner.on(' ').join(
-                    collectRecursiveFrameworkSearchPaths(ImmutableList.of(targetNode))));
+                Joiner.on(' ').join(collectRecursiveFrameworkSearchPaths(targetNode)));
 
         Iterable<String> otherCFlags = Iterables.concat(
             cxxBuckConfig.getFlags("cflags").orElse(DEFAULT_CFLAGS),
-            collectRecursiveExportedPreprocessorFlags(
-                ImmutableList.of(targetNode)),
+            collectRecursiveExportedPreprocessorFlags(targetNode),
             targetNode.getConstructorArg().compilerFlags,
             targetNode.getConstructorArg().preprocessorFlags);
         Iterable<String> otherCxxFlags = Iterables.concat(
             cxxBuckConfig.getFlags("cxxflags").orElse(DEFAULT_CXXFLAGS),
-            collectRecursiveExportedPreprocessorFlags(
-                ImmutableList.of(targetNode)),
+            collectRecursiveExportedPreprocessorFlags(targetNode),
             targetNode.getConstructorArg().compilerFlags,
             targetNode.getConstructorArg().preprocessorFlags);
         ImmutableList<String> otherLdFlags = convertStringWithMacros(
             targetNode,
             Iterables.concat(
                 targetNode.getConstructorArg().linkerFlags,
-                collectRecursiveExportedLinkerFlags(ImmutableList.of(targetNode))));
+                collectRecursiveExportedLinkerFlags(targetNode)));
 
         appendConfigsBuilder
             .put(
@@ -1411,8 +1405,7 @@
                        .getPatternsAndValues(),
                    targetNode.getConstructorArg().platformPreprocessorFlags
                        .getPatternsAndValues(),
-                   collectRecursiveExportedPlatformPreprocessorFlags(
-                       ImmutableList.of(targetNode)))) {
+                   collectRecursiveExportedPlatformPreprocessorFlags(targetNode))) {
           String sdk = flags.getFirst().pattern().replaceAll("[*.]", "");
           platformFlagsBuilder.put(sdk, flags.getSecond());
         }
@@ -1439,7 +1432,7 @@
         for (Pair<Pattern, ImmutableList<StringWithMacros>> flags :
             Iterables.concat(
                 targetNode.getConstructorArg().platformLinkerFlags.getPatternsAndValues(),
-                collectRecursiveExportedPlatformLinkerFlags(ImmutableList.of(targetNode)))) {
+                collectRecursiveExportedPlatformLinkerFlags(targetNode))) {
           String sdk = flags.getFirst().pattern().replaceAll("[*.]", "");
           platformLinkerFlagsBuilder.put(
               sdk,
@@ -2415,36 +2408,33 @@
     return isSourceUnderTest;
   }
 
-  private <T> ImmutableSet<String> collectRecursiveLibrarySearchPaths(
-      Iterable<TargetNode<T, ?>> targetNodes) {
+  private ImmutableSet<String> collectRecursiveLibrarySearchPaths(TargetNode<?, ?> targetNode) {
     return new ImmutableSet.Builder<String>()
         .add("$BUILT_PRODUCTS_DIR")
         .addAll(
             collectRecursiveSearchPathsForFrameworkPaths(
-                targetNodes,
+                targetNode,
                 input -> input.libraries)).build();
   }
 
-  private <T> ImmutableSet<String> collectRecursiveFrameworkSearchPaths(
-      Iterable<TargetNode<T, ?>> targetNodes) {
+  private ImmutableSet<String> collectRecursiveFrameworkSearchPaths(TargetNode<?, ?> targetNode) {
     return new ImmutableSet.Builder<String>()
         .add("$BUILT_PRODUCTS_DIR")
         .addAll(
             collectRecursiveSearchPathsForFrameworkPaths(
-                targetNodes,
+                targetNode,
                 input -> input.frameworks)).build();
   }
 
-  private <T> Iterable<FrameworkPath> collectRecursiveFrameworkDependencies(
-      Iterable<TargetNode<T, ?>> targetNodes) {
+  private Iterable<FrameworkPath> collectRecursiveFrameworkDependencies(
+      TargetNode<?, ?> targetNode) {
     return FluentIterable
-        .from(targetNodes)
-        .transformAndConcat(node ->
+        .from(
             AppleBuildRules.getRecursiveTargetNodeDependenciesOfTypes(
                 targetGraph,
                 Optional.of(dependenciesCache),
                 AppleBuildRules.RecursiveDependenciesMode.LINKING,
-                node,
+                targetNode,
                 AppleBuildRules.XCODE_TARGET_DESCRIPTION_CLASSES))
         .transformAndConcat(input -> {
           Optional<TargetNode<CxxLibraryDescription.Arg, ?>> library =
@@ -2460,63 +2450,59 @@
         });
   }
 
-  private <T> Iterable<String> collectRecursiveSearchPathsForFrameworkPaths(
-      Iterable<TargetNode<T, ?>> targetNodes,
+  private Iterable<String> collectRecursiveSearchPathsForFrameworkPaths(
+      TargetNode<?, ?> targetNode,
       final Function<
           AppleNativeTargetDescriptionArg,
           ImmutableSortedSet<FrameworkPath>> pathSetExtractor) {
     return FluentIterable
-        .from(targetNodes)
-        .transformAndConcat(node ->
+        .from(
             AppleBuildRules.getRecursiveTargetNodeDependenciesOfTypes(
                 targetGraph,
                 Optional.of(dependenciesCache),
                 AppleBuildRules.RecursiveDependenciesMode.LINKING,
-                node,
+                targetNode,
                 ImmutableSet.of(
                     AppleLibraryDescription.class,
                     CxxLibraryDescription.class)))
-        .append(targetNodes)
+        .append(targetNode)
         .transformAndConcat(
             input -> input.castArg(AppleNativeTargetDescriptionArg.class)
                 .map(castedInput -> getTargetFrameworkSearchPaths(pathSetExtractor, castedInput))
                 .orElse(ImmutableSet.of()));
   }
 
-  private <T> Iterable<String> collectRecursiveExportedPreprocessorFlags(
-      Iterable<TargetNode<T, ?>> targetNodes) {
+  private Iterable<String> collectRecursiveExportedPreprocessorFlags(TargetNode<?, ?> targetNode) {
     return FluentIterable
-        .from(targetNodes)
-        .transformAndConcat(node ->
+        .from(
             AppleBuildRules.getRecursiveTargetNodeDependenciesOfTypes(
                 targetGraph,
                 Optional.of(dependenciesCache),
                 AppleBuildRules.RecursiveDependenciesMode.BUILDING,
-                node,
+                targetNode,
                 ImmutableSet.of(
                     AppleLibraryDescription.class,
                     CxxLibraryDescription.class)))
-        .append(targetNodes)
+        .append(targetNode)
         .transformAndConcat(
             input -> input.castArg(CxxLibraryDescription.Arg.class)
                 .map(input1 -> input1.getConstructorArg().exportedPreprocessorFlags)
                 .orElse(ImmutableList.of()));
   }
 
-  private <T> Iterable<Pair<Pattern, ImmutableList<String>>>
-      collectRecursiveExportedPlatformPreprocessorFlags(Iterable<TargetNode<T, ?>> targetNodes) {
+  private Iterable<Pair<Pattern, ImmutableList<String>>>
+  collectRecursiveExportedPlatformPreprocessorFlags(TargetNode<?, ?> targetNode) {
     return FluentIterable
-        .from(targetNodes)
-        .transformAndConcat(node ->
+        .from(
             AppleBuildRules.getRecursiveTargetNodeDependenciesOfTypes(
                 targetGraph,
                 Optional.of(dependenciesCache),
                 AppleBuildRules.RecursiveDependenciesMode.BUILDING,
-                node,
+                targetNode,
                 ImmutableSet.of(
                     AppleLibraryDescription.class,
                     CxxLibraryDescription.class)))
-        .append(targetNodes)
+        .append(targetNode)
         .transformAndConcat(input ->
             input.castArg(CxxLibraryDescription.Arg.class)
                 .map(input1 -> input1.getConstructorArg().exportedPlatformPreprocessorFlags
@@ -2524,21 +2510,20 @@
                 .orElse(ImmutableList.of()));
   }
 
-  private <T> ImmutableList<StringWithMacros> collectRecursiveExportedLinkerFlags(
-      Iterable<TargetNode<T, ?>> targetNodes) {
+  private ImmutableList<StringWithMacros> collectRecursiveExportedLinkerFlags(
+      TargetNode<?, ?> targetNode) {
     return FluentIterable
-        .from(targetNodes)
-        .transformAndConcat(node ->
+        .from(
             AppleBuildRules.getRecursiveTargetNodeDependenciesOfTypes(
                 targetGraph,
                 Optional.of(dependenciesCache),
                 AppleBuildRules.RecursiveDependenciesMode.LINKING,
-                node,
+                targetNode,
                 ImmutableSet.of(
                     AppleLibraryDescription.class,
                     CxxLibraryDescription.class,
                     HalideLibraryDescription.class)))
-        .append(targetNodes)
+        .append(targetNode)
         .transformAndConcat(input ->
             input.castArg(CxxLibraryDescription.Arg.class)
                 .map(input1 -> input1.getConstructorArg().exportedLinkerFlags)
@@ -2546,21 +2531,20 @@
         .toList();
   }
 
-  private <T> Iterable<Pair<Pattern, ImmutableList<StringWithMacros>>>
-      collectRecursiveExportedPlatformLinkerFlags(Iterable<TargetNode<T, ?>> targetNodes) {
+  private Iterable<Pair<Pattern, ImmutableList<StringWithMacros>>>
+  collectRecursiveExportedPlatformLinkerFlags(TargetNode<?, ?> targetNode) {
     return FluentIterable
-        .from(targetNodes)
-        .transformAndConcat(node ->
+        .from(
             AppleBuildRules.getRecursiveTargetNodeDependenciesOfTypes(
                 targetGraph,
                 Optional.of(dependenciesCache),
                 AppleBuildRules.RecursiveDependenciesMode.LINKING,
-                node,
+                targetNode,
                 ImmutableSet.of(
                     AppleLibraryDescription.class,
                     CxxLibraryDescription.class,
                     HalideLibraryDescription.class)))
-        .append(targetNodes)
+        .append(targetNode)
         .transformAndConcat(input ->
             input.castArg(CxxLibraryDescription.Arg.class)
                 .map(input1 -> input1.getConstructorArg().exportedPlatformLinkerFlags.
@@ -2568,16 +2552,15 @@
                 .orElse(ImmutableList.of()));
   }
 
-  private <T> ImmutableSet<PBXFileReference>
-  collectRecursiveLibraryDependencies(Iterable<TargetNode<T, ?>> targetNodes) {
+  private ImmutableSet<PBXFileReference>
+  collectRecursiveLibraryDependencies(TargetNode<?, ?> targetNode) {
     return FluentIterable
-        .from(targetNodes)
-        .transformAndConcat(node ->
+        .from(
             AppleBuildRules.getRecursiveTargetNodeDependenciesOfTypes(
                 targetGraph,
                 Optional.of(dependenciesCache),
                 AppleBuildRules.RecursiveDependenciesMode.LINKING,
-                node,
+                targetNode,
                 AppleBuildRules.XCODE_TARGET_DESCRIPTION_CLASSES))
         .filter(this::isLibraryWithSourcesToCompile)
         .transform(this::getLibraryFileReference)
