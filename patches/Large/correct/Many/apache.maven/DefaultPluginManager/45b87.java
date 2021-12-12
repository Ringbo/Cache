diff --git a/maven-core/src/main/java/org/apache/maven/plugin/DefaultPluginManager.java b/maven-core/src/main/java/org/apache/maven/plugin/DefaultPluginManager.java
index 8ef6703..b70d20d 100644
--- a/maven-core/src/main/java/org/apache/maven/plugin/DefaultPluginManager.java
+++ b/maven-core/src/main/java/org/apache/maven/plugin/DefaultPluginManager.java
@@ -615,11 +615,11 @@
             // the lifecycle that is part of the lookup. Here we are specifically trying to keep
             // lookups that occur in contextualize calls in line with the right realm.
 
-            DefaultPlexusContainer.setLookupRealm( realm );
+            ClassRealm oldRealm = DefaultPlexusContainer.setLookupRealm( realm );
 
             plugin = (Mojo) container.lookup( Mojo.ROLE, mojoDescriptor.getRoleHint() );
 
-            DefaultPlexusContainer.setLookupRealm( null );
+            DefaultPlexusContainer.setLookupRealm( oldRealm );
 
             if ( report && !( plugin instanceof MavenReport ) )
             {
@@ -1073,11 +1073,11 @@
             if ( StringUtils.isNotEmpty( configuratorId ) )
             {
                 configurator =
-                    (ComponentConfigurator) pluginContainer.lookup( ComponentConfigurator.ROLE, configuratorId );
+                    (ComponentConfigurator) pluginContainer.lookup( ComponentConfigurator.ROLE, configuratorId, pluginRealm );
             }
             else
             {
-                configurator = (ComponentConfigurator) pluginContainer.lookup( ComponentConfigurator.ROLE );
+                configurator = (ComponentConfigurator) pluginContainer.lookup( ComponentConfigurator.ROLE, pluginRealm );
             }
 
             ConfigurationListener listener = new DebugConfigurationListener( getLogger() );
@@ -1209,6 +1209,7 @@
                                       String roleHint )
         throws PluginManagerException, ComponentLookupException
     {
+        // XXX this needs the plugin realm!
         return container.lookup( role, roleHint );
     }
 
@@ -1216,6 +1217,7 @@
                                     String role )
         throws ComponentLookupException, PluginManagerException
     {
+        // XXX this needs the plugin realm!
         return container.lookupMap( role );
     }
 }
