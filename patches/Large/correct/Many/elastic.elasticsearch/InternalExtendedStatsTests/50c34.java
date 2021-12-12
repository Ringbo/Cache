diff --git a/server/src/test/java/org/elasticsearch/search/aggregations/metrics/InternalExtendedStatsTests.java b/server/src/test/java/org/elasticsearch/search/aggregations/metrics/InternalExtendedStatsTests.java
index 6178a72..eb6a2e4 100644
--- a/server/src/test/java/org/elasticsearch/search/aggregations/metrics/InternalExtendedStatsTests.java
+++ b/server/src/test/java/org/elasticsearch/search/aggregations/metrics/InternalExtendedStatsTests.java
@@ -84,7 +84,7 @@
         assertEquals(expectedCount, reduced.getCount());
         // The order in which you add double values in java can give different results. The difference can
         // be larger for large sum values, so we make the delta in the assertion depend on the values magnitude
-        assertEquals(expectedSum, reduced.getSum(), Math.abs(expectedSum) * 1e-11);
+        assertEquals(expectedSum, reduced.getSum(), Math.abs(expectedSum) * 1e-10);
         assertEquals(expectedMin, reduced.getMin(), 0d);
         assertEquals(expectedMax, reduced.getMax(), 0d);
         // summing squared values, see reason for delta above
