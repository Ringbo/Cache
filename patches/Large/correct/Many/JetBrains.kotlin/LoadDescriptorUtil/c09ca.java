diff --git a/compiler/tests/org/jetbrains/jet/jvm/compiler/LoadDescriptorUtil.java b/compiler/tests/org/jetbrains/jet/jvm/compiler/LoadDescriptorUtil.java
index 849562c..416375f 100644
--- a/compiler/tests/org/jetbrains/jet/jvm/compiler/LoadDescriptorUtil.java
+++ b/compiler/tests/org/jetbrains/jet/jvm/compiler/LoadDescriptorUtil.java
@@ -83,7 +83,7 @@
             @NotNull Disposable disposable
     ) throws IOException {
         JetFileAndExhaust fileAndExhaust = JetFileAndExhaust.createJetFileAndAnalyze(kotlinFile, disposable);
-        GenerationState state = GenerationUtils.compileFilesGetGenerationState(fileAndExhaust.getExhaust(), Collections.singletonList(
+        GenerationState state = GenerationUtils.compileFilesGetGenerationState(fileAndExhaust.getJetFile().getProject(), fileAndExhaust.getExhaust(), Collections.singletonList(
                 fileAndExhaust.getJetFile()));
         ClassFileFactory classFileFactory = state.getFactory();
         CompileEnvironmentUtil.writeToOutputDirectory(classFileFactory, outDir);
