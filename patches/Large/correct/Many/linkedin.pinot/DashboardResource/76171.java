diff --git a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/dashboard/resources/DashboardResource.java b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/dashboard/resources/DashboardResource.java
index 457f7bf..83cf8b4 100644
--- a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/dashboard/resources/DashboardResource.java
+++ b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/dashboard/resources/DashboardResource.java
@@ -172,7 +172,7 @@
       HashMap<String, String> map = new HashMap<>();
       long maxDataTime = collectionMaxDataTimeCache.get(collection);
       DatasetConfigDTO datasetConfig = CACHE_REGISTRY_INSTANCE.getDatasetConfigCache().get(collection);
-      TimeSpec timespec = ThirdEyeUtils.getTimeSpecFromDatasetConfig(datasetConfig);
+      TimeSpec timespec = ThirdEyeUtils.getTimestampTimeSpecFromDatasetConfig(datasetConfig);
       TimeGranularity dataGranularity = timespec.getDataGranularity();
       map.put("maxTime", "" + maxDataTime);
       map.put("dataGranularity", dataGranularity.getUnit().toString());
