diff --git a/src/com/facebook/buck/go/GoLibraryDescription.java b/src/com/facebook/buck/go/GoLibraryDescription.java
index 0d799c2..436f513 100644
--- a/src/com/facebook/buck/go/GoLibraryDescription.java
+++ b/src/com/facebook/buck/go/GoLibraryDescription.java
@@ -67,10 +67,10 @@
   }
 
   @Override
-  public <A extends Arg, U> Optional<U> createMetadata(
+  public <U> Optional<U> createMetadata(
       BuildTarget buildTarget,
       final BuildRuleResolver resolver,
-      A args,
+      Arg args,
       Optional<ImmutableMap<BuildTarget, Version>> selectedVersions,
       Class<U> metadataClass)
       throws NoSuchBuildTargetException {
