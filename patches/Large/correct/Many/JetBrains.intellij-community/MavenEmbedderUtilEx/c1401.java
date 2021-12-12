diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/embedder/MavenEmbedderUtilEx.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/embedder/MavenEmbedderUtilEx.java
index 8936bdf..56265d1 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/embedder/MavenEmbedderUtilEx.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/embedder/MavenEmbedderUtilEx.java
@@ -54,7 +54,7 @@
     File lib = resolveMavenLib(overrideMavenHome);
     if (lib == null) return null;
 
-    VirtualFile file = LocalFileSystem.getInstance().refreshAndFindFileByIoFile(lib);
+    VirtualFile file = LocalFileSystem.getInstance().findFileByIoFile(lib);
     if (file == null) return null;
 
     VirtualFile root = JarFileSystem.getInstance().getJarRootForLocalFile(file);
