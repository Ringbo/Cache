diff --git a/extensions-core/histogram/src/test/java/org/apache/druid/query/aggregation/histogram/sql/FixedBucketsHistogramQuantileSqlAggregatorTest.java b/extensions-core/histogram/src/test/java/org/apache/druid/query/aggregation/histogram/sql/FixedBucketsHistogramQuantileSqlAggregatorTest.java
index 4ba94fe..2bac9e0 100644
--- a/extensions-core/histogram/src/test/java/org/apache/druid/query/aggregation/histogram/sql/FixedBucketsHistogramQuantileSqlAggregatorTest.java
+++ b/extensions-core/histogram/src/test/java/org/apache/druid/query/aggregation/histogram/sql/FixedBucketsHistogramQuantileSqlAggregatorTest.java
@@ -161,7 +161,7 @@
 
     final PlannerConfig plannerConfig = new PlannerConfig();
     final DruidSchema druidSchema = CalciteTests.createMockSchema(conglomerate, walker, plannerConfig);
-    final SystemSchema systemSchema = CalciteTests.createMockSystemSchema(druidSchema, walker);
+    final SystemSchema systemSchema = CalciteTests.createMockSystemSchema(druidSchema, walker, plannerConfig);
     final DruidOperatorTable operatorTable = new DruidOperatorTable(
         ImmutableSet.of(new QuantileSqlAggregator(), new FixedBucketsHistogramQuantileSqlAggregator()),
         ImmutableSet.of()
