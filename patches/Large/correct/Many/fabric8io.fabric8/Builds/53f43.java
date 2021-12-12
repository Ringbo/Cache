diff --git a/components/kubernetes-api/src/main/java/io/fabric8/kubernetes/api/builds/Builds.java b/components/kubernetes-api/src/main/java/io/fabric8/kubernetes/api/builds/Builds.java
index 55b3444..3055196 100644
--- a/components/kubernetes-api/src/main/java/io/fabric8/kubernetes/api/builds/Builds.java
+++ b/components/kubernetes-api/src/main/java/io/fabric8/kubernetes/api/builds/Builds.java
@@ -55,7 +55,7 @@
     public static BuildConfig createDefaultBuildConfig(String name, String gitUrl, String jenkinsUrl) {
         BuildConfig buildConfig = new BuildConfig();
         getOrCreateMetadata(buildConfig).setName(name);
-        boolean foundExistingGitUrl = true;
+        boolean foundExistingGitUrl = false;
         return configureDefaultBuildConfig(buildConfig, name, gitUrl, foundExistingGitUrl, jenkinsUrl);
     }
 
