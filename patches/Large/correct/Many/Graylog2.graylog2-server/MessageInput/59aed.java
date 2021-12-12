diff --git a/graylog2-plugin-interfaces/src/main/java/org/graylog2/plugin/inputs/MessageInput.java b/graylog2-plugin-interfaces/src/main/java/org/graylog2/plugin/inputs/MessageInput.java
index b965249..e97e15f 100644
--- a/graylog2-plugin-interfaces/src/main/java/org/graylog2/plugin/inputs/MessageInput.java
+++ b/graylog2-plugin-interfaces/src/main/java/org/graylog2/plugin/inputs/MessageInput.java
@@ -102,7 +102,7 @@
 
     public MessageInput(MetricRegistry metricRegistry,
                         Transport transport,
-                        LocalMetricRegistry localRegistry, Codec codec, Config config, Descriptor descriptor, ServerStatus serverStatus) {
+                        MetricRegistry localRegistry, Codec codec, Config config, Descriptor descriptor, ServerStatus serverStatus) {
         if (metricRegistry == localRegistry) {
             LOG.error("########### Do not add the global metric registry twice, the localRegistry parameter is " +
                               "the same as the global metricRegistry. " +
