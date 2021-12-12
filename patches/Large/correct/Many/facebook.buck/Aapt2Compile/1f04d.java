diff --git a/src/com/facebook/buck/android/Aapt2Compile.java b/src/com/facebook/buck/android/Aapt2Compile.java
index 27678ee..ab77900 100644
--- a/src/com/facebook/buck/android/Aapt2Compile.java
+++ b/src/com/facebook/buck/android/Aapt2Compile.java
@@ -57,7 +57,7 @@
     steps.add(
         new Aapt2CompileStep(
             getProjectFilesystem().getRootPath(),
-            context.getSourcePathResolver().getRelativePath(resDir),
+            context.getSourcePathResolver().getAbsolutePath(resDir),
             getOutputPath()));
     steps.add(ZipScrubberStep.of(getProjectFilesystem().resolve(getOutputPath())));
     buildableContext.recordArtifact(getOutputPath());
