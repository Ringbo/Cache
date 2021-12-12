diff --git a/src/com/facebook/buck/go/GoTestDescription.java b/src/com/facebook/buck/go/GoTestDescription.java
index 9418013..6d6c224 100644
--- a/src/com/facebook/buck/go/GoTestDescription.java
+++ b/src/com/facebook/buck/go/GoTestDescription.java
@@ -80,10 +80,10 @@
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
