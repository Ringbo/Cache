diff --git a/processing/src/test/java/io/druid/query/timeseries/TimeseriesQueryRunnerBonusTest.java b/processing/src/test/java/io/druid/query/timeseries/TimeseriesQueryRunnerBonusTest.java
index b31ff2b..d1497a1 100644
--- a/processing/src/test/java/io/druid/query/timeseries/TimeseriesQueryRunnerBonusTest.java
+++ b/processing/src/test/java/io/druid/query/timeseries/TimeseriesQueryRunnerBonusTest.java
@@ -90,7 +90,7 @@
     final QueryRunnerFactory factory = TimeseriesQueryRunnerFactory.create();
     final QueryRunner<Result<TimeseriesResultValue>> runner = makeQueryRunner(
         factory,
-        new IncrementalIndexSegment(index)
+        new IncrementalIndexSegment(index, null)
     );
 
     TimeseriesQuery query = Druids.newTimeseriesQueryBuilder()
