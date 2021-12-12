diff --git a/plugin/monitoring/src/test/java/org/elasticsearch/xpack/monitoring/collector/cluster/ClusterStatsMonitoringDocTests.java b/plugin/monitoring/src/test/java/org/elasticsearch/xpack/monitoring/collector/cluster/ClusterStatsMonitoringDocTests.java
index 8ff4bd7..4294979 100644
--- a/plugin/monitoring/src/test/java/org/elasticsearch/xpack/monitoring/collector/cluster/ClusterStatsMonitoringDocTests.java
+++ b/plugin/monitoring/src/test/java/org/elasticsearch/xpack/monitoring/collector/cluster/ClusterStatsMonitoringDocTests.java
@@ -272,8 +272,8 @@
 
         final PluginsAndModules mockPluginsAndModules = mock(PluginsAndModules.class);
         when(mockNodeInfo.getPlugins()).thenReturn(mockPluginsAndModules);
-        final PluginInfo pluginInfo = new PluginInfo("_plugin", "_plugin_desc", "_plugin_version", "_plugin_class",
-                                                     Collections.emptyList(), false, false);
+        final PluginInfo pluginInfo = new PluginInfo("_plugin", "_plugin_desc", "_plugin_version", Version.CURRENT,
+            "1.8", "_plugin_class", Collections.emptyList(), false, false);
         when(mockPluginsAndModules.getPluginInfos()).thenReturn(singletonList(pluginInfo));
 
         final OsInfo mockOsInfo = mock(OsInfo.class);
