diff --git a/maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java b/maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java
index 2e7b959..9cd3010 100644
--- a/maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java
+++ b/maven-core/src/main/java/org/apache/maven/plugin/internal/DefaultMavenPluginManager.java
@@ -291,8 +291,8 @@
         return mojoDescriptor;
     }
 
-    public void setupPluginRealm( PluginDescriptor pluginDescriptor, MavenSession session, ClassLoader parent,
-                                  List<String> imports )
+    public synchronized void setupPluginRealm( PluginDescriptor pluginDescriptor, MavenSession session,
+                                               ClassLoader parent, List<String> imports )
         throws PluginResolutionException, PluginManagerException
     {
         Plugin plugin = pluginDescriptor.getPlugin();
