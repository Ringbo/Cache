diff --git a/sonar-server/src/main/java/org/sonar/server/plugins/PluginDeployer.java b/sonar-server/src/main/java/org/sonar/server/plugins/PluginDeployer.java
index 66fd02d..84edb65 100644
--- a/sonar-server/src/main/java/org/sonar/server/plugins/PluginDeployer.java
+++ b/sonar-server/src/main/java/org/sonar/server/plugins/PluginDeployer.java
@@ -149,7 +149,7 @@
   }
 
   public void uninstall(String pluginKey) {
-    for (String key : getPluginReferential().findReleasesWithDependencies(pluginKey)) {
+    for (String key : getPluginReferential().findLastReleasesWithDependencies(pluginKey)) {
       uninstallPlugin(key);
     }
   }
