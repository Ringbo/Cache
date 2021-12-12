diff --git a/src/com/facebook/buck/android/AndroidBinaryBuildable.java b/src/com/facebook/buck/android/AndroidBinaryBuildable.java
index 49456e7..11e143c 100644
--- a/src/com/facebook/buck/android/AndroidBinaryBuildable.java
+++ b/src/com/facebook/buck/android/AndroidBinaryBuildable.java
@@ -151,7 +151,7 @@
   private final ImmutableSet<APKModule> apkModules;
   private final Supplier<Optional<ImmutableSortedSet<SourcePath>>>
       predexedSecondaryDexDirectoriesSupplier;
-  private final ImmutableSortedSet<SourcePath> classpathEntriesToDexSourcePaths;
+  private final ImmutableSet<SourcePath> classpathEntriesToDexSourcePaths;
 
   AndroidBinaryBuildable(
       BuildTarget buildTarget,
@@ -240,7 +240,7 @@
         RichStream.from(enhancementResult.getClasspathEntriesToDex())
             .concat(
                 RichStream.of(enhancementResult.getCompiledUberRDotJava().getSourcePathToOutput()))
-            .collect(MoreCollectors.toImmutableSortedSet());
+            .collect(MoreCollectors.toImmutableSet());
     this.predexedSecondaryDexDirectoriesSupplier =
         () -> enhancementResult.getPreDexMerge().map(PreDexMerge::getSecondaryDexDirectories);
     this.moduleMappedClasspathEntriesToDex =
