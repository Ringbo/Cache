diff --git a/core/che-core-gwt-maven-plugin/src/main/java/org/eclipse/che/plugin/gwt/ProcessExcludesMojo.java b/core/che-core-gwt-maven-plugin/src/main/java/org/eclipse/che/plugin/gwt/ProcessExcludesMojo.java
index 5c53d8b..e0b7941 100644
--- a/core/che-core-gwt-maven-plugin/src/main/java/org/eclipse/che/plugin/gwt/ProcessExcludesMojo.java
+++ b/core/che-core-gwt-maven-plugin/src/main/java/org/eclipse/che/plugin/gwt/ProcessExcludesMojo.java
@@ -160,7 +160,7 @@
         String[] split = pattern.split(":");
         String groupId = split[0];
         String artifactId = split[1];
-        String version = fullIdeArtifact.getVersion();
+        String version = fullIdeArtifact.getBaseVersion();
 
         Artifact artifact = repositorySystem.createArtifact(groupId, artifactId, version, "jar");
         String gwtModule = readGwtModuleName(artifact);
