diff --git a/ql/src/java/org/apache/hadoop/hive/ql/optimizer/StatsOptimizer.java b/ql/src/java/org/apache/hadoop/hive/ql/optimizer/StatsOptimizer.java
index 31041af..18a27c4 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/optimizer/StatsOptimizer.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/optimizer/StatsOptimizer.java
@@ -919,7 +919,7 @@
         partNames.add(part.getName());
       }
       AcidUtils.TableSnapshot tableSnapshot =
-          AcidUtils.getTableSnapshot(hive.getConf(), tbl, true);
+          AcidUtils.getTableSnapshot(hive.getConf(), tbl);
 
       Map<String, List<ColumnStatisticsObj>> result = hive.getMSC().getPartitionColumnStatistics(
           tbl.getDbName(), tbl.getTableName(), partNames, Lists.newArrayList(colName),
