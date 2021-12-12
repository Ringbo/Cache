diff --git a/maven-core/src/main/java/org/apache/maven/plugin/DefaultBuildPluginManager.java b/maven-core/src/main/java/org/apache/maven/plugin/DefaultBuildPluginManager.java
index ba1a187..0f915c2 100644
--- a/maven-core/src/main/java/org/apache/maven/plugin/DefaultBuildPluginManager.java
+++ b/maven-core/src/main/java/org/apache/maven/plugin/DefaultBuildPluginManager.java
@@ -61,7 +61,7 @@
      * @throws PluginResolutionException The plugin could be found but could not be resolved.
      * @throws InvalidPluginDescriptorException 
      */
-    public synchronized PluginDescriptor loadPlugin( Plugin plugin, RepositoryRequest repositoryRequest )
+    public PluginDescriptor loadPlugin( Plugin plugin, RepositoryRequest repositoryRequest )
         throws PluginNotFoundException, PluginResolutionException, PluginDescriptorParsingException, InvalidPluginDescriptorException
     {
         return mavenPluginManager.getPluginDescriptor( plugin, repositoryRequest );
@@ -140,7 +140,7 @@
      *      call, which is not nice.
      * @throws ArtifactResolutionException 
      */
-    public synchronized ClassRealm getPluginRealm( MavenSession session, PluginDescriptor pluginDescriptor ) 
+    public ClassRealm getPluginRealm( MavenSession session, PluginDescriptor pluginDescriptor ) 
         throws PluginManagerException
     {
         ClassRealm pluginRealm = pluginDescriptor.getClassRealm();
