diff --git a/application/src/main/java/org/thingsboard/server/actors/plugin/PluginActorMessageProcessor.java b/application/src/main/java/org/thingsboard/server/actors/plugin/PluginActorMessageProcessor.java
index 72ae4bb..c1d2678 100644
--- a/application/src/main/java/org/thingsboard/server/actors/plugin/PluginActorMessageProcessor.java
+++ b/application/src/main/java/org/thingsboard/server/actors/plugin/PluginActorMessageProcessor.java
@@ -181,7 +181,7 @@
             logger.info("[{}] Plugin requires restart due to clazz change from {} to {}.",
                     entityId, oldPluginMd.getClazz(), pluginMd.getClazz());
             requiresRestart = true;
-        } else if (oldPluginMd.getConfiguration().equals(pluginMd.getConfiguration())) {
+        } else if (!oldPluginMd.getConfiguration().equals(pluginMd.getConfiguration())) {
             logger.info("[{}] Plugin requires restart due to configuration change from {} to {}.",
                     entityId, oldPluginMd.getConfiguration(), pluginMd.getConfiguration());
             requiresRestart = true;
