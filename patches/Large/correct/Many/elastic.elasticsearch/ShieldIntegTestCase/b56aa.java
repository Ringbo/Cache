diff --git a/shield/src/test/java/org/elasticsearch/test/ShieldIntegTestCase.java b/shield/src/test/java/org/elasticsearch/test/ShieldIntegTestCase.java
index bb79971..8cb9b87 100644
--- a/shield/src/test/java/org/elasticsearch/test/ShieldIntegTestCase.java
+++ b/shield/src/test/java/org/elasticsearch/test/ShieldIntegTestCase.java
@@ -126,7 +126,7 @@
         for (NodeInfo nodeInfo : nodeInfos) {
             // TODO: disable this assertion for now, because the test framework randomly runs with mock plugins. Maybe we should run without mock plugins?
 //            assertThat(nodeInfo.getPlugins().getInfos(), hasSize(2));
-            Collection<String> pluginNames = nodeInfo.getPlugins().getInfos().stream().map(p -> p.getName()).collect(Collectors.toList());
+            Collection<String> pluginNames = nodeInfo.getPlugins().getPluginInfos().stream().map(p -> p.getName()).collect(Collectors.toList());
             assertThat("plugin [" + ShieldPlugin.NAME + "] not found in [" + pluginNames + "]", pluginNames.contains(ShieldPlugin.NAME), is(true));
             assertThat("plugin [" + licensePluginName() + "] not found in [" + pluginNames + "]", pluginNames.contains(licensePluginName()), is(true));
         }
