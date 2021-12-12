diff --git a/forge/addons/devops/src/main/java/io/fabric8/forge/devops/setup/DockerSetupHelper.java b/forge/addons/devops/src/main/java/io/fabric8/forge/devops/setup/DockerSetupHelper.java
index 76acb96..4b0e8ce 100644
--- a/forge/addons/devops/src/main/java/io/fabric8/forge/devops/setup/DockerSetupHelper.java
+++ b/forge/addons/devops/src/main/java/io/fabric8/forge/devops/setup/DockerSetupHelper.java
@@ -97,7 +97,7 @@
             if (bundle) {
                 commandShell = "/usr/bin/deploy-and-start";
             }
-            setupDockerConfiguration(configurationBuilder, envs, commandShell);
+            setupDockerConfiguration(configurationBuilder, envs, commandShell, springBoot, war, bundle, jar);
 
             MavenPluginFacet pluginFacet = project.getFacet(MavenPluginFacet.class);
             pluginFacet.addPlugin(pluginBuilder);
