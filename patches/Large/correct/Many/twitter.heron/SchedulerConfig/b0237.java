diff --git a/heron/spi/src/java/com/twitter/heron/spi/utils/SchedulerConfig.java b/heron/spi/src/java/com/twitter/heron/spi/utils/SchedulerConfig.java
index bf1592d..1d5c9ac 100644
--- a/heron/spi/src/java/com/twitter/heron/spi/utils/SchedulerConfig.java
+++ b/heron/spi/src/java/com/twitter/heron/spi/utils/SchedulerConfig.java
@@ -110,7 +110,7 @@
         Config.newBuilder()
             .putAll(sandboxConfigs())
             .putAll(commandLineConfigs(cluster, role, environ, verbose))
-            .putAll(topologyConfigs(topologyJarFile, topologyDefnFile, topology))
+            .putAll(topologyConfigs(topologyBinaryFile, topologyDefnFile, topology))
             .build());
 
     return config;
