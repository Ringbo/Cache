diff --git a/subprojects/plugins/src/main/java/org/gradle/api/plugins/JavaLibraryDistributionPlugin.java b/subprojects/plugins/src/main/java/org/gradle/api/plugins/JavaLibraryDistributionPlugin.java
index f22389e..a10daa4 100644
--- a/subprojects/plugins/src/main/java/org/gradle/api/plugins/JavaLibraryDistributionPlugin.java
+++ b/subprojects/plugins/src/main/java/org/gradle/api/plugins/JavaLibraryDistributionPlugin.java
@@ -35,7 +35,7 @@
     @Override
     public void apply(final ProjectInternal project) {
         this.project = project;
-        project.getPluginManager().apply(JavaPlugin.class);
+        project.getPluginManager().apply(JavaLibraryPlugin.class);
         project.getPluginManager().apply(DistributionPlugin.class);
 
         DefaultDistributionContainer defaultDistributionContainer =
@@ -49,7 +49,7 @@
 
         CopySpec libSpec = project.copySpec();
         libSpec.into("lib");
-        libSpec.from(project.getConfigurations().getByName("runtime"));
+        libSpec.from(project.getConfigurations().getByName(JavaPlugin.RUNTIME_CLASSPATH_CONFIGURATION_NAME));
 
         childSpec.with(libSpec);
 
