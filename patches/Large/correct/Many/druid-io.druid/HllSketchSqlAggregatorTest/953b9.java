diff --git a/extensions-core/datasketches/src/test/java/org/apache/druid/query/aggregation/datasketches/hll/sql/HllSketchSqlAggregatorTest.java b/extensions-core/datasketches/src/test/java/org/apache/druid/query/aggregation/datasketches/hll/sql/HllSketchSqlAggregatorTest.java
index 46eb02c..1690ef9 100644
--- a/extensions-core/datasketches/src/test/java/org/apache/druid/query/aggregation/datasketches/hll/sql/HllSketchSqlAggregatorTest.java
+++ b/extensions-core/datasketches/src/test/java/org/apache/druid/query/aggregation/datasketches/hll/sql/HllSketchSqlAggregatorTest.java
@@ -161,7 +161,7 @@
 
     final PlannerConfig plannerConfig = new PlannerConfig();
     final DruidSchema druidSchema = CalciteTests.createMockSchema(conglomerate, walker, plannerConfig);
-    final SystemSchema systemSchema = CalciteTests.createMockSystemSchema(druidSchema, walker);
+    final SystemSchema systemSchema = CalciteTests.createMockSystemSchema(druidSchema, walker, plannerConfig);
     final DruidOperatorTable operatorTable = new DruidOperatorTable(
         ImmutableSet.of(new HllSketchSqlAggregator()),
         ImmutableSet.of()
