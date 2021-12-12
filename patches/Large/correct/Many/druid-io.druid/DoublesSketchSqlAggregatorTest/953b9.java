diff --git a/extensions-core/datasketches/src/test/java/org/apache/druid/query/aggregation/datasketches/quantiles/sql/DoublesSketchSqlAggregatorTest.java b/extensions-core/datasketches/src/test/java/org/apache/druid/query/aggregation/datasketches/quantiles/sql/DoublesSketchSqlAggregatorTest.java
index ffbcc22..2b4e5e0 100644
--- a/extensions-core/datasketches/src/test/java/org/apache/druid/query/aggregation/datasketches/quantiles/sql/DoublesSketchSqlAggregatorTest.java
+++ b/extensions-core/datasketches/src/test/java/org/apache/druid/query/aggregation/datasketches/quantiles/sql/DoublesSketchSqlAggregatorTest.java
@@ -157,7 +157,7 @@
 
     final PlannerConfig plannerConfig = new PlannerConfig();
     final DruidSchema druidSchema = CalciteTests.createMockSchema(conglomerate, walker, plannerConfig);
-    final SystemSchema systemSchema = CalciteTests.createMockSystemSchema(druidSchema, walker);
+    final SystemSchema systemSchema = CalciteTests.createMockSystemSchema(druidSchema, walker, plannerConfig);
     final DruidOperatorTable operatorTable = new DruidOperatorTable(
         ImmutableSet.of(new DoublesSketchSqlAggregator()),
         ImmutableSet.of()
