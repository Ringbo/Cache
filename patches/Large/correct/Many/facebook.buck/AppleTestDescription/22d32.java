diff --git a/src/com/facebook/buck/apple/AppleTestDescription.java b/src/com/facebook/buck/apple/AppleTestDescription.java
index 7b8fd73..a8096a1 100644
--- a/src/com/facebook/buck/apple/AppleTestDescription.java
+++ b/src/com/facebook/buck/apple/AppleTestDescription.java
@@ -463,10 +463,10 @@
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
