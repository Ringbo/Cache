diff --git a/marvel/src/test/java/org/elasticsearch/marvel/MarvelPluginTests.java b/marvel/src/test/java/org/elasticsearch/marvel/MarvelPluginTests.java
index eeb8072..a366d5a 100644
--- a/marvel/src/test/java/org/elasticsearch/marvel/MarvelPluginTests.java
+++ b/marvel/src/test/java/org/elasticsearch/marvel/MarvelPluginTests.java
@@ -50,7 +50,7 @@
             assertNotNull(nodeInfo.getPlugins());
 
             boolean found = false;
-            for (PluginInfo plugin : nodeInfo.getPlugins().getInfos()) {
+            for (PluginInfo plugin : nodeInfo.getPlugins().getPluginInfos()) {
                 assertNotNull(plugin);
 
                 if (MarvelPlugin.NAME.equals(plugin.getName())) {
