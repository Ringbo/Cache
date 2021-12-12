diff --git a/forge/addons/openshift/src/main/java/io/fabric8/forge/openshift/BuildConfigs.java b/forge/addons/openshift/src/main/java/io/fabric8/forge/openshift/BuildConfigs.java
index 6ea69aa..0ba27cd 100644
--- a/forge/addons/openshift/src/main/java/io/fabric8/forge/openshift/BuildConfigs.java
+++ b/forge/addons/openshift/src/main/java/io/fabric8/forge/openshift/BuildConfigs.java
@@ -41,7 +41,7 @@
                 build();
     }
 
-    public static BuildParameters addBuildParameterOutput(BuildParametersBuilder builder, String imageTag) {
+    public static BuildConfigSpec addBuildParameterOutput(BuildConfigSpecBuilder builder, String imageTag) {
         return builder.
                 withNewOutput().
                 withTag(imageTag).
@@ -50,7 +50,7 @@
                 build();
     }
 
-    public static BuildParameters addBuildParameterGitSource(BuildParametersBuilder builder, String gitUrl) {
+    public static BuildConfigSpec addBuildParameterGitSource(BuildConfigSpecBuilder builder, String gitUrl) {
         return builder.
                 withNewSource().
                 withType("Git").
@@ -59,7 +59,7 @@
                 build();
     }
 
-    public static BuildParameters addBuildParameterStiStrategy(BuildParametersBuilder builder, String image) {
+    public static BuildConfigSpec addBuildConfigSpectiStrategy(BuildConfigSpecBuilder builder, String image) {
         return builder.
                 withNewStrategy().
                 withType("STI").
@@ -71,7 +71,7 @@
     }
 
 
-    public static BuildParameters addBuildParameterCustomStrategy(BuildParametersBuilder builder, String image, List<EnvVar> envVars) {
+    public static BuildConfigSpec addBuildParameterCustomStrategy(BuildConfigSpecBuilder builder, String image, List<EnvVar> envVars) {
         return builder.
                 withNewStrategy().
                 withType("Custom").
@@ -84,7 +84,7 @@
     }
 
 
-    public static BuildConfigBuilder buildConfigBuilder(String buildName, Map<String, String> labels, BuildParameters parameters) {
+    public static BuildConfigBuilder buildConfigBuilder(String buildName, Map<String, String> labels, BuildConfigSpec parameters) {
         return buildConfigBuilder(buildName, labels).
                 withParameters(parameters);
     }
@@ -109,13 +109,13 @@
     }
 
     public static BuildConfig createBuildConfig(String buildConfigName, Map<String, String> labels, String gitUrlText, String outputImageTagText, String imageText, String webhookSecret) {
-        BuildParametersBuilder parametersBuilder = new BuildParametersBuilder();
+        BuildConfigSpecBuilder parametersBuilder = new BuildConfigSpecBuilder();
         addBuildParameterGitSource(parametersBuilder, gitUrlText);
         if (Strings.isNotBlank(outputImageTagText)) {
             addBuildParameterOutput(parametersBuilder, outputImageTagText);
         }
         if (Strings.isNotBlank(imageText)) {
-            addBuildParameterStiStrategy(parametersBuilder, imageText);
+            addBuildConfigSpectiStrategy(parametersBuilder, imageText);
         }
         BuildConfigBuilder builder = buildConfigBuilder(buildConfigName, labels, parametersBuilder.build());
         if (Strings.isNotBlank(webhookSecret)) {
@@ -125,7 +125,7 @@
     }
 
     public static BuildConfig createIntegrationTestBuildConfig(String buildConfigName, Map<String, String> labels, String gitUrlText, String image, List<EnvVar> envVars) {
-        BuildParametersBuilder parametersBuilder = new BuildParametersBuilder();
+        BuildConfigSpecBuilder parametersBuilder = new BuildConfigSpecBuilder();
         addBuildParameterGitSource(parametersBuilder, gitUrlText);
         if (Strings.isNotBlank(image)) {
             addBuildParameterCustomStrategy(parametersBuilder, image, envVars);
