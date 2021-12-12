diff --git a/plugins/maven/src/test/java/org/jetbrains/idea/maven/project/MavenProjectsManagerTest.java b/plugins/maven/src/test/java/org/jetbrains/idea/maven/project/MavenProjectsManagerTest.java
index 3a10953..34a3bec 100644
--- a/plugins/maven/src/test/java/org/jetbrains/idea/maven/project/MavenProjectsManagerTest.java
+++ b/plugins/maven/src/test/java/org/jetbrains/idea/maven/project/MavenProjectsManagerTest.java
@@ -5,7 +5,7 @@
 
 public class MavenProjectsManagerTest extends MavenTestCase {
   public void testShouldReturnNullForUnprocessedFiles() throws Exception {
-    MavenProjectsManager.getInstance(myProject).doInitComponent(true);
+    MavenProjectsManager.getInstance(myProject).doInitComponent(false);
 
     // this pom file doesn't belong to any of the modules, this is won't be processed
     // by MavenProjectProjectsManager and won't occur in its projects list.
