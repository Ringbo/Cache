diff --git a/maven-core/src/main/java/org/apache/maven/plugin/DefaultPluginManager.java b/maven-core/src/main/java/org/apache/maven/plugin/DefaultPluginManager.java
index 481aec2..b4b24c0 100644
--- a/maven-core/src/main/java/org/apache/maven/plugin/DefaultPluginManager.java
+++ b/maven-core/src/main/java/org/apache/maven/plugin/DefaultPluginManager.java
@@ -541,7 +541,7 @@
 
                 unresolved.removeAll( resolved );
 
-                resolveCoreArtifacts( unresolved, localRepository );
+                resolveCoreArtifacts( unresolved, localRepository, resolutionGroup.getResolutionRepositories() );
 
                 List allResolved = new ArrayList( resolved.size() + unresolved.size() );
 
@@ -565,7 +565,8 @@
         }
     }
 
-    private void resolveCoreArtifacts( List unresolved, ArtifactRepository localRepository )
+    private void resolveCoreArtifacts( List unresolved, ArtifactRepository localRepository,
+                                       List resolutionRepositories )
         throws ArtifactResolutionException
     {
         for ( Iterator it = unresolved.iterator(); it.hasNext(); )
@@ -583,7 +584,7 @@
 
                 if ( resourceUrl == null )
                 {
-                    artifactResolver.resolve( artifact, unresolved, localRepository );
+                    artifactResolver.resolve( artifact, resolutionRepositories, localRepository );
 
                     artifactFile = artifact.getFile();
                 }
