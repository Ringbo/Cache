diff --git a/src/com/facebook/buck/apple/AppleLibraryDescription.java b/src/com/facebook/buck/apple/AppleLibraryDescription.java
index 0c7d091..055386e 100644
--- a/src/com/facebook/buck/apple/AppleLibraryDescription.java
+++ b/src/com/facebook/buck/apple/AppleLibraryDescription.java
@@ -508,10 +508,10 @@
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
