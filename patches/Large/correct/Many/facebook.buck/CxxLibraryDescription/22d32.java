diff --git a/src/com/facebook/buck/cxx/CxxLibraryDescription.java b/src/com/facebook/buck/cxx/CxxLibraryDescription.java
index 7522a65..1823871 100644
--- a/src/com/facebook/buck/cxx/CxxLibraryDescription.java
+++ b/src/com/facebook/buck/cxx/CxxLibraryDescription.java
@@ -968,10 +968,10 @@
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
