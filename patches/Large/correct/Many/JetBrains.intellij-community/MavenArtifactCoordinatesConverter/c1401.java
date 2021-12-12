diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/converters/MavenArtifactCoordinatesConverter.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/converters/MavenArtifactCoordinatesConverter.java
index 1c9c3cc..06164dc 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/converters/MavenArtifactCoordinatesConverter.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/converters/MavenArtifactCoordinatesConverter.java
@@ -181,7 +181,7 @@
       File file = makeLocalRepositoryFile(id, projectsManager.getLocalRepository());
       if (file == null) return null;
 
-      VirtualFile virtualFile = LocalFileSystem.getInstance().refreshAndFindFileByIoFile(file);
+      VirtualFile virtualFile = LocalFileSystem.getInstance().findFileByIoFile(file);
       if (virtualFile == null) return null;
 
       return psiManager.findFile(virtualFile);
