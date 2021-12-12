diff --git a/maven-embedder/src/main/java/org/apache/maven/embedder/MavenEmbedder.java b/maven-embedder/src/main/java/org/apache/maven/embedder/MavenEmbedder.java
index e61b631..999c526 100644
--- a/maven-embedder/src/main/java/org/apache/maven/embedder/MavenEmbedder.java
+++ b/maven-embedder/src/main/java/org/apache/maven/embedder/MavenEmbedder.java
@@ -382,7 +382,7 @@
 
         try
         {
-            container = new DefaultPlexusContainer( null, null, null, classWorld );
+            container = new DefaultPlexusContainer( null, null, classWorld );
         }
         catch ( PlexusContainerException e )
         {
