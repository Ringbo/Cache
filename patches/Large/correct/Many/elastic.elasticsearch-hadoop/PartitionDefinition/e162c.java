diff --git a/mr/src/main/java/org/elasticsearch/hadoop/rest/PartitionDefinition.java b/mr/src/main/java/org/elasticsearch/hadoop/rest/PartitionDefinition.java
index f4c5a89..15724cb 100644
--- a/mr/src/main/java/org/elasticsearch/hadoop/rest/PartitionDefinition.java
+++ b/mr/src/main/java/org/elasticsearch/hadoop/rest/PartitionDefinition.java
@@ -177,7 +177,7 @@
 
     public Settings settings() {
         PropertiesSettings settings = new PropertiesSettings();
-        return serializedMapping != null ? settings.load(serializedSettings) : settings;
+        return serializedSettings != null ? settings.load(serializedSettings) : settings;
     }
 
     @Override
