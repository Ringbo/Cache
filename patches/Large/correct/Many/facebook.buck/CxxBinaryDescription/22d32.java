diff --git a/src/com/facebook/buck/cxx/CxxBinaryDescription.java b/src/com/facebook/buck/cxx/CxxBinaryDescription.java
index fa55b81..be4ae5e 100644
--- a/src/com/facebook/buck/cxx/CxxBinaryDescription.java
+++ b/src/com/facebook/buck/cxx/CxxBinaryDescription.java
@@ -362,10 +362,10 @@
   }
 
   @Override
-  public <A extends Arg, U> Optional<U> createMetadata(
+  public <U> Optional<U> createMetadata(
       BuildTarget buildTarget,
       BuildRuleResolver resolver,
-      A args,
+      Arg args,
       Optional<ImmutableMap<BuildTarget, Version>> selectedVersions,
       final Class<U> metadataClass)
       throws NoSuchBuildTargetException {
