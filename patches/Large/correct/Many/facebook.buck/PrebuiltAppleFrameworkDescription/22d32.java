diff --git a/src/com/facebook/buck/apple/PrebuiltAppleFrameworkDescription.java b/src/com/facebook/buck/apple/PrebuiltAppleFrameworkDescription.java
index 92bdcd1..002b3c1 100644
--- a/src/com/facebook/buck/apple/PrebuiltAppleFrameworkDescription.java
+++ b/src/com/facebook/buck/apple/PrebuiltAppleFrameworkDescription.java
@@ -111,10 +111,10 @@
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
