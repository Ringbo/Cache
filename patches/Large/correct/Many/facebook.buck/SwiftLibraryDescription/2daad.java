diff --git a/src/com/facebook/buck/swift/SwiftLibraryDescription.java b/src/com/facebook/buck/swift/SwiftLibraryDescription.java
index b3dfff2..3b2a8a1 100644
--- a/src/com/facebook/buck/swift/SwiftLibraryDescription.java
+++ b/src/com/facebook/buck/swift/SwiftLibraryDescription.java
@@ -260,20 +260,15 @@
       return new SwiftCompile(
           cxxPlatform,
           swiftBuckConfig,
-          new BuildRuleParams(
-              params.getBuildTarget(),
+          params.copyAppendingExtraDeps(
               () ->
-                  ImmutableSortedSet.<BuildRule>naturalOrder()
+                  ImmutableSet.<BuildRule>builder()
                       .addAll(swiftCompileRules)
                       .addAll(implicitSwiftCompileRules)
                       .addAll(cxxDeps.getDeps(ruleFinder))
-                      // This is only used for generating include args, but adding it for local
-                      // reasoning correctness.
+                      // This is only used for generating include args and may not be actually needed.
                       .addAll(preprocessor.getDeps(ruleFinder))
-                      .build(),
-              ImmutableSortedSet::of,
-              ImmutableSortedSet.of(),
-              params.getProjectFilesystem()),
+                      .build()),
           swiftPlatform.get().getSwiftc(),
           args.getFrameworks(),
           args.getModuleName().orElse(buildTarget.getShortName()),
