diff --git a/maven-embedder/src/main/java/org/apache/maven/embedder/MavenEmbedder.java b/maven-embedder/src/main/java/org/apache/maven/embedder/MavenEmbedder.java
index a4cdcae..17881b9 100644
--- a/maven-embedder/src/main/java/org/apache/maven/embedder/MavenEmbedder.java
+++ b/maven-embedder/src/main/java/org/apache/maven/embedder/MavenEmbedder.java
@@ -598,7 +598,7 @@
 
             mavenProjectBuilder = (MavenProjectBuilder) container.lookup( MavenProjectBuilder.ROLE );
 
-            buildContextManager = (BuildContextManager) container.lookup( BuildContextManager.ROLE );
+            buildContextManager = (BuildContextManager) container.lookup( BuildContextManager.ROLE, "default" );
 
             // ----------------------------------------------------------------------
             // Artifact related components
@@ -608,7 +608,7 @@
 
             artifactFactory = (ArtifactFactory) container.lookup( ArtifactFactory.ROLE );
 
-            artifactResolver = (ArtifactResolver) container.lookup( ArtifactResolver.ROLE );
+            artifactResolver = (ArtifactResolver) container.lookup( ArtifactResolver.ROLE, "default" );
 
             defaultArtifactRepositoryLayout =
                 (ArtifactRepositoryLayout) container.lookup( ArtifactRepositoryLayout.ROLE, DEFAULT_LAYOUT_ID );
