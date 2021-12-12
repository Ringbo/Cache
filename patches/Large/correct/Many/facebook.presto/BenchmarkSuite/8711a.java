diff --git a/presto-benchmark/src/main/java/com/facebook/presto/benchmark/BenchmarkSuite.java b/presto-benchmark/src/main/java/com/facebook/presto/benchmark/BenchmarkSuite.java
index 91f048f..f719a48 100644
--- a/presto-benchmark/src/main/java/com/facebook/presto/benchmark/BenchmarkSuite.java
+++ b/presto-benchmark/src/main/java/com/facebook/presto/benchmark/BenchmarkSuite.java
@@ -95,7 +95,7 @@
         this.outputDirectory = checkNotNull(outputDirectory, "outputDirectory is null");
     }
 
-    private File createOutputFile(String fileName)
+    private static File createOutputFile(String fileName)
             throws IOException
     {
         File outputFile = new File(fileName);
