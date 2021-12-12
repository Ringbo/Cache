diff --git a/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-client-dto/src/main/java/org/apache/nifi/web/api/dto/FlowSnippetDTO.java b/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-client-dto/src/main/java/org/apache/nifi/web/api/dto/FlowSnippetDTO.java
index 9d5cf41..0ba10a1 100644
--- a/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-client-dto/src/main/java/org/apache/nifi/web/api/dto/FlowSnippetDTO.java
+++ b/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-client-dto/src/main/java/org/apache/nifi/web/api/dto/FlowSnippetDTO.java
@@ -227,7 +227,7 @@
                     Map<String, PropertyDescriptorDTO> map = processorDTO.getConfig().getDescriptors();
                     Map<String, String> props = processorDTO.getConfig().getProperties();
                     for (Entry<String, PropertyDescriptorDTO> entry : map.entrySet()) {
-                        if (entry.getValue().getIdentifiesControllerService() != null) {
+                        if (entry.getValue().getIdentifiesControllerService() != null && props.get(entry.getKey()) != null) {
                             String key = entry.getKey();
                             String value = props.get(key);
                             id = UUID.fromString(value);
