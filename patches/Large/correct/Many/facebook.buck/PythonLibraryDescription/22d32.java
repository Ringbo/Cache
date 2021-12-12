diff --git a/src/com/facebook/buck/python/PythonLibraryDescription.java b/src/com/facebook/buck/python/PythonLibraryDescription.java
index a53bc8a..72d12a0 100644
--- a/src/com/facebook/buck/python/PythonLibraryDescription.java
+++ b/src/com/facebook/buck/python/PythonLibraryDescription.java
@@ -80,10 +80,10 @@
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
