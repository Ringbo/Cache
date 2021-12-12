diff --git a/benchmarks/src/main/java/io/druid/benchmark/ExpressionBenchmark.java b/benchmarks/src/main/java/io/druid/benchmark/ExpressionBenchmark.java
index 3a2f644..b554268 100644
--- a/benchmarks/src/main/java/io/druid/benchmark/ExpressionBenchmark.java
+++ b/benchmarks/src/main/java/io/druid/benchmark/ExpressionBenchmark.java
@@ -166,7 +166,8 @@
         index.getDataInterval(),
         VirtualColumns.EMPTY,
         Granularities.ALL,
-        false
+        false,
+        null
     );
 
     final List<Double> results = Sequences.toList(
