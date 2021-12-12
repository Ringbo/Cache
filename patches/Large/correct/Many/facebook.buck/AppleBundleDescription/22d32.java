diff --git a/src/com/facebook/buck/apple/AppleBundleDescription.java b/src/com/facebook/buck/apple/AppleBundleDescription.java
index 74d3956..8dc9b24 100644
--- a/src/com/facebook/buck/apple/AppleBundleDescription.java
+++ b/src/com/facebook/buck/apple/AppleBundleDescription.java
@@ -285,10 +285,10 @@
   }
 
   @Override
-  public <A extends Arg, U> Optional<U> createMetadata(
+  public <U> Optional<U> createMetadata(
       BuildTarget buildTarget,
       BuildRuleResolver resolver,
-      A args,
+      Arg args,
       Optional<ImmutableMap<BuildTarget, Version>> selectedVersions,
       Class<U> metadataClass)
       throws NoSuchBuildTargetException {
