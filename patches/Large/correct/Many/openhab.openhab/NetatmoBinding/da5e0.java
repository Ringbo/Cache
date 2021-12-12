diff --git a/bundles/binding/org.openhab.binding.netatmo/src/main/java/org/openhab/binding/netatmo/internal/NetatmoBinding.java b/bundles/binding/org.openhab.binding.netatmo/src/main/java/org/openhab/binding/netatmo/internal/NetatmoBinding.java
index 29450ba..5f02034 100644
--- a/bundles/binding/org.openhab.binding.netatmo/src/main/java/org/openhab/binding/netatmo/internal/NetatmoBinding.java
+++ b/bundles/binding/org.openhab.binding.netatmo/src/main/java/org/openhab/binding/netatmo/internal/NetatmoBinding.java
@@ -210,7 +210,8 @@
 
                 // the config-key enumeration contains additional keys that we
                 // don't want to process here ...
-                if (CONFIG_REFRESH.equals(configKey) || "service.pid".equals(configKey)) {
+                if (CONFIG_GRANULARITY.equals(configKey) || CONFIG_REFRESH.equals(configKey)
+                        || "service.pid".equals(configKey)) {
                     continue;
                 }
 
