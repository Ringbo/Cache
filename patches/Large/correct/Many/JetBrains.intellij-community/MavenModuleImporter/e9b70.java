diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/importing/MavenModuleImporter.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/importing/MavenModuleImporter.java
index c477e4e..07010df 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/importing/MavenModuleImporter.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/importing/MavenModuleImporter.java
@@ -364,7 +364,7 @@
         if (defaultMavenProfile == null) {
           defaultMavenProfile = new ProcessorConfigProfileImpl(MAVEN_DEFAULT_ANNOTATION_PROFILE);
           defaultMavenProfile.setEnabled(true);
-          moduleProfile.setOutputRelativeToContentRoot(true);
+          defaultMavenProfile.setOutputRelativeToContentRoot(true);
           defaultMavenProfile.setObtainProcessorsFromClasspath(true);
           defaultMavenProfile.setGeneratedSourcesDirectoryName(DEFAULT_ANNOTATION_PATH_OUTPUT, false);
           defaultMavenProfile.setGeneratedSourcesDirectoryName(DEFAULT_TEST_ANNOTATION_OUTPUT, true);
