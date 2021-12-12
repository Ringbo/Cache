diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/MavenPluginDomUtil.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/MavenPluginDomUtil.java
index 28a9cb3..4e6e8ad 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/MavenPluginDomUtil.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/MavenPluginDomUtil.java
@@ -47,7 +47,7 @@
 
     File file = MavenArtifactUtil.getArtifactFile(MavenProjectsManager.getInstance(p).getLocalRepository(),
                                                     groupId, artifactId, version, "jar");
-    VirtualFile pluginFile = LocalFileSystem.getInstance().refreshAndFindFileByIoFile(file);
+    VirtualFile pluginFile = LocalFileSystem.getInstance().findFileByIoFile(file);
     if (pluginFile == null) return null;
 
     VirtualFile pluginJarRoot = JarFileSystem.getInstance().getJarRootForLocalFile(pluginFile);
