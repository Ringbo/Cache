diff --git a/modules/elasticsearch/src/main/java/org/elasticsearch/cluster/metadata/MetaDataCreateIndexService.java b/modules/elasticsearch/src/main/java/org/elasticsearch/cluster/metadata/MetaDataCreateIndexService.java
index e09b4dd..e815157 100644
--- a/modules/elasticsearch/src/main/java/org/elasticsearch/cluster/metadata/MetaDataCreateIndexService.java
+++ b/modules/elasticsearch/src/main/java/org/elasticsearch/cluster/metadata/MetaDataCreateIndexService.java
@@ -127,11 +127,11 @@
                     File mappingsDir = new File(environment.configFile(), "mappings");
                     if (mappingsDir.exists() && mappingsDir.isDirectory()) {
                         File defaultMappingsDir = new File(mappingsDir, "_default");
-                        if (mappingsDir.exists() && mappingsDir.isDirectory()) {
+                        if (defaultMappingsDir.exists() && defaultMappingsDir.isDirectory()) {
                             addMappings(mappings, defaultMappingsDir);
                         }
                         File indexMappingsDir = new File(mappingsDir, request.index);
-                        if (mappingsDir.exists() && mappingsDir.isDirectory()) {
+                        if (indexMappingsDir.exists() && indexMappingsDir.isDirectory()) {
                             addMappings(mappings, indexMappingsDir);
                         }
                     }
