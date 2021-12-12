diff --git a/java/compiler/impl/src/com/intellij/compiler/impl/CompileDriver.java b/java/compiler/impl/src/com/intellij/compiler/impl/CompileDriver.java
index d730b26..6141051 100644
--- a/java/compiler/impl/src/com/intellij/compiler/impl/CompileDriver.java
+++ b/java/compiler/impl/src/com/intellij/compiler/impl/CompileDriver.java
@@ -295,7 +295,7 @@
         switch (eventType) {
           case FILES_GENERATED:
             final List<CmdlineRemoteProto.Message.BuilderMessage.BuildEvent.GeneratedFile> generated = event.getGeneratedFilesList();
-            final CompilationStatusListener publisher = myProject.isDisposed()? messageBus.syncPublisher(CompilerTopics.COMPILATION_STATUS) : null;
+            final CompilationStatusListener publisher = !myProject.isDisposed()? messageBus.syncPublisher(CompilerTopics.COMPILATION_STATUS) : null;
             Set<String> writtenArtifactOutputPaths = outputToArtifact != null ? new THashSet<String>(FileUtil.PATH_HASHING_STRATEGY) : null;
             for (CmdlineRemoteProto.Message.BuilderMessage.BuildEvent.GeneratedFile generatedFile : generated) {
               final String root = FileUtil.toSystemIndependentName(generatedFile.getOutputRoot());
