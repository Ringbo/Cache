diff --git a/src/com/facebook/buck/cxx/CxxTestDescription.java b/src/com/facebook/buck/cxx/CxxTestDescription.java
index 3d6842c..5d50f80 100644
--- a/src/com/facebook/buck/cxx/CxxTestDescription.java
+++ b/src/com/facebook/buck/cxx/CxxTestDescription.java
@@ -385,10 +385,10 @@
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
