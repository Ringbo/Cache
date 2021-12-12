diff --git a/standalone-metastore/src/main/java/org/apache/hadoop/hive/metastore/columnstats/aggr/StringColumnStatsAggregator.java b/standalone-metastore/src/main/java/org/apache/hadoop/hive/metastore/columnstats/aggr/StringColumnStatsAggregator.java
index 2b8c493..9537647 100644
--- a/standalone-metastore/src/main/java/org/apache/hadoop/hive/metastore/columnstats/aggr/StringColumnStatsAggregator.java
+++ b/standalone-metastore/src/main/java/org/apache/hadoop/hive/metastore/columnstats/aggr/StringColumnStatsAggregator.java
@@ -178,7 +178,7 @@
           if (aggregateData == null) {
             aggregateData = newData.deepCopy();
           } else {
-            aggregateData.setAvgColLen(Math.min(aggregateData.getAvgColLen(),
+            aggregateData.setAvgColLen(Math.max(aggregateData.getAvgColLen(),
                 newData.getAvgColLen()));
             aggregateData.setMaxColLen(Math.max(aggregateData.getMaxColLen(),
                 newData.getMaxColLen()));
