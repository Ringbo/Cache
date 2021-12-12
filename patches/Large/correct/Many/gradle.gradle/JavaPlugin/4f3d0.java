diff --git a/subprojects/plugins/src/main/groovy/org/gradle/api/plugins/JavaPlugin.java b/subprojects/plugins/src/main/groovy/org/gradle/api/plugins/JavaPlugin.java
index 5bf95a5..c09ec4d 100644
--- a/subprojects/plugins/src/main/groovy/org/gradle/api/plugins/JavaPlugin.java
+++ b/subprojects/plugins/src/main/groovy/org/gradle/api/plugins/JavaPlugin.java
@@ -80,16 +80,16 @@
         pluginConvention.getSourceSets().all(new Action<SourceSet>() {
             public void execute(SourceSet sourceSet) {
                 sourceSet.setCompileClasspath(project.getConfigurations().getByName(COMPILE_CONFIGURATION_NAME));
-                sourceSet.setRuntimeClasspath(sourceSet.getClasses().plus(project.getConfigurations().getByName(
+                sourceSet.setRuntimeClasspath(sourceSet.getOutput().plus(project.getConfigurations().getByName(
                         RUNTIME_CONFIGURATION_NAME)));
             }
         });
         SourceSet main = pluginConvention.getSourceSets().add(SourceSet.MAIN_SOURCE_SET_NAME);
 
         SourceSet test = pluginConvention.getSourceSets().add(SourceSet.TEST_SOURCE_SET_NAME);
-        test.setCompileClasspath(project.files(main.getClasses(), project.getConfigurations().getByName(
+        test.setCompileClasspath(project.files(main.getOutput(), project.getConfigurations().getByName(
                 TEST_COMPILE_CONFIGURATION_NAME)));
-        test.setRuntimeClasspath(project.files(test.getClasses(), main.getClasses(),
+        test.setRuntimeClasspath(project.files(test.getOutput(), main.getOutput(),
                 project.getConfigurations().getByName(TEST_RUNTIME_CONFIGURATION_NAME)));
     }
 
@@ -100,7 +100,7 @@
         Javadoc javadoc = project.getTasks().add(JAVADOC_TASK_NAME, Javadoc.class);
         javadoc.setDescription("Generates Javadoc API documentation for the main source code.");
         javadoc.setGroup(JavaBasePlugin.DOCUMENTATION_GROUP);
-        javadoc.setClasspath(mainSourceSet.getClasses().plus(mainSourceSet.getCompileClasspath()));
+        javadoc.setClasspath(mainSourceSet.getOutput().plus(mainSourceSet.getCompileClasspath()));
         javadoc.setSource(mainSourceSet.getAllJava());
         addDependsOnTaskInOtherProjects(javadoc, true, JAVADOC_TASK_NAME, COMPILE_CONFIGURATION_NAME);
     }
@@ -111,7 +111,7 @@
         jar.getManifest().from(pluginConvention.getManifest());
         jar.setDescription("Assembles a jar archive containing the main classes.");
         jar.setGroup(BasePlugin.BUILD_GROUP);
-        jar.from(pluginConvention.getSourceSets().getByName(SourceSet.MAIN_SOURCE_SET_NAME).getClasses());
+        jar.from(pluginConvention.getSourceSets().getByName(SourceSet.MAIN_SOURCE_SET_NAME).getOutput());
         jar.getMetaInf().from(new Callable() {
             public Object call() throws Exception {
                 return pluginConvention.getMetaInf();
