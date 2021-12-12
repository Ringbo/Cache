diff --git a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/client/cache/CollectionMaxDataTimeCacheLoader.java b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/client/cache/CollectionMaxDataTimeCacheLoader.java
index 385be8d..f99a323 100644
--- a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/client/cache/CollectionMaxDataTimeCacheLoader.java
+++ b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/client/cache/CollectionMaxDataTimeCacheLoader.java
@@ -54,7 +54,7 @@
       DatasetConfigDTO datasetConfig = datasetConfigDAO.findByDataset(collection);
       // By default, query only offline, unless dataset has been marked as realtime
       String tableName = ThirdEyeUtils.computeTableName(collection);
-      TimeSpec timeSpec = ThirdEyeUtils.getTimeSpecFromDatasetConfig(datasetConfig);
+      TimeSpec timeSpec = ThirdEyeUtils.getTimestampTimeSpecFromDatasetConfig(datasetConfig);
       long prevMaxDataTime = getPrevMaxDataTime(collection, timeSpec);
       String maxTimePql = String.format(COLLECTION_MAX_TIME_QUERY_TEMPLATE, timeSpec.getColumnName(), tableName,
           timeSpec.getColumnName(), prevMaxDataTime);
