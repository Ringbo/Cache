diff --git a/src/main/java/org/elasticsearch/node/settings/NodeSettingsService.java b/src/main/java/org/elasticsearch/node/settings/NodeSettingsService.java
index 994c1542..a88863f 100644
--- a/src/main/java/org/elasticsearch/node/settings/NodeSettingsService.java
+++ b/src/main/java/org/elasticsearch/node/settings/NodeSettingsService.java
@@ -79,7 +79,7 @@
             for (Map.Entry<String, String> entry : event.state().metaData().settings().getAsMap().entrySet()) {
                 if (entry.getKey().startsWith("logger.")) {
                     String component = entry.getKey().substring("logger.".length());
-                    ESLoggerFactory.getLogger(component, entry.getValue()).setLevel(entry.getValue());
+                    ESLoggerFactory.getLogger(component).setLevel(entry.getValue());
                 }
             }
         } catch (Exception e) {
