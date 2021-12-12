diff --git a/flex/src/com/intellij/javascript/flex/maven/Flexmojos3GenerateConfigTask.java b/flex/src/com/intellij/javascript/flex/maven/Flexmojos3GenerateConfigTask.java
index c0e5503..d511cd8 100644
--- a/flex/src/com/intellij/javascript/flex/maven/Flexmojos3GenerateConfigTask.java
+++ b/flex/src/com/intellij/javascript/flex/maven/Flexmojos3GenerateConfigTask.java
@@ -195,7 +195,7 @@
       if (mainClassFile == null || mainClassFile.isDirectory()) return;
       
       final VirtualFile sourceRoot = ProjectRootManager.getInstance(module.getProject()).getFileIndex().getSourceRootForFile(mainClassFile);
-      final String relativePath = sourceRoot == null ? null : VfsUtilCore.getRelativePath(sourceRoot, mainClassFile, '/');
+      final String relativePath = sourceRoot == null ? null : VfsUtilCore.getRelativePath(mainClassFile, sourceRoot, '/');
       final String mainClass = relativePath == null
                                ? mainClassFile.getNameWithoutExtension()
                                : FileUtil.getNameWithoutExtension(relativePath).replace('/', '.');
