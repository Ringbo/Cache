diff --git a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/dashboard/resources/v2/DataResource.java b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/dashboard/resources/v2/DataResource.java
index dfc231e..4934c84 100644
--- a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/dashboard/resources/v2/DataResource.java
+++ b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/dashboard/resources/v2/DataResource.java
@@ -786,13 +786,13 @@
    * @return {@code true} if anomaly passed the filters, {@code false} otherwise
    */
   static boolean applyAnomalyFilters(MergedAnomalyResultDTO anomaly, Multimap<String, String> filters) {
-    DimensionMap dim = anomaly.getDimensions();
+    Multimap<String, String> anomalyFilter = AnomaliesResource.generateFilterSetForTimeSeriesQuery(anomaly);
     for (String filterKey : filters.keySet()) {
-      if (!dim.containsKey(filterKey))
+      if (!anomalyFilter.containsKey(filterKey))
         return false;
 
       Collection<String> filterValues = filters.get(filterKey);
-      if (!filterValues.contains(dim.get(filterKey)))
+      if (!filterValues.containsAll(anomalyFilter.get(filterKey)))
         return false;
     }
     return true;
