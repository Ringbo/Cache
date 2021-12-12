diff --git a/maven-core/src/main/java/org/apache/maven/extension/DefaultBuildExtensionScanner.java b/maven-core/src/main/java/org/apache/maven/extension/DefaultBuildExtensionScanner.java
index 3a68365..99742a1 100644
--- a/maven-core/src/main/java/org/apache/maven/extension/DefaultBuildExtensionScanner.java
+++ b/maven-core/src/main/java/org/apache/maven/extension/DefaultBuildExtensionScanner.java
@@ -106,8 +106,6 @@
         scanInternal( pom, request, new ArrayList(), Collections.singletonList( pom ) );
     }
 
-    // TODO: Use a build-context cache object for visitedModelIdx and reactorFiles,
-    //       once we move to just-in-time project scanning.
     private void scanInternal( File pom,
                                MavenExecutionRequest request,
                                List visitedModelIds,
@@ -319,8 +317,7 @@
                                                Set managedPluginsWithExtensionsFlag )
         throws ExtensionScanningException
     {
-        // FIXME: Fix the log level here.
-        getLogger().info( "Checking " + model.getId() + " for extensions." );
+        getLogger().debug( "Checking " + model.getId() + " for extensions." );
 
         Build build = model.getBuild();
 
