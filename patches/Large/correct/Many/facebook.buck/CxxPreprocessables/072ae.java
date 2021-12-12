diff --git a/src/com/facebook/buck/cxx/CxxPreprocessables.java b/src/com/facebook/buck/cxx/CxxPreprocessables.java
index 741436f..1399d34 100644
--- a/src/com/facebook/buck/cxx/CxxPreprocessables.java
+++ b/src/com/facebook/buck/cxx/CxxPreprocessables.java
@@ -186,12 +186,14 @@
       CxxPreprocessorInput.Builder builder,
       BuildTarget target,
       BuildRuleResolver ruleResolver,
-      Flavor flavor,
+      CxxPlatform platform,
       HeaderVisibility headerVisibility,
       IncludeType includeType) throws NoSuchBuildTargetException {
     BuildRule rule = ruleResolver.requireRule(
         BuildTarget.builder(target)
-            .addFlavors(flavor, CxxDescriptionEnhancer.getHeaderSymlinkTreeFlavor(headerVisibility))
+            .addFlavors(
+                platform.getFlavor(),
+                CxxDescriptionEnhancer.getHeaderSymlinkTreeFlavor(headerVisibility))
             .build());
     Preconditions.checkState(
         rule instanceof HeaderSymlinkTree,
@@ -237,7 +239,7 @@
       BuildRuleParams params,
       BuildRuleResolver ruleResolver,
       boolean hasHeaderSymlinkTree,
-      Flavor flavor,
+      CxxPlatform platform,
       HeaderVisibility headerVisibility,
       IncludeType includeType,
       Multimap<CxxSource.Type, String> exportedPreprocessorFlags,
@@ -248,7 +250,7 @@
           builder,
           params.getBuildTarget(),
           ruleResolver,
-          flavor,
+          platform,
           headerVisibility,
           includeType);
     }
