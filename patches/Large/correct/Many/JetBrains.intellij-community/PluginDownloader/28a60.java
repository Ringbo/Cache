diff --git a/platform/platform-impl/src/com/intellij/openapi/updateSettings/impl/PluginDownloader.java b/platform/platform-impl/src/com/intellij/openapi/updateSettings/impl/PluginDownloader.java
index a7f87f4..ed6fd4b 100644
--- a/platform/platform-impl/src/com/intellij/openapi/updateSettings/impl/PluginDownloader.java
+++ b/platform/platform-impl/src/com/intellij/openapi/updateSettings/impl/PluginDownloader.java
@@ -193,7 +193,7 @@
 
   public static int compareVersionsSkipBrokenAndIncompatible(@NotNull IdeaPluginDescriptor existingPlugin, String newPluginVersion) {
     int state = comparePluginVersions(newPluginVersion, existingPlugin.getVersion());
-    if (state <= 0 && (PluginManagerCore.isBrokenPlugin(existingPlugin) || PluginManagerCore.isIncompatible(existingPlugin))) {
+    if (state < 0 && (PluginManagerCore.isBrokenPlugin(existingPlugin) || PluginManagerCore.isIncompatible(existingPlugin))) {
       state = 1;
     }
     return state;
