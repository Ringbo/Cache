diff --git a/src/main/java/org/bukkit/plugin/java/JavaPluginLoader.java b/src/main/java/org/bukkit/plugin/java/JavaPluginLoader.java
index d90d6a5..667fcb3 100644
--- a/src/main/java/org/bukkit/plugin/java/JavaPluginLoader.java
+++ b/src/main/java/org/bukkit/plugin/java/JavaPluginLoader.java
@@ -144,7 +144,7 @@
             throw new IllegalArgumentException("Plugin is not associated with this PluginLoader");
         }
 
-        if (plugin.isEnabled()) {
+        if (!plugin.isEnabled()) {
             JavaPlugin jPlugin = (JavaPlugin)plugin;
 
             server.getPluginManager().callEvent(new PluginEvent(Event.Type.PLUGIN_ENABLE, plugin));
@@ -158,7 +158,7 @@
             throw new IllegalArgumentException("Plugin is not associated with this PluginLoader");
         }
 
-        if (!plugin.isEnabled()) {
+        if (plugin.isEnabled()) {
             JavaPlugin jPlugin = (JavaPlugin)plugin;
 
             server.getPluginManager().callEvent(new PluginEvent(Event.Type.PLUGIN_DISABLE, plugin));
