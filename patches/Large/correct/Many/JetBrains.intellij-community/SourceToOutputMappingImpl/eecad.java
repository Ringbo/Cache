diff --git a/jps/jps-builders/src/org/jetbrains/jps/incremental/storage/SourceToOutputMappingImpl.java b/jps/jps-builders/src/org/jetbrains/jps/incremental/storage/SourceToOutputMappingImpl.java
index cd7f702..c3a922b 100644
--- a/jps/jps-builders/src/org/jetbrains/jps/incremental/storage/SourceToOutputMappingImpl.java
+++ b/jps/jps-builders/src/org/jetbrains/jps/incremental/storage/SourceToOutputMappingImpl.java
@@ -27,7 +27,7 @@
 
   @Override
   public void setOutput(@NotNull String srcPath, @NotNull String outputPath) throws IOException {
-    myMapping.update(outputPath, outputPath);
+    myMapping.update(srcPath, outputPath);
   }
 
   @Override
