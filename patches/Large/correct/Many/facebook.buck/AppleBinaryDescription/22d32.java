diff --git a/src/com/facebook/buck/apple/AppleBinaryDescription.java b/src/com/facebook/buck/apple/AppleBinaryDescription.java
index 52b5e18..317b4af 100644
--- a/src/com/facebook/buck/apple/AppleBinaryDescription.java
+++ b/src/com/facebook/buck/apple/AppleBinaryDescription.java
@@ -437,10 +437,10 @@
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
