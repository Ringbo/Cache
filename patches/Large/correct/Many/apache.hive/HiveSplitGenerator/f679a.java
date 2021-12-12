diff --git a/ql/src/java/org/apache/hadoop/hive/ql/exec/tez/HiveSplitGenerator.java b/ql/src/java/org/apache/hadoop/hive/ql/exec/tez/HiveSplitGenerator.java
index 532d242..8ebfe69 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/exec/tez/HiveSplitGenerator.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/exec/tez/HiveSplitGenerator.java
@@ -140,7 +140,7 @@
               TezMapReduceSplitsGrouper.TEZ_GROUPING_SPLIT_MIN_SIZE,
               TezMapReduceSplitsGrouper.TEZ_GROUPING_SPLIT_MIN_SIZE_DEFAULT);
           final long preferredSplitSize = Math.min(blockSize / 2, minGrouping);
-          HiveConf.setLongVar(conf, HiveConf.ConfVars.MAPREDMINSPLITSIZE, preferredSplitSize);
+          HiveConf.setLongVar(jobConf, HiveConf.ConfVars.MAPREDMINSPLITSIZE, preferredSplitSize);
           LOG.info("The preferred split size is " + preferredSplitSize);
         }
 
