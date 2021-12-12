diff --git a/maven-project/src/main/java/org/apache/maven/LegacyRepositorySystem.java b/maven-project/src/main/java/org/apache/maven/LegacyRepositorySystem.java
index b144143..addb960 100644
--- a/maven-project/src/main/java/org/apache/maven/LegacyRepositorySystem.java
+++ b/maven-project/src/main/java/org/apache/maven/LegacyRepositorySystem.java
@@ -142,7 +142,8 @@
 			ArtifactFilter filter )
 			throws ArtifactResolutionException, ArtifactNotFoundException 
     {
-    	return artifactResolver.resolveTransitively(artifacts, originatingArtifact, remoteRepositories, localRepository, artifactMetadataSource );    	
+        return artifactResolver.resolveTransitively( artifacts, originatingArtifact, localRepository,
+                                                     remoteRepositories, artifactMetadataSource, filter );
 	}
 
     public Set<Artifact> createArtifacts(
@@ -463,6 +464,7 @@
         throws ArtifactResolutionException, ArtifactNotFoundException
     {
         File artifactFile = new File( localRepository.getBasedir(), localRepository.pathOf( artifact ) );
+        // FIXME: Not sure whether this is just intermediate code but the call belows wrecks havoc on system dependencies
         artifact.setFile( artifactFile );
         artifactResolver.resolve( artifact, remoteRepositories, localRepository );
     }    
