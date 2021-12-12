diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/importing/configurers/MavenAnnotationProcessorConfigurer.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/importing/configurers/MavenAnnotationProcessorConfigurer.java
index f160457..e5bfaa7 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/importing/configurers/MavenAnnotationProcessorConfigurer.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/importing/configurers/MavenAnnotationProcessorConfigurer.java
@@ -158,7 +158,7 @@
   }
 
   @Nullable
-  private String getRelativeAnnotationProcessorDirectory(MavenProject mavenProject, boolean isTest) {
+  private static String getRelativeAnnotationProcessorDirectory(MavenProject mavenProject, boolean isTest) {
     String annotationProcessorDirectory = mavenProject.getAnnotationProcessorDirectory(isTest);
     File annotationProcessorDirectoryFile = new File(annotationProcessorDirectory);
     if (!annotationProcessorDirectoryFile.isAbsolute()) {
