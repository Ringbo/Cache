diff --git a/src/com/facebook/buck/cxx/PrebuiltCxxLibraryDescription.java b/src/com/facebook/buck/cxx/PrebuiltCxxLibraryDescription.java
index df6d558..40f6234 100644
--- a/src/com/facebook/buck/cxx/PrebuiltCxxLibraryDescription.java
+++ b/src/com/facebook/buck/cxx/PrebuiltCxxLibraryDescription.java
@@ -351,7 +351,7 @@
 
     return CxxLinkableEnhancer.createCxxLinkableBuildRule(
         cxxPlatform,
-        params.copyWithExtraDeps(
+        params.appendExtraDeps(
             new Supplier<ImmutableSortedSet<BuildRule>>() {
               @Override
               public ImmutableSortedSet<BuildRule> get() {
@@ -461,7 +461,7 @@
         args.libDir.transform(macroArgFunction);
 
     return new PrebuiltCxxLibrary(
-        params.copyWithExtraDeps(
+        params.appendExtraDeps(
             new Supplier<ImmutableSortedSet<BuildRule>>() {
               @Override
               public ImmutableSortedSet<BuildRule> get() {
