diff --git a/maven-artifact-ant/src/main/java/org/apache/maven/artifact/ant/AbstractArtifactTask.java b/maven-artifact-ant/src/main/java/org/apache/maven/artifact/ant/AbstractArtifactTask.java
index 3027b4d..8884ff4 100755
--- a/maven-artifact-ant/src/main/java/org/apache/maven/artifact/ant/AbstractArtifactTask.java
+++ b/maven-artifact-ant/src/main/java/org/apache/maven/artifact/ant/AbstractArtifactTask.java
@@ -308,7 +308,7 @@
 
                     classWorld.newRealm( "plexus.core", getClass().getClassLoader() );
 
-                    container = new DefaultPlexusContainer( null, null, null, classWorld );
+                    container = new DefaultPlexusContainer( null, null, classWorld );
 
                 }
                 catch ( PlexusContainerException e )
