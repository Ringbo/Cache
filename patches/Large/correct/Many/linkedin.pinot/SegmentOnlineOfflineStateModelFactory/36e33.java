diff --git a/pinot-server/src/main/java/com/linkedin/pinot/server/starter/helix/SegmentOnlineOfflineStateModelFactory.java b/pinot-server/src/main/java/com/linkedin/pinot/server/starter/helix/SegmentOnlineOfflineStateModelFactory.java
index 7c0c4a0..80304ca 100644
--- a/pinot-server/src/main/java/com/linkedin/pinot/server/starter/helix/SegmentOnlineOfflineStateModelFactory.java
+++ b/pinot-server/src/main/java/com/linkedin/pinot/server/starter/helix/SegmentOnlineOfflineStateModelFactory.java
@@ -186,7 +186,7 @@
             try {
               if (!isNewSegmentMetadata(segmentMetadataFromServer, segmentMetadataForCheck)) {
                 LOGGER.info("Trying to bootstrap segment from local!");
-                AbstractTableConfig tableConfig = ZKMetadataProvider.getRealtimeTableConfig(propertyStore, tableName);
+                AbstractTableConfig tableConfig = ZKMetadataProvider.getOfflineTableConfig(propertyStore, tableName);
                 INSTANCE_DATA_MANAGER.addSegment(segmentMetadataFromServer, tableConfig);
                 return;
               }
@@ -207,7 +207,7 @@
           for (retryCount = 0; retryCount < SEGMENT_LOAD_MAX_RETRY_COUNT; ++retryCount) {
             long attemptStartTime = System.currentTimeMillis();
             try {
-              AbstractTableConfig tableConfig = ZKMetadataProvider.getRealtimeTableConfig(propertyStore, tableName);
+              AbstractTableConfig tableConfig = ZKMetadataProvider.getOfflineTableConfig(propertyStore, tableName);
               final String uri = offlineSegmentZKMetadata.getDownloadUrl();
               final String localSegmentDir = downloadSegmentToLocal(uri, tableName, segmentId);
               final SegmentMetadata segmentMetadata =
