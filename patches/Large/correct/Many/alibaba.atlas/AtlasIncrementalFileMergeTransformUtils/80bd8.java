diff --git a/atlas-gradle-plugin/atlas-plugin/src/main/java/com/android/build/gradle/internal/pipeline/AtlasIncrementalFileMergeTransformUtils.java b/atlas-gradle-plugin/atlas-plugin/src/main/java/com/android/build/gradle/internal/pipeline/AtlasIncrementalFileMergeTransformUtils.java
index 9acdc40..b8e372a 100644
--- a/atlas-gradle-plugin/atlas-plugin/src/main/java/com/android/build/gradle/internal/pipeline/AtlasIncrementalFileMergeTransformUtils.java
+++ b/atlas-gradle-plugin/atlas-plugin/src/main/java/com/android/build/gradle/internal/pipeline/AtlasIncrementalFileMergeTransformUtils.java
@@ -377,7 +377,7 @@
 
         for (DirectoryInput dirInput : transformInput.getDirectoryInputs()) {
             if (awbTransform == null) {
-                if (!AtlasBuildContext.atlasMainDexHelper.getMainResFiles().containsKey(dirInput.getFile().getAbsolutePath())) {
+                if (!AtlasBuildContext.atlasMainDexHelper.getMainSoFiles().containsKey(dirInput.getFile().getAbsolutePath())) {
                     continue;
                 }
 
