diff --git a/presto-main/src/test/java/com/facebook/presto/operator/BenchmarkWindowOperator.java b/presto-main/src/test/java/com/facebook/presto/operator/BenchmarkWindowOperator.java
index bc1c981..353b92f 100644
--- a/presto-main/src/test/java/com/facebook/presto/operator/BenchmarkWindowOperator.java
+++ b/presto-main/src/test/java/com/facebook/presto/operator/BenchmarkWindowOperator.java
@@ -216,7 +216,7 @@
     @Benchmark
     public List<Page> benchmark(BenchmarkWindowOperator.Context context)
     {
-        DriverContext driverContext = context.createTaskContext().addPipelineContext(0, true, true).addDriverContext();
+        DriverContext driverContext = context.createTaskContext().addPipelineContext(0, true, true, false).addDriverContext();
         Operator operator = context.getOperatorFactory().createOperator(driverContext);
 
         Iterator<Page> input = context.getPages().iterator();
