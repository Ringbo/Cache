diff --git a/subprojects/plugins/src/main/groovy/org/gradle/api/plugins/BasePlugin.java b/subprojects/plugins/src/main/groovy/org/gradle/api/plugins/BasePlugin.java
index a16cd6e..94ed10a 100644
--- a/subprojects/plugins/src/main/groovy/org/gradle/api/plugins/BasePlugin.java
+++ b/subprojects/plugins/src/main/groovy/org/gradle/api/plugins/BasePlugin.java
@@ -145,10 +145,10 @@
         ConfigurationContainer configurations = project.getConfigurations();
         project.setProperty("status", "integration");
 
-        Configuration archivesConfiguration = configurations.create(Dependency.ARCHIVES_CONFIGURATION).
+        Configuration archivesConfiguration = configurations.maybeCreate(Dependency.ARCHIVES_CONFIGURATION).
                 setDescription("Configuration for archive artifacts.");
 
-        configurations.create(Dependency.DEFAULT_CONFIGURATION).
+        configurations.maybeCreate(Dependency.DEFAULT_CONFIGURATION).
                 setDescription("Configuration for default artifacts.");
 
         final DefaultArtifactPublicationSet defaultArtifacts = project.getExtensions().create(
