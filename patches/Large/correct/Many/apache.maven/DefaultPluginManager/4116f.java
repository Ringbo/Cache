diff --git a/maven-core/src/main/java/org/apache/maven/plugin/DefaultPluginManager.java b/maven-core/src/main/java/org/apache/maven/plugin/DefaultPluginManager.java
index d03884c..c4d623a 100644
--- a/maven-core/src/main/java/org/apache/maven/plugin/DefaultPluginManager.java
+++ b/maven-core/src/main/java/org/apache/maven/plugin/DefaultPluginManager.java
@@ -1122,7 +1122,7 @@
             }
             else
             {
-                configurator = (ComponentConfigurator) pluginContainer.lookup( ComponentConfigurator.ROLE, pluginRealm );
+                configurator = (ComponentConfigurator) pluginContainer.lookup( ComponentConfigurator.ROLE, "basic", pluginRealm );
             }
 
             ConfigurationListener listener = new DebugConfigurationListener( getLogger() );
