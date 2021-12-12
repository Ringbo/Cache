diff --git a/subprojects/core/src/main/groovy/org/gradle/plugin/resolve/internal/JCenterPluginMapper.java b/subprojects/core/src/main/groovy/org/gradle/plugin/resolve/internal/JCenterPluginMapper.java
index dfd30ea..b540e7c 100644
--- a/subprojects/core/src/main/groovy/org/gradle/plugin/resolve/internal/JCenterPluginMapper.java
+++ b/subprojects/core/src/main/groovy/org/gradle/plugin/resolve/internal/JCenterPluginMapper.java
@@ -44,15 +44,15 @@
                 search();
 
         if (results.isEmpty()) {
-            throw new InvalidPluginRequest("No plugins found for plugin id " + pluginId);
+            throw new InvalidPluginRequestException("No plugins found for plugin id " + pluginId);
         }
         if (results.size() > 1) {
-            throw new InvalidPluginRequest("Found more than one plugin for plugin id " + pluginId);
+            throw new InvalidPluginRequestException("Found more than one plugin for plugin id " + pluginId);
         }
         Pkg pluginPackage = results.get(0);
         List<String> systemIds = pluginPackage.systemIds();
         if (systemIds.isEmpty()) {
-            throw new InvalidPluginRequest("No artifacts in maven layout found for plugin id" + pluginId);
+            throw new InvalidPluginRequestException("No artifacts in maven layout found for plugin id" + pluginId);
         }
         String version = request.getVersion();
         if (version == null) {
