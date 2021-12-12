diff --git a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenPluginCompletionAndResolutionTest.java b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenPluginCompletionAndResolutionTest.java
index 12f9068..da37e72 100644
--- a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenPluginCompletionAndResolutionTest.java
+++ b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenPluginCompletionAndResolutionTest.java
@@ -110,7 +110,7 @@
 
     String pluginPath = "plugins/org/apache/maven/plugins/maven-compiler-plugin/2.0.2/maven-compiler-plugin-2.0.2.pom";
     String filePath = myIndicesFixture.getRepositoryHelper().getTestDataPath(pluginPath);
-    VirtualFile f = LocalFileSystem.getInstance().findFileByPath(filePath);
+    VirtualFile f = LocalFileSystem.getInstance().refreshAndFindFileByPath(filePath);
     assertResolved(myProjectPom, findPsiFile(f));
   }
 
