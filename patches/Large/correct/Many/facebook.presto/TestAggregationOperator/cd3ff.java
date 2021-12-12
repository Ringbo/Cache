diff --git a/presto-main/src/test/java/com/facebook/presto/operator/TestAggregationOperator.java b/presto-main/src/test/java/com/facebook/presto/operator/TestAggregationOperator.java
index 96ed093..ca888fb 100644
--- a/presto-main/src/test/java/com/facebook/presto/operator/TestAggregationOperator.java
+++ b/presto-main/src/test/java/com/facebook/presto/operator/TestAggregationOperator.java
@@ -107,7 +107,7 @@
                         DOUBLE_SUM.bind(ImmutableList.of(5), Optional.empty()),
                         maxVarcharColumn.bind(ImmutableList.of(6), Optional.empty())));
 
-        MaterializedResult expected = resultBuilder(driverContext.getSession(), BIGINT, BIGINT, DOUBLE, VARCHAR, BIGINT, BIGINT, DOUBLE, VARCHAR)
+        MaterializedResult expected = resultBuilder(driverContext.getSession(), BIGINT, BIGINT, DOUBLE, VARCHAR, BIGINT, BIGINT, REAL, DOUBLE, VARCHAR)
                 .row(100L, 4950L, 49.5, "399", 100L, 54950L, 44950.0f, 54950.0, "599")
                 .build();
 
