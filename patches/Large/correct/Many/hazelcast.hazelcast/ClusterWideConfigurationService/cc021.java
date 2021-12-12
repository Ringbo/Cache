diff --git a/hazelcast/src/main/java/com/hazelcast/internal/dynamicconfig/ClusterWideConfigurationService.java b/hazelcast/src/main/java/com/hazelcast/internal/dynamicconfig/ClusterWideConfigurationService.java
index 9d84fcb..ac4e3d9 100644
--- a/hazelcast/src/main/java/com/hazelcast/internal/dynamicconfig/ClusterWideConfigurationService.java
+++ b/hazelcast/src/main/java/com/hazelcast/internal/dynamicconfig/ClusterWideConfigurationService.java
@@ -318,7 +318,7 @@
 
     private void registerEventJournalConfig(EventJournalConfig eventJournalConfig, ConfigCheckMode configCheckMode) {
         String mapName = eventJournalConfig.getMapName();
-        String cacheName = eventJournalConfig.getMapName();
+        String cacheName = eventJournalConfig.getCacheName();
         synchronized (journalMutex) {
             EventJournalConfig currentMapJournalConfig = null;
             if (mapName != null) {
