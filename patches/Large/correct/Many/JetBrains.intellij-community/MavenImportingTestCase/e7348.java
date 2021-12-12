diff --git a/plugins/maven/src/test/java/org/jetbrains/idea/maven/MavenImportingTestCase.java b/plugins/maven/src/test/java/org/jetbrains/idea/maven/MavenImportingTestCase.java
index 6e769b2..bfdfa29 100644
--- a/plugins/maven/src/test/java/org/jetbrains/idea/maven/MavenImportingTestCase.java
+++ b/plugins/maven/src/test/java/org/jetbrains/idea/maven/MavenImportingTestCase.java
@@ -311,7 +311,7 @@
   private void doImportProjects(List<VirtualFile> files, String... profiles) throws MavenException {
     myProfilesList = Arrays.asList(profiles);
 
-    myMavenProjectsManager.doInitComponent(true);
+    myMavenProjectsManager.doInitComponent(false);
     myMavenProjectsManager.setManagedFiles(files);
     myMavenProjectsManager.setActiveProfiles(myProfilesList);
     myMavenProjectsManager.reimport();
