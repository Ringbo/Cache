diff --git a/sonar-core/src/main/java/org/sonar/core/plugins/PluginInstaller.java b/sonar-core/src/main/java/org/sonar/core/plugins/PluginInstaller.java
index 55e82a5..9517667 100644
--- a/sonar-core/src/main/java/org/sonar/core/plugins/PluginInstaller.java
+++ b/sonar-core/src/main/java/org/sonar/core/plugins/PluginInstaller.java
@@ -121,7 +121,7 @@
       metadata.setBasePlugin(manifest.getBasePlugin());
       metadata.setImplementationBuild(manifest.getImplementationBuild());
       metadata.setParent(manifest.getParent());
-      metadata.setRequiredPlugins(Arrays.asList(manifest.getRequiresPlugins()));
+      metadata.setRequiredPlugins(Arrays.asList(manifest.getRequirePlugins()));
       metadata.setCore(isCore);
       return metadata;
 
