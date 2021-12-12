diff --git a/src/com/facebook/buck/rules/MetadataProvidingDescription.java b/src/com/facebook/buck/rules/MetadataProvidingDescription.java
index 4013736..47039da 100644
--- a/src/com/facebook/buck/rules/MetadataProvidingDescription.java
+++ b/src/com/facebook/buck/rules/MetadataProvidingDescription.java
@@ -24,10 +24,10 @@
 
 public interface MetadataProvidingDescription<T> {
 
-  <A extends T, U> Optional<U> createMetadata(
+  <U> Optional<U> createMetadata(
       BuildTarget buildTarget,
       BuildRuleResolver resolver,
-      A args,
+      T args,
       Optional<ImmutableMap<BuildTarget, Version>> selectedVersions,
       Class<U> metadataClass)
       throws NoSuchBuildTargetException;
