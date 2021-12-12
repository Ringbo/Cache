diff --git a/extensions-core/datasketches/src/test/java/org/apache/druid/query/aggregation/datasketches/theta/sql/ThetaSketchSqlAggregatorTest.java b/extensions-core/datasketches/src/test/java/org/apache/druid/query/aggregation/datasketches/theta/sql/ThetaSketchSqlAggregatorTest.java
index e844864..919a596 100644
--- a/extensions-core/datasketches/src/test/java/org/apache/druid/query/aggregation/datasketches/theta/sql/ThetaSketchSqlAggregatorTest.java
+++ b/extensions-core/datasketches/src/test/java/org/apache/druid/query/aggregation/datasketches/theta/sql/ThetaSketchSqlAggregatorTest.java
@@ -162,7 +162,7 @@
 
     final PlannerConfig plannerConfig = new PlannerConfig();
     final DruidSchema druidSchema = CalciteTests.createMockSchema(conglomerate, walker, plannerConfig);
-    final SystemSchema systemSchema = CalciteTests.createMockSystemSchema(druidSchema, walker);
+    final SystemSchema systemSchema = CalciteTests.createMockSystemSchema(druidSchema, walker, plannerConfig);
     final DruidOperatorTable operatorTable = new DruidOperatorTable(
         ImmutableSet.of(new ThetaSketchSqlAggregator()),
         ImmutableSet.of()
