diff --git a/maven-embedder/src/main/java/org/apache/maven/embedder/MavenEmbedder.java b/maven-embedder/src/main/java/org/apache/maven/embedder/MavenEmbedder.java
index 8a42a5b..e71a0d6 100644
--- a/maven-embedder/src/main/java/org/apache/maven/embedder/MavenEmbedder.java
+++ b/maven-embedder/src/main/java/org/apache/maven/embedder/MavenEmbedder.java
@@ -343,11 +343,11 @@
     private MavenProject readProject( File mavenProject, MavenExecutionRequest request )
         throws ProjectBuildingException, ExtensionScanningException
     {
-        getLogger().info( "Scanning for extensions: " + mavenProject );
+        getLogger().debug( "Scanning for extensions: " + mavenProject );
 
         extensionScanner.scanForBuildExtensions( mavenProject, request );
 
-        getLogger().info( "Building MavenProject instance: " + mavenProject );
+        getLogger().debug( "Building MavenProject instance: " + mavenProject );
 
         return mavenProjectBuilder.build( mavenProject, request.getLocalRepository(), request.getProfileManager() );
     }
