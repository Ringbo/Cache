diff --git a/src/main/java/org/bukkit/plugin/PluginDescriptionFile.java b/src/main/java/org/bukkit/plugin/PluginDescriptionFile.java
index 09e22cc..3975f38 100644
--- a/src/main/java/org/bukkit/plugin/PluginDescriptionFile.java
+++ b/src/main/java/org/bukkit/plugin/PluginDescriptionFile.java
@@ -127,7 +127,7 @@
      * @return immutable list of plugins that should consider this plugin a soft-dependency
      */
     public List<String> getLoadBefore() {
-        return softDepend;
+        return loadBefore;
     }
 
     public PluginLoadOrder getLoad() {
