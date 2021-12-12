diff --git a/src/main/java/org/elasticsearch/cluster/metadata/MetaDataMappingService.java b/src/main/java/org/elasticsearch/cluster/metadata/MetaDataMappingService.java
index 048ab76..15f377e 100644
--- a/src/main/java/org/elasticsearch/cluster/metadata/MetaDataMappingService.java
+++ b/src/main/java/org/elasticsearch/cluster/metadata/MetaDataMappingService.java
@@ -310,7 +310,7 @@
 
             @Override
             public void onAckTimeout() {
-                listener.onResponse(new ClusterStateUpdateResponse(true));
+                listener.onResponse(new ClusterStateUpdateResponse(false));
             }
 
             @Override
