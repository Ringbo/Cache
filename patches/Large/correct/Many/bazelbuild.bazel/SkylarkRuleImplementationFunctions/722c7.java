diff --git a/src/main/java/com/google/devtools/build/lib/rules/SkylarkRuleImplementationFunctions.java b/src/main/java/com/google/devtools/build/lib/rules/SkylarkRuleImplementationFunctions.java
index 628e77e..3eb1c06 100644
--- a/src/main/java/com/google/devtools/build/lib/rules/SkylarkRuleImplementationFunctions.java
+++ b/src/main/java/com/google/devtools/build/lib/rules/SkylarkRuleImplementationFunctions.java
@@ -315,7 +315,7 @@
           try {
             return new LocationExpander(
                     ctx.getRuleContext(),
-                    makeLabelMap(targets.getContents(AbstractConfiguredTarget.class, "targets")),
+                    makeLabelMap(targets.getContents(TransitiveInfoCollection.class, "targets")),
                     false)
                 .expand(input);
           } catch (IllegalStateException ise) {
@@ -326,14 +326,15 @@
 
   /**
    * Builds a map: Label -> List of files from the given labels
+   *
    * @param knownLabels List of known labels
    * @return Immutable map with immutable collections as values
    */
   private static ImmutableMap<Label, ImmutableCollection<Artifact>> makeLabelMap(
-      Iterable<AbstractConfiguredTarget> knownLabels) {
+      Iterable<TransitiveInfoCollection> knownLabels) {
     ImmutableMap.Builder<Label, ImmutableCollection<Artifact>> builder = ImmutableMap.builder();
 
-    for (AbstractConfiguredTarget current : knownLabels) {
+    for (TransitiveInfoCollection current : knownLabels) {
       builder.put(
           AliasProvider.getDependencyLabel(current),
           ImmutableList.copyOf(current.getProvider(FileProvider.class).getFilesToBuild()));
