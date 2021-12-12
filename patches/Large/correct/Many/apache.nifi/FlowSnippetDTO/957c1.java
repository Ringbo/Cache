diff --git a/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-client-dto/src/main/java/org/apache/nifi/web/api/dto/FlowSnippetDTO.java b/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-client-dto/src/main/java/org/apache/nifi/web/api/dto/FlowSnippetDTO.java
index 0ba10a1..536c412 100644
--- a/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-client-dto/src/main/java/org/apache/nifi/web/api/dto/FlowSnippetDTO.java
+++ b/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-client-dto/src/main/java/org/apache/nifi/web/api/dto/FlowSnippetDTO.java
@@ -214,7 +214,7 @@
                     Map<String, PropertyDescriptorDTO> map = csDTO.getDescriptors();
                     Map<String, String> props = csDTO.getProperties();
                     for (Entry<String, PropertyDescriptorDTO> entry : map.entrySet()) {
-                        if (entry.getValue().getIdentifiesControllerService() != null) {
+                        if (entry.getValue().getIdentifiesControllerService() != null && props.get(entry.getKey()) != null) {
                             String key = entry.getKey();
                             String value = props.get(key);
                             id = UUID.fromString(value);
