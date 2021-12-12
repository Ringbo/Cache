diff --git a/pinot-controller/src/main/java/com/linkedin/pinot/controller/helix/core/retention/RetentionManager.java b/pinot-controller/src/main/java/com/linkedin/pinot/controller/helix/core/retention/RetentionManager.java
index bdf752f..c678b2e 100644
--- a/pinot-controller/src/main/java/com/linkedin/pinot/controller/helix/core/retention/RetentionManager.java
+++ b/pinot-controller/src/main/java/com/linkedin/pinot/controller/helix/core/retention/RetentionManager.java
@@ -191,7 +191,7 @@
 
     AbstractTableConfig realtimeTableConfig;
     try {
-      realtimeTableConfig = ZKMetadataProvider.getOfflineTableConfig(_pinotHelixResourceManager.getPropertyStore(), realtimeTableName);
+      realtimeTableConfig = ZKMetadataProvider.getRealtimeTableConfig(_pinotHelixResourceManager.getPropertyStore(), realtimeTableName);
     } catch (Exception e) {
       LOGGER.error("Error getting realtime table config from property store!", e);
       return tableToDeletionStrategyMap;
