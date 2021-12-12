diff --git a/presto-main/src/test/java/com/facebook/presto/cost/TestSemiJoinStatsCalculator.java b/presto-main/src/test/java/com/facebook/presto/cost/TestSemiJoinStatsCalculator.java
index bd23432..f4de536 100644
--- a/presto-main/src/test/java/com/facebook/presto/cost/TestSemiJoinStatsCalculator.java
+++ b/presto-main/src/test/java/com/facebook/presto/cost/TestSemiJoinStatsCalculator.java
@@ -204,7 +204,7 @@
                 .outputRowsCount(inputStatistics.getOutputRowCount() * xStats.getValuesFraction() * 0.5);
 
         // source stats are unknown
-        assertThat(computeSemiJoin(inputStatistics, inputStatistics, unknown, u))
+        assertThat(computeAntiJoin(inputStatistics, inputStatistics, unknown, u))
                 .symbolStats(unknown, stats -> stats
                         .nullsFraction(0)
                         .distinctValuesCountUnknown()
@@ -214,7 +214,7 @@
                 .outputRowsCountUnknown();
 
         // filtering stats are unknown
-        assertThat(computeSemiJoin(inputStatistics, inputStatistics, x, unknown))
+        assertThat(computeAntiJoin(inputStatistics, inputStatistics, x, unknown))
                 .symbolStats(x, stats -> stats
                         .nullsFraction(0)
                         .lowValue(xStats.getLowValue())
